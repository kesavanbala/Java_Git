import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Collect3 {

	public static void main(String[] args) {
		List<String> lt=Arrays.asList("Tamil","English","Maths","Scince","SS");
		Iterator nx=lt.iterator();
			
		{
			while(nx.hasNext())
			{
				System.out.println(nx.next());
			}
		}
		
		
	}

}
