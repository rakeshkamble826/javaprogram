import java.util.Scanner;


public class GROSSSAL {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float basicsal,hra,da,grosssal;
        
        System.out.println("Enter a basic salary of the employee:");
        basicsal=sc.nextFloat();
        
        if (basicsal<=10000)
        {
        	hra=(basicsal*20)/100;
        	da=(basicsal*80)/100;
        	
        	grosssal=basicsal+hra+da;
        	  System.out.println("Gross salary of the employee:");
        	
        }
        else if (basicsal<=20000)
        {
        	hra=(basicsal*25)/100;
        	da=(basicsal*90)/100;
        	
        	grosssal=basicsal+hra+da;
        	  System.out.println("Gross salary of the employee:");
        	
        }
        else
        {
        	hra=(basicsal*30)/100;
        	da=(basicsal*95)/100;
        	
        	grosssal=basicsal+hra+da;
        	  System.out.println("Gross salary of the employee:");
        }
        System.out.println("Gross salary of the employee:"+grosssal);
}
}