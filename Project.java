import java.util.Calendar;

public class Project {
	private String projectName;
	private java.util.Calendar startDate;
	private boolean state;
	
		public Project(String projectName,String state) {
			this.projectName=projectName;
			
			setState(state);
		}
		
		public void setState(String state) {
			if(state.equalsIgnoreCase("Open"))
				this.state=true;
			if(state.equalsIgnoreCase("Close"))
				this.state=false;
		}
		
		public String getState() {
			if(state==true) 
				return "Open";
			if(state==false) 
				return "Close";
			return "";
			
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Calendar getStartDate() {
			return startDate;
		}

		public void setStartDate(Calendar startDate) {
			this.startDate = startDate;
		}

		@Override
		public String toString() {
			return "Project [projectName=" + projectName + ", startDate=" + startDate + ", state=" + state + "]";
		}
		
		public void close() {
			setState("Close");
		}
		

}
