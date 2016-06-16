class method_generic
{
	private static String name;
	
	static
	{
		System.out.println(name);
	}
	public <X,T> void getname(T number,X name)
	{
	 System.out.println(number+" "+name);
	}
}
public class generic_method {

	public static void main(String[] args)
	{
		method_generic mg = new method_generic();
	mg.getname("Hello",1);
		mg.getname(1,"hello");
	}
}
