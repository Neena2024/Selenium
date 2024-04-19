package Day01;

public class Constructor {
	private int id;    //declaration
	private String name;
	
	public Constructor (String name, int id) //initialization
	{
		this.name=name;
		this.id=id;
	}
	
	public void name () 
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor d = new Constructor("neena",100);
System.out.println(d.id);
System.out.println(d.name);
	}

}
