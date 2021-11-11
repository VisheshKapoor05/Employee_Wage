package Employee_Wage;

public class Employee_Wage {
	public static void main(String[] args) {
		
        final int fulltime = 2 ;
        final int partime = 1 ;
        
        int Emphrs = 0;
        double wage;
        double MonthlyWage = 0;
        int WorkingHours = 0;
	    int WorkingDays = 0;


	    while ( WorkingHours<=100 || WorkingDays<=20 )
        {
        	double EmpStatus = Math.floor(Math.random()*10)%3;
        	
        	switch ((int) EmpStatus) {
        	case fulltime:
        		Emphrs=8;
        			//If WorkingHours=96, then 8+96=104 exceeds limit, so condition:
        			if ( WorkingHours == 96 ) break;
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
   
        System.out.println("Monthly wages of Employee is " +MonthlyWage);
	
	}

}
