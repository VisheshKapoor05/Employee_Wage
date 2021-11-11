package Employee_Wage;

public class Employee_Wage {
	public static void main(String[] args) {
		final int fulltime = 2 ;      
        final int partime = 1 ;        
        int Emphrs;
        double wage;
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
        System.out.println("Employee Wage is " +wage);
	}

}
