package Employee_Wage;

public class Employee_Wage {
	public static void main(String[] args) {
		int present = 1 ;
	    double EmpStatus = Math.floor(Math.random()*10)%2;
	    if ( EmpStatus == present )
		System.out.println("Employee is present");
	    else
		System.out.println("Employee is absent");
	}

}
