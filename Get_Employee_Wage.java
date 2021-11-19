package Employee_Wage;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Employee_Wage {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total number of companies: ");
		int Num_of_companies = sc.nextInt();
		
		//CompanyEmpWage[] companies_data = new CompanyEmpWage[Num_of_companies];
		ArrayList<CompanyEmpWage> companies_data = new ArrayList<>();
		for(int i=0; i<Num_of_companies; i++)
		{
			System.out.print("Company Name: ");
			String Company_Name = sc.next();
			
			System.out.print("Max Working hours: ");
			int Max_Working_Hours = sc.nextInt();
			
			System.out.print("Max Working Days: ");
			int Max_Working_Days = sc.nextInt();
			
			CompanyEmpWage company = new CompanyEmpWage(Company_Name, Max_Working_Hours, Max_Working_Days);
			int MonthlyWage = company.emp_wage_builder();
			companies_data.add(company);
			
			System.out.println("Company:" +Company_Name +" and Monthly Wage: " +MonthlyWage);
		}
		
		for(int i=0; i<Num_of_companies; i++) {
			System.out.println(companies_data.get(i));
		}
		
		System.out.print("Company Name to get total wage: ");
		String Company_Name = sc.next();
		totalWage(companies_data, Company_Name);
		
	}
	
	public static void totalWage(ArrayList<CompanyEmpWage> companies_data, String Company_Name ) {
		for(int i=0; i<companies_data.size(); i++) {
			String index = companies_data.get(i).company_name;
			if(index.equals(Company_Name)) {
				System.out.println("Total Wage: " +companies_data.get(i).MonthlyWage);
			}
		}
	}

}
