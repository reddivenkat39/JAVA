

public class parcel<T> {

	private T obj;
	public void setobj(T newobj)
	{
		this.obj = newobj;
	}
	public T getobj()
	{
		return obj;
	}
}
class book
{
	public static void main(String[] args)
	{
		Strin obj = "This is a new object";
		parcel newobj = new parcel();
		newobj.setobj(obj);
		System.out.println(newobj.getobj());
	}
}
