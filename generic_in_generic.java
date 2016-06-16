class generic_student<T,T1,T2>
{
	private T name;
	private T1 number;
	private T2 percentage;
	
	public void setvalues(T newname, T1 newnumber, T2 newpercentage)
	{
		name = newname;
		number = newnumber;
		percentage = newpercentage;
	}
	
	public void oldvalues()
	{
		System.out.println(name);
		System.out.println(number);
		System.out.println(percentage);
	}
	public<S,S1,S2> void newvalues(S newname,S1 newnumber, S2 newpercentage)
	{
		System.out.println(newname);
		System.out.println(newnumber);
		System.out.println(newpercentage);
	}
}
public class generic_in_generic {

	public static void main(String[] args)
	{
		generic_student<String,Integer,Double> student = new generic_student<>();
		student.setvalues("mangi",309, 80.0);
		student.oldvalues();
		student.newvalues(80.00, "mangi", 309);
	}
}
