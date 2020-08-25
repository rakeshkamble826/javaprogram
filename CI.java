import java.util.Scanner;
public class CI {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		double principal=2000;
		double rate=0.08;
		double n=12;
		double time=5;
		double interest= principal (1+rate/n)(n*time)-principal;
	}
}
