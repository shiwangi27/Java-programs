import java.util.*;

class MyComp implements Comparator<Person>
{
	public int compare(Person a, Person b)
	{

		return b.gpa.compareTo(a.gpa);
	}
}


class Person
{
	String name;
	String gpa;

	Person(String name,  String gpa)
	{
		this.name = name;
		//this,age = age;
		this.gpa = gpa;
	}

}


class TreeSetComparator
{
	public static void main(String[] args)
	{
		MyComp mp = new MyComp();
		TreeSet<Person> ts = new TreeSet<>(mp);
		ts.add(new Person("Shiwangi","4.0"));
		ts.add(new Person("Pavan","3.7"));
		ts.add(new Person("Juan","4.1"));
		ts.add(new Person("Tarek","3.5"));

		for (Person i : ts)
		{
			System.out.println(i.name + " " + i.gpa);
		}	
	}
}
