import java.util.*;
class student_generic<T>

{
private T name;
public void setname(T name1)
{
	name = name1;
}
public T getname()
{
	return name;
}
}


public class wildcard {

	public static void main(String[] args)
	{
	student_generic<String> sgname = new student_generic<>();
	List<?> lsname1 = new ArrayList<>();
	sgname.setname("mangi");
	//lsname1.add("mangina");
	//causes ambiguity and doesnt compile
	
	}
}
