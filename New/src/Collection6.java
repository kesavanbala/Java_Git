import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection6 {

	public static void main(String[] args) {
		int[] a= {99,76,10,24,58,65,25};
		Arrays.sort(a);
		List<Integer> l=new ArrayList<>();
		for(int i:a)
		{
			l.add(i);
		}
		
		System.out.println(l);

	}

}
