package Employee_Wage;

public class Employee_Wage {
	public static void main(String[] args) {
		
        final int fulltime = 2 ;
        final int partime = 1 ;
        
        int Emphrs = 0;
        double wage;
        double MonthlyWage = 0;
        for (int i=0;i<=20;i++)
        {
        	double EmpStatus = Math.floor(Math.random()*10)%3;
        	
        	switch ((int) EmpStatus) {
        	case fulltime:
        		Emphrs=8;
        		break;
        	case partime:
        		Emphrs=4;
        		break;
        	default:
        		Emphrs=0;
        	}
            
        	wage = (20*EmpStatus)*Emphrs ;
        	MonthlyWage = MonthlyWage + wage ;
        }
   
        System.out.println("Monthly wages of Employee is " +MonthlyWage);
	
	}

}
