import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Collection7 {

	public static void main(String[] args) {
		String str="fguecbldavwyx";
		String[] stArr= {"apple","ball","egg","food"};
		
		
		String[] strArr1 = new String[stArr.length];
		int index = 0;
		
		for(int i=0;i<str.length();i++)
		{
			//char c=str.charAt(i);
			for(int j=0; j <stArr.length;j++) {
				if ((Character.toString(str.charAt(i)).equalsIgnoreCase(Character.toString(stArr[j].charAt(0))))){
					strArr1[index] = stArr[j];
					index++;
				}
			}
			
			
		}
		
		for (String s : strArr1) {
			System.out.print(s+ " ");
		}
		
}
}