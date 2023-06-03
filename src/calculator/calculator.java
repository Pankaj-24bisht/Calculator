package calculator;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		
		
		
		int choice=0;
		System .out.println("enter two no");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		
		
		do{
			System.out.println("1- addition");
			System.out.println("2- division");
			System.out.println("3- multiplication");
		}
		while(choice!= 4) {
          
			System.out.println("enter your choice");
			choice=sc.nextInt();
			
            switch(choice){
			
			case '1': add(a,b);
			break;
			
			case '2': add(a,b);
			break;
			
			case '3': add(a,b);
			break;
			 
			case '4': add(a,b);
			break;
			
		}
		
		}	
		
			
		
		
		System.out.println("addition of two no is: "+ add(a,b));
		
		System.out.println("subtraction of two no is: "+ sub(a,b));
		
		System.out.println("multiplication of two no is: "+ multi(a,b));
	}
	
	public static int add(int a,int b) {
		 return (a+b);
	}

	
	public static int sub(int a,int b) {
		 return (b-a);
	}
	
	
	public static int multi(int a,int b) {
		 return (a*b);
	}
}
