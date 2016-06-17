import java.util.*;
class student_generic
{
	private String name;
	private int number;
	public void setname(String setname1)
	{
		name = setname1;
	}
	public void setnumber(int number1)
	{
		number = number1;
	}
	public String getname()
	{
		return name;
		
	}
	public int getnumber()
	{
		return number;
	}
}

// the above is  a class implementing setter and getter methods for number and name

class using_generic
{
	public void print( List<? extends student_generic> list)
	{
	for (student_generic elements : list){
		
		System.out.println(elements.getnumber());
	}
	}
}
public class wildcards_extension {

	public static void main(String[] args)
	{
		List<student_generic> arr = new ArrayList<>();
	   student_generic a = new student_generic();
	   a.setname("mangi");
	   a.setnumber(309532);
		arr.add(a);
		using_generic b = new using_generic();
		b.print(arr);
		
		
	}
}
