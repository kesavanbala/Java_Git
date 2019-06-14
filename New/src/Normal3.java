
public class Normal3 {

	public static void main(String[] args) {

		String str="fguecbldavwyx";
		String[] stArr= {"apple","ball","egg","food"};
		String[] st=new String[stArr.length];
		int index=0;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<stArr.length;j++)
			{
				if(Character.toString(str.charAt(i)).equals(Character.toString(stArr[j].charAt(0))))
						{
					st[index]=stArr[j];
					index++;
					
						}
			}
		}

		for (String s : st) {
			System.out.print(s+ " ");
		
		
	}

}
}
