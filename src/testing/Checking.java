package testing;

public class Checking {

	public String check(String st) {
		StringBuilder str=new StringBuilder(st);
		if(st.charAt(0)=='A' && st.charAt(1)=='A')
		{
			str.delete(0,1);
			
		}
		if(st.charAt(0)=='A')
		{
			str.deleteCharAt(0);
		}
		else {
			if(st.charAt(1)=='A')
			{
				str.deleteCharAt(1);
			}
		}
		return str.toString();
	}
	

}
