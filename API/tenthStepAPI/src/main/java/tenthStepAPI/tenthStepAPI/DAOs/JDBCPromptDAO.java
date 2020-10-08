package tenthStepAPI.tenthStepAPI.DAOs;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import tenthStepAPI.tenthStepAPI.models.Prompt;

@Component
public class JDBCPromptDAO implements PromptDAO {
	
	private JdbcTemplate promptTemplate;
	
	public JDBCPromptDAO(DataSource dataSource) {
		promptTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Prompt> getPromptsByFormId(int id) {
		List<Prompt> prompts = new ArrayList<>();
		String sql = "SELECT * FROM prompt WHERE form_id = ?";
		SqlRowSet results = promptTemplate.queryForRowSet(sql, id);
		while(results.next()) {
			Prompt retrievedPrompt= new Prompt();
			prompts.add(retrievedPrompt);
			retrievedPrompt.setPromptId(results.getInt("prompt_id"));
			retrievedPrompt.setFormId(results.getInt("form_id"));
			retrievedPrompt.setPrompt(results.getString("prompt"));
		}
		return prompts;
	}

}
