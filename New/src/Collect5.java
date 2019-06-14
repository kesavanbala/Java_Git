import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collect5 {

	public static void main(String[] args) {
		Map<String,Integer> mymap=new HashMap<>();
		mymap.put("no1", 1);
		mymap.put("no2", 2);
		mymap.put("no3", 3);
		mymap.put("no4", 4);
		mymap.put("no5", 5);
		//System.out.println(mymap);
		Set<String> aa=mymap.keySet();
		//System.out.println(aa);
		Set<Entry<String, Integer>> ll=mymap.entrySet();
		System.out.println(ll);

	}

}
