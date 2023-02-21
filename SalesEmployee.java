import java.util.ArrayList;
import java.util.Calendar;

public class SalesEmployee extends RegularEmployee {
	private ArrayList<Product> sales;
	
	public SalesEmployee(Employee employee, double perfScore) {
		super(employee, perfScore);
		
	}
	
	public SalesEmployee(int id, String firstName, String lastName, String gender, Calendar birthDate, String maritalStatus, 
			String hasDriverLicence, double salary, Calendar hireDate, Department department, double pScore, ArrayList<Product> s) {
		this.sales=s;
	}
	
	public SalesEmployee(RegularEmployee re, ArrayList<Product> s) {
		this.sales=s;
	}
	
	public boolean addSale(Product s) {
		return sales.add(s);
	}
	
	public boolean removeSale(Product s) {
		 return sales.remove(s);
	}

	@Override
	public String toString() {
		return "SalesEmployee [sales=" + sales + "]";
	}

	public ArrayList<Product> getSales() {
		return sales;
	}

	public void setSales(ArrayList<Product> sales) {
		this.sales = sales;
	}

}
