package tenthStepAPI.tenthStepAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tenthStepAPI.tenthStepAPI.DAOs.FormDAO;
import tenthStepAPI.tenthStepAPI.DAOs.PromptDAO;
import tenthStepAPI.tenthStepAPI.models.Form;
import tenthStepAPI.tenthStepAPI.models.Prompt;

@RestController 
@CrossOrigin
public class FormController {
	
	@Autowired
	FormDAO formDAO;
	
	@Autowired
	PromptDAO promptDAO;

	@GetMapping("/form")
	public List<Form> getAllForms() {
		List<Form> allForms = formDAO.getAllForms();
		for (Form form: allForms) {
			List<Prompt> prompts = promptDAO.getPromptsByFormId(form.getFormId());
			form.setPrompts(prompts);
		}
		return allForms;
	}
}
