import java.util.ArrayList;
import java.util.Calendar;

public class Developer extends RegularEmployee {
	
	private ArrayList<Project> projects;
	private int numberOfDevelopers;
	
		public Developer(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, 
				String hasDriverLicence, double salary, Calendar hireDate, Department department, double pScore, ArrayList<Project> p) {
			this.projects=p;
			this.numberOfDevelopers++;;
		}
		
		public Developer(RegularEmployee re, ArrayList<Project> p){
			this.projects=p;
			this.numberOfDevelopers++;;
		}
		
		public boolean addProject(Project s) {
			return projects.add(s);
		}
		
		public boolean removeProject(Project s) {
			return projects.remove(s);
		}

		public ArrayList<Project> getProjects() {
			return projects;
		}

		public void setProjects(ArrayList<Project> projects) {
			this.projects = projects;
		}

		public int getNumberOfDevelopers() {
			return numberOfDevelopers;
		}

		public void setNumberOfDevelopers(int numberOfDevelopers) {
			this.numberOfDevelopers = numberOfDevelopers;
		}

		@Override
		public String toString() {
			return "Developer [projects=" + projects + ", numberOfDevelopers=" + numberOfDevelopers + "]";
		}
}
