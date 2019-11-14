package sivaramexamples;

public class Employeedemo {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setCompanyName("HCL");
		emp1.setEmployeeId(111);
		emp1.setEmployeeName(new StringBuilder("Sivaram"));
		emp1.setEmployementStatus(true);
		emp1.setEmployeeSalary(50000.00f);
		
		Employee emp2=new Employee();
		emp1.setCompanyName("HCL");
		emp1.setEmployeeId(112);
		emp1.setEmployeeName(new StringBuilder("Jogi"));
		emp1.setEmployementStatus(true);
		emp1.setEmployeeSalary(50000.00f);
		
		if(emp1.compareTo(emp2)==0) {
			System.out.println("Both object employeeId are equal");
		}else
		{
			System.out.println("Both object employeeId are not equal");
		}
	}
}
