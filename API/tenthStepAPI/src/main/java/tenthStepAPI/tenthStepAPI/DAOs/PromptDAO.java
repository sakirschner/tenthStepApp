package tenthStepAPI.tenthStepAPI.DAOs;

import java.util.List;

import tenthStepAPI.tenthStepAPI.models.Prompt;

public interface PromptDAO {
	
	public List<Prompt> getPromptsByFormId(int id);

}
