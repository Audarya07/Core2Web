class DailyFlash{
	void pattern1(){
		for(int outer=1;outer<=5;outer++){
			char ch='C';
			for(int inner=1;inner<=outer;inner++){
				System.out.print(ch+" ");
				ch+=4;
			}	
			System.out.println();
		}
	}
	void pattern2(){
		int space;
		  for(int outer=1;outer<=4;outer++){
			  char ch='A';
			for( space=1;space<outer;space++)
				System.out.print(" "+" ");
			
			for(int inner=space;inner<=4;inner++)
				System.out.print(ch++ +" ");
                        
			System.out.println();
		}
            }
        	
	
	void pattern3(){
			int n=1;
			int ans=n;
                  	for(int outer=1;outer<=4;outer++){
				int flag=0;
                        	for(int inner=1;inner<=outer;inner++){
					while(true){
						if(n%2!=0){
							flag=1;
							break;
						}
						else
							n++;
					}
					ans=ans+n;
					if(flag==1)
						n++;
                                	System.out.print(ans+" ");
                        }
                       		System.out.println();
                        }
                }
	
	void pattern4(){
		for(int outer=1;outer<=5;outer++){
			for(int inner=1;inner<=outer;inner++){
				System.out.print((inner%2==0)?"0 ":"1 "  );

			}
			System.out.println();
		}
	}
	void pattern5(){
		for(int outer=1;outer<=10;outer++){
			for(int inner=1;inner<=5;inner++){
				if((inner+outer)<=6 || (outer-inner)>=5)
					if(outer<=5)
						System.out.print("= ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		DailyFlash d=new DailyFlash();
		System.out.println("Program1: ");
		d.pattern1();

		System.out.println("Program2: ");
		d.pattern2();
		
		System.out.println("Program3: ");
		d.pattern3();
		


		System.out.println("Program4: ");
		d.pattern4();

		

		System.out.println("Program5: ");
		d.pattern5();

	}
}
