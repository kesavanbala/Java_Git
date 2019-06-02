import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Collect {

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
		System.out.println(al);
		Set<Integer> st=new HashSet();
		for(int i:al)
		{
			if(st.add(i))
			{
				System.out.println("Set success");
			}
			else
			{
				System.out.println(i);
			}
		}
		

	}

}
