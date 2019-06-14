import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collect4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		Set<String> s1=new HashSet<>();
		s1.add("S1");
		s1.add("S2");
		s1.add("S3");
		s1.add("S4");
		s1.add("S5");
		s1.add("S6");
		s1.add("S7");
		if(s1.contains(st))
		{
			System.out.println("Element available");
		}
		else
		{
			System.out.println("Fail");
		}
		/*
		for(String str:s1)
		{
			if(str.equals(st))
			{
				System.out.println(str);
			}
		}
		*/
	}

}
