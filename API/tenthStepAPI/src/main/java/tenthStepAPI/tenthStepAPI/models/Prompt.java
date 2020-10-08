package tenthStepAPI.tenthStepAPI.models;

public class Prompt {
	
	private int promptId;
	private int formId;
	private String prompt;
	
	public int getPromptId() {
		return promptId;
	}
	
	public void setPromptId(int promptId) {
		this.promptId = promptId;
	}
	
	public int getFormId() {
		return formId;
	}
	
	public void setFormId(int formId) {
		this.formId = formId;
	}
	
	public String getPrompt() {
		return prompt;
	}
	
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

}
