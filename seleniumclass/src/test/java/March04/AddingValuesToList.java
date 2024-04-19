package March04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddingValuesToList {

	public static void main(String[] args) {
List<String> allList = new ArrayList<String>();
allList.add("A");  //To add index values
allList.add("B");
allList.add("C");

System.out.println(allList.get(0)); //Printing the index values
System.out.println(allList.get(1));
System.out.println(allList.get(2));  

allList.remove(0);
System.out.println("---------------------");
allList.size();
// for (int i = 0; i <=3; i++) 
for (int i = 0; i <=allList.size()-1; i++) 
{
	System.out.println(allList.get(i));

}
	}

}
