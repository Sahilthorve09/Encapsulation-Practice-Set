
public class Employee {
	
	public static void main(String[] args) {
		EmployeeDetails data = new EmployeeDetails();
		data.setEmpId(5646);
		data.setEmpName("XYZ");
		data.setSalary(20000);
		
		System.out.println("Employee Id: "+data.getEmpId());
		System.out.println("Employee Name: "+data.getEmpName());
		System.out.println("Salry Of Employee: "+data.getSalary());
		
	}
	
}
