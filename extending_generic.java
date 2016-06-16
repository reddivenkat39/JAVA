

class name<T>
{
	private T name = null;
	public void setname(T newname)
	{
		this.name = newname;
	}
	public T getname()
	{
		return name;
	}
}

class Student<T> extends name<T>
{
	private T rollnumber = null;
	
	public void setrollnumber(T newroll)
	{
		this.rollnumber = newroll;
	}
	
	public T getrollnumber()
	{
		return rollnumber;
	}
}

public class extending_generic {
public static void main(String[] args)
{
Student<String> newstudent = new Student<String>();

newstudent.setname("venkat");
newstudent.setrollnumber("309532");

// printing

System.out.println(newstudent.getname()+" "+ newstudent.getrollnumber());
}
}
