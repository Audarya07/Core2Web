import java.io.*;

class EmployeeDetails {

	int a = 10;
	String b = "Audi";
	float c = 20.4f;
	char d = 'a';

	EmployeeDetails(int empNum, String empName, int contactNum, String addr) {
		System.out.println("===============================");
		System.out.println("Employee number = " + empNum);
		System.out.println("Employee name = " + empName);
		System.out.println("Contact number = " + contactNum);
		System.out.println("Address = " + addr);
		System.out.println("===============================");
	}

}

class MainDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of employees:");
		int num = Integer.parseInt(br.readLine());
		EmployeeDetails[] obj = new EmployeeDetails[num];
		

		System.out.println("-----------------------------");

		for (int i = 0; i < num; i++) {
			System.out.println("Enter details of employee" + (i+1) + ": ");
			
			System.out.println("Enter employee number:");
			int empNum = Integer.parseInt(br.readLine());
			
			System.out.println("Enter contact number:");
			int contactNum = Integer.parseInt(br.readLine());

			System.out.println("Enter employee name:");
			String empName = br.readLine();

			System.out.println("Enter address:");
			String addr = br.readLine();

			obj[i] = new EmployeeDetails(empNum, empName, contactNum, addr);
		}

	}

	
}