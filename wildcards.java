import java.util.*;
class printing_lists
{
	public void print(List<?> list)
	{
		for(Object element : list)
		{
			System.out.println(element);
		}
	}
}
public class wildcards {

	public static void main(String[] args)
	{
	printing_lists np = new printing_lists();
	List<String> list1 = new ArrayList<>();
	list1.add("one");
	list1.add("Two");
	list1.add("Three");
	np.print(list1);
	
	}
	
}
