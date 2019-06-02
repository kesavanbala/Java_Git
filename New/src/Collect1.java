import java.util.ArrayList;
import java.util.Arrays;

public class Collect1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(25);
		al.add(11);
		al.add(45);
		al.add(16);
		al.add(25);
		al.add(10);
		al.add(9);
		al.add(111);
		
		Object[] a=al.toArray();
		String st=Arrays.toString(a);	
		System.out.println(st);
		/*
		for(Object i:a)
		{
			System.out.println(i);
		}
		
*/		}
	

}
