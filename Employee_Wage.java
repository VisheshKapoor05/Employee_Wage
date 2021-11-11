package Employee_Wage;

public class Employee_Wage {
	public static void main(String[] args) {

		int fulltimehours = 8;
        int fulltime = 2 ;

        int partime = 1 ;
        int partimehours = 4 ;

        double wage;
        double EmpStatus = Math.floor(Math.random()*10)%3;
        if ( EmpStatus == fulltime )
           {
             wage = (20*EmpStatus)*fulltimehours ;
             System.out.println("Employee is doing fulltime and Today's Wage is " +wage);
           }
        else if ( EmpStatus == partime )
        {
        	wage = (20*EmpStatus)*partimehours ;
             System.out.println("Employee is doing part-time and the wage is " +wage);
        }
        else
            System.out.println("Employee is doing absent and so wage is 0");
	}

}
