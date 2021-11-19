package Employee_Wage;

import java.util.ArrayList;

public class CompanyEmpWage {
	
    private /*final*/ int max_working_hours;
    private int max_working_days;
	String company_name;
	int MonthlyWage;

	public CompanyEmpWage(String company_name, int max_working_hours, int max_working_days) {
		this.max_working_hours = max_working_hours;
		this.max_working_days = max_working_days;
		this.company_name = company_name;
	}
	
	public int emp_wage_builder() {
		EmpWageComputation empwage = new EmpWageComputation();
		empwage.computing_employee_wage(company_name, max_working_hours, max_working_days);
		MonthlyWage = empwage.getMonthlyWage();
		return MonthlyWage;
	}
	
	@Override
	public String toString() {
		return "Employee_Wage [max_working_hours=" + max_working_hours + ", max_working_days=" + max_working_days
				+ ", company_name=" + company_name + "]";
	}

}
