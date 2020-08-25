import java.util.Scanner;
public class forloop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,power,result=i;
	
		System.out.println("Enter the number:");
		number=sc.nextInt();
		
		System.out.println("Enter the power:");
		power=sc.nextInt();
		
		for (i=1;i<power;i++)
		{result=result*number;
		System.out.println("the result is:"+result);
		
		}
}
}