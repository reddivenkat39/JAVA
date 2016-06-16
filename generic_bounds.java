class b
{
	public String name = null;
	public void setname(String setname1)
	{
		name = setname1;
	}
	public String getname()
	{
		return name;
	}
}

class newbook<T extends b>
{
	T t;
	newbook(T t)
	{
	this.t = t;
	}
	public void setname_newbook(String setname1)
	{
		t.setname(setname1);
	}
	public void print()
	{
		System.out.println(t.getname());
	}
}
public class generic_bounds {
public static void main(String[] args)
{

	
newbook<b> nb = new newbook<>(new b());
nb.setname_newbook("hello");
nb.print();
}
}
