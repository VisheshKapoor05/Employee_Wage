package Employee_Wage;

public class Get_Employee_Wage {

	public static void main(String[] args) {
		
		Employee_Wage emp_wage = new Employee_Wage();
		int MonthlyWage = emp_wage.computing_employee_wage();
		System.out.println("Monthly Wages: " +MonthlyWage);

	}

}
