/**
 * represents a single student
 * @author mellis
 *
 */
public class Student 
{
	
	private String name;
	private int age;
	
	/**
	 * 
	 * @param n name of the student
	 * @param a age of the student
	 */
	public Student(String n, int a)
	{
		name = n;
		age = a;
		
	}
	
	/**
	 * 
	 * @return the name of this student
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return the age of this student
	 */
	public int getAge()
	{
		return age;
	}

}
