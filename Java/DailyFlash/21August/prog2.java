import java.io.*;

class Prog2{

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter no. of units : ");
		int unit = Integer.parseInt(br.readLine());
		float cost = 0f;
		if(unit <= 50){
			cost = unit * 0.5f;
		}
		else if(unit <= 150){
			cost = (50 * 0.5f) + (unit - 50)*0.75f;	
		}
		else if(unit <= 250){
			cost = (50 * 0.5f) + 100*0.75f + (unit - 150)*1.2f;	
		}
		else
			cost = unit * 1.5f;

		System.out.println("Bill generated : " + cost);
	}
}