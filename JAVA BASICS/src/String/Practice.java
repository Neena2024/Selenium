package String;
public class Practice {
	public static void main(String[] args) {
		String s = "Radar";
		int var = s.length();
		String rvr = " ";
		for (int i =var-1;i>=0;i--)
		{
		rvr = rvr+s.charAt(i);
		}
		System.out.println(rvr);
	}
	}