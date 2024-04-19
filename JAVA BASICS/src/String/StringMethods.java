package String;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Neena";
System.out.println(s.length());


String s1 = "    Selenium clas   ";
System.out.println(s1.trim());

String s2 = " Hello World";
System.out.println(s2.toLowerCase());
System.out.println(s2.toUpperCase());
	
String s3= " Neena";
System.out.println(s3.startsWith(" Ne"));
System.out.println(s3.endsWith("a"));

String s4="SeleniumJavaClass";
System.out.println(s4.charAt(0));

String s5 = "Hello";
char a = s5.charAt(0);
System.out.println(a);


String sa= "hello";
String b = "world";
String c = sa.concat(b);
System.out.println(c);


String world1 = "Selenium Class  test one";
String[] result = world1.split(" ");
for (String str : result) {
System.out.println(str);
	// To print the entire words System.out.println(result[1]);
	 
	 
String s6="22155@#$#@$Hello#$@#$#@";
String print = s6.replaceAll("[^a-zA-z]","");  // to get only alphabets
String print1 = s6.replaceAll("[^0-9]","");  // to get numbers alone
String print2 = s6.replaceAll("[^A-Z]","");  // to get both numbers
System.out.println(print);

}
	}
}
	


