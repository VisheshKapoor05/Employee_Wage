package Employee_Wage;

import java.util.Scanner;

public class Get_Employee_Wage {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total number of companies: ");
		int Num_of_companies = sc.nextInt();
		
		for(int i=0; i<Num_of_companies; i++)
		{
			System.out.print("Company Name: ");
			String Company_Name = sc.next();
			
			System.out.print("Max Working hours: ");
			int Max_Working_Hours = sc.nextInt();
			
			System.out.print("Max Working Days: ");
			int Max_Working_Days = sc.nextInt();
			
			Employee_Wage company1 = new Employee_Wage(Company_Name, Max_Working_Hours, Max_Working_Days);
			int MonthlyWage = company1.computing_employee_wage();
			System.out.println("Company:" +Company_Name);
			System.out.println("Monthly Wages: " +MonthlyWage);
		}
		
	}

}
