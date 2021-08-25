package bridgelabz;

public class EmployyeeWage {

	//checking method
		public void empPresntCheck() {
			double empCheck = Math.floor(Math.random()*10)%2;
			if(empCheck==0) {
				System.out.println("Employee Present");
			}
			else {
				System.out.println("Employee absent");
			}
		}
		
		//main method
		public static void main(String[] args) {
			EmployyeeWage obj=new EmployyeeWage();
			obj.empPresntCheck();
			
		}

}
