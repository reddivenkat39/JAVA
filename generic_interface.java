interface generic_map<K,V>
{
	void putvalues(K key,V value);
	V getvalue(K key);
}

class mymap implements generic_map<Integer,String>
{
	
String[] arr;
	mymap(int length)
	{
	 arr = new String[length];	
	}
	public void putvalues(Integer newkey,String newvalue)
	{
		arr[newkey] = newvalue;
	}
	public String getvalue(Integer newkey)
	{
		return arr[newkey];
	}
}
public class generic_interface {
	public static void main(String[] args)
	{
		mymap newmap = new mymap(2);
		newmap.putvalues(0,"hello");
		newmap.putvalues(1,"world");
		
		System.out.println(newmap.getvalue(1));
	}

}
