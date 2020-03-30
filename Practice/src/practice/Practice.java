package practice;

import java.util.Scanner;


	class Practice{
		
				
		static Scanner sc =new Scanner(System.in);
		static int B =sc.nextInt();
		static int H =sc.nextInt();
		static boolean flag;
	static{
		 
		if(B>=0 && H>=0){
		flag=true;
	}else if(B<=0 && H<=0){
		
		try {
			throw new Exception("Breadth and height must be positive");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
		

public static void main(String[] args) throws Exception{
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
		
		
	}//end of main

}//end of class




