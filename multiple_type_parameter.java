
class generic<T>
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

class new_generic<X,T> extends generic<T>
{
	private X number;
	public void setnumber(X newnumber)
	{
		this.number = newnumber;
	}
	public X getnumber()
	{
		return number;
	}
}
public class multiple_type_parameter {

	public static void main(String[] args)
	{
	new_generic<Integer,String> students = new new_generic<Integer,String>();
		//We cannot use primitive data types for generic.
		
	students.setname("mangi");
	students.setnumber(309532);
	System.out.println(students.getname()+" "+students.getnumber());
	}
}
