import java.util.Scanner;

public class SCA {
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int number1,number2,result;
		
		System.out.println("Enter the value of number1:");
		number1=scanner.nextInt();
		
		System.out.println("Enter the value of number2:");
		number2=scanner.nextInt();
		
		result=number1+number2;
		
		System.out.println("The sum of given two number is:"+result);
	
	}
	

}
