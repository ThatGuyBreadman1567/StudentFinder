
public class FindStudentsMain {

	public static void main(String[] args) 
	{
		String[] names = {"Carter", "Cooper", "Ethan", "Danielle", "Katie", "Dan", "Jimmy", "Suzanne", "Jacqueline", "Jose", "Andy", "Patty", "Eileen"};
		int[] age = {11, 13, 10, 17, 16, 10, 10, 9, 18, 7, 8, 12, 14};
		Student[] allStudents = new Student[names.length];
		
		for(int i = 0; i < names.length; i++)
		{
			Student temp = new Student(names[i], age[i]);
			allStudents[i] = temp;
		}
		
		StudentFinder finder = new StudentFinder();
		Student youngest = finder.findYoungest(allStudents);
		Student oldest = finder.findOldest(allStudents);
		
		if(youngest.getName().equals("Jose"))
		{
			System.out.println("youngest is correct");
		}
		else
		{
			System.out.println("youngest incorrect: expected Jose, you found " + youngest.getName());
		}
		
		if(oldest.getName().equals("Jacqueline"))
		{
			System.out.println("oldest is correct");
		}
		else
		{
			System.out.println("oldest incorrect: expected Jacqueline, you found " + oldest.getName());
		}
		
	}

}
