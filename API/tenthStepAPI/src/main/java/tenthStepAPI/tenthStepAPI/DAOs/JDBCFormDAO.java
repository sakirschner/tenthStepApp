package tenthStepAPI.tenthStepAPI.DAOs;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import tenthStepAPI.tenthStepAPI.models.Form;

@Component
public class JDBCFormDAO implements FormDAO {

	private JdbcTemplate formTemplate;
	
	public JDBCFormDAO(DataSource dataSource) {
		formTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Form> getAllForms() {
		List<Form> allForms = new ArrayList<>();
		String sql = "SELECT * FROM form";
		SqlRowSet results = formTemplate.queryForRowSet(sql);
		while(results.next()) {
			Form retrievedForm = new Form();
			retrievedForm.setFormId(results.getInt("form_id"));
			retrievedForm.setOwner(results.getString("owner"));
			retrievedForm.setTitle(results.getString("title"));
			retrievedForm.setDate(results.getDate("date"));
			allForms.add(retrievedForm);
		}
		return allForms;
	}
}
