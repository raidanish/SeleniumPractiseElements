package streemKnowledge;

import java.util.ArrayList;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<>();
		names.add("ALi");
		names.add("muhammad");
		names.add("danish");
		names.add("asif");
		names.add("Allah");
		
		int count=0;
		
		for(int i =0; i<names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.print(count);
		
	}
	
	

}
