package bridgelabz;

public class EmployyeeWage {
	
	/*UC1
	 *Checking method 
	 */
		public double empPresntCheck() {
			double empCheck = Math.floor(Math.random()*10)%3;
			if(empCheck==0) {
				System.out.println("Employee Present");
			}
			else if(empCheck==2) {
				System.out.println("Employee is part time");
			}
			else {
				System.out.println("Employee absent");
			}
			return empCheck;
		}
		
		/*
		 * full time employee Wage
		  UC2
		  */
		public void dailyWageEmployee(double check) {
			int wage=20;
			int hour=8;
			if(check==0) {
				int dailyWage=wage*hour;
				System.out.println("Daily wage : "+ dailyWage);
			}
		}
		
		/*
		 * UC3
		 * Part time employee wage
		 */
		public void partTimeEmployeeWage(double check) {
			int wage=20;
			int hour=4;
			if(check==2) {
				int dailyWage=wage*hour;
				System.out.println("Daily wage : "+ dailyWage);
			}
		}
				
		//main method
		public static void main(String[] args) {
			EmployyeeWage obj=new EmployyeeWage();
			double check=obj.empPresntCheck();
			obj.dailyWageEmployee(check);
			obj.partTimeEmployeeWage(check);
			
		
		}

}
