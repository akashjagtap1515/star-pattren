package arrStrinPract;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_words {

	public static void main(String[] args) {
		
String s = "i am akash and i am tester";

String []words = s.split(" ");

Map<String,Integer> hm= new HashMap<>();
for (String w1 : words)
{
	if(hm.get(w1)== null)
		hm.put(w1,1);
	else
		hm.put(w1, hm.get(w1)+1);
}
System.out.println(hm);
	
	
	
	}

}
