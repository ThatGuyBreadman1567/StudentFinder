
public class StudentFinder 
{
	public Student findOldest(Student[] array)
	{
		Student maximum = array[0];
		int max = array[0].getAge();
		for(int i=1; i<array.length; i++)
		{
			if(array[i].getAge()>max)
			{
				max = array[i].getAge();
				maximum = array[i];
			}
		}
		return maximum;
	}
		
	public Student findYoungest(Student[] array)
	{
		Student minimum = array[0];
		int min = array[0].getAge();
		for(int i=1; i<array.length; i++)
		{
			if(array[i].getAge()<min)
			{
				min = array[i].getAge();
				minimum = array[i];
			}
		}
		return minimum;	
	}
}
