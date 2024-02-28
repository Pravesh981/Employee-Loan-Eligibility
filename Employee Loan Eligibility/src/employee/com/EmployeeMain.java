package employee.com;

public class EmployeeMain {
	  public static void main(String[] args) {
	        PermanentEmployee permanentEmployee = new PermanentEmployee(123, "Saksham", 1123234);
	        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(112, "dubey",6,100);

	        Loan loan = new Loan();
	        double permanentEmployeeLoan = loan.calculateLoanAmount(permanentEmployee);
	        double temporaryEmployeeLoan = loan.calculateLoanAmount(temporaryEmployee);

	        System.out.println(permanentEmployeeLoan);
	        System.out.println(temporaryEmployeeLoan);
	    }
}
