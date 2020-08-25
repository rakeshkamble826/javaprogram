import java.util.Scanner;


public class Voweldemo {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         char alphabet;

         System.out.println("Enter an alphabet:");
         alphabet=sc.next().charAt(0);
         
         if((alphabet =='a') || (alphabet =='e') || (alphabet =='i')||(alphabet =='o')||(alphabet =='u'))
         {
        System.out.println(alphabet+" is a vowel");
         }
         else
         {
        	 System.out.println(alphabet+" is a consonant");
         }
         System.out.println(alphabet);
	}
}