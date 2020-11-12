import java.util.*;

class Demo {
	
	int v1 = 10;
	
	void display(){
		System.out.println("In display");
	}
}

class  Main {
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
		Demo d5 = new Demo();
		Demo d6 = new Demo();
		Demo d7 = new Demo();
		Demo d8 = new Demo();
		Demo d9 = new Demo();

		Demo darr[] = new Demo[10];
		darr[0] = d;
		darr[1] = d2;
		darr[2] = d2;
		darr[3] = d3;
		darr[4] = d4;
		darr[5] = d5;
		darr[6] = d6;
		darr[7] = d7;
		darr[8] = d8;
		darr[9] = d9;
		for(int i =0 ; i < 10; i++){
			System.out.println(darr[i]);
		}
	}
}