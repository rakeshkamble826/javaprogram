import java.util.Scanner;


public class Powerdemo {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int number,power,result=1,i;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        
        System.out.println("Enter a power:");
        power=sc.nextInt();
        
        
        
        for (i=1;i<=power;i++)
        {
        	result=result*number;
        }
        System.out.println("The result is:"+result);
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
	}

}
