package Employee_Wage;

public class Employee_Wage {
	public static void main(String[] args) {
		int present = 1 ;
	    double wage;
            double EmpStatus = Math.floor(Math.random()*10)%2;
            if ( EmpStatus == present )
               {
		 wage = (20*EmpStatus)*8 ;
                 System.out.println("Employee is present and Today's Wage is " +wage);
               }
            else
                System.out.println("Employee is absent and Today's wage is 0");
	}

}
