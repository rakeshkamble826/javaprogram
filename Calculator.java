import java.util.Scanner;


public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two number:");
		double first=sc.nextDouble();
		double Second=sc.nextDouble();
		
		System.out.println("Enter an operator(+,-,*,/):");
		char operator=sc.next().charAt(0);
		
		double result;
		switch (operator)
		{
		 case '+':
			 result=first+Second;
			 break;
			 
		 case '-':
			 result=first-Second;
			 break;
			 
		 case '*':
			 result=first*Second;
			 break; 
			 
		 case '/':
			 result=first/Second;
			 break; 	 
			 
			 default:
				 System.out.println("Error!operator is not correct"); 
				 return;
				 
				 System.out.println("%.1f %c %.1f=%.1f",first,operator,Second,result); 
				 
			 
			 
			 
			 
			 
			 
		}
}
}	
