package String;

import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "neena";
		int var = s.length();
		String rev = "";
		for (int i = var-1; i >=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		}
		}
  



