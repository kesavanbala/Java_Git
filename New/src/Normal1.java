import java.util.Scanner;

public class Normal1 {

	public static void main(String[] args) {
		int f1=1;
		int f2=1;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(sum<num)
		{
			sum=f1+f2;
			
			System.out.print("  "+f1);
			f2=f1;
			f1=sum; 
		
			
		}
		
			}

}
