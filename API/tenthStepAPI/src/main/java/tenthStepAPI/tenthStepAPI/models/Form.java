package tenthStepAPI.tenthStepAPI.models;

import java.sql.Date;
import java.util.List;

public class Form {

		private int formId;
		private String owner;
		private String title;
		private Date date;
		private List<Prompt> prompts;
		
		public int getFormId() {
			return formId;
		}
		
		public void setFormId(int formId) {
			this.formId = formId;
		}
		
		public String getOwner() {
			return owner;
		}
		
		public void setOwner(String owner) {
			this.owner = owner;
		}
		
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
		
		public Date getDate() {
			return date;
		}
		
		public void setDate(Date date) {
			this.date = date;
		}

		public List<Prompt> getPrompts() {
			return prompts;
		}

		public void setPrompts(List<Prompt> prompts) {
			this.prompts = prompts;
		}
		
		
}
