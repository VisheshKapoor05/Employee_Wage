package Employee_Wage;

public class Employee_Wage {
	
	final int fulltime = 2 ;
	final int partime = 1 ;
    private /*final*/ int max_working_hours;
    private int max_working_days;
	private String company_name;
    
    int Emphrs = 0;
    int wage=0;
    int MonthlyWage = 0;
    int WorkingHours = 0;
    int WorkingDays = 0;
    
	
	public Employee_Wage(String company_name, int max_working_hours, int max_working_days) {
		this.max_working_hours = max_working_hours;
		this.max_working_days = max_working_days;
		this.company_name = company_name;
	}

	public int computing_employee_wage(){
		    
	    while ( WorkingHours<=max_working_hours && WorkingDays<=max_working_days ) {
        	int EmpStatus = (int) Math.floor(Math.random()*10)%3;
        	
        	switch (EmpStatus) {
        	case fulltime:
        		Emphrs=8;
        		
        		//If WorkingHours=96, then 8+96=104 exceeds limit, so condition:
        		if ( WorkingHours == 96 ) { 
        			break;
        		}
        		break;
        		
        	case partime:
        		Emphrs=4;
        		break;
        	default:
        		Emphrs=0;
        	}
            
        	wage = (20*EmpStatus)*Emphrs ;
        	MonthlyWage = MonthlyWage + wage ;
        	WorkingDays++;
        }
	    return MonthlyWage;
	}

}
