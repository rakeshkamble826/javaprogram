import java.util.Scanner;


public class Principal {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double principal,time,rate,ci;
        System.out.println("Enter principal:");
        principal=sc.nextDouble();
        
        System.out.println("Enter time:");
        time=sc.nextDouble();
        
        System.out.println("Enter rate:");
        rate=sc.nextDouble();
        
        ci= principal*(Math.pow((1+rate/100),time));
        System.out.println("ci:");
        
	}

}
