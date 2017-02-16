
public abstract class Student {
	protected int rollno;
	protected int regno;
	protected String name;
	
	public Student(String name,int rollno,int regno)
	{
		this.name = name;
		this.rollno = rollno;
		this.regno = regno;
	}
	public abstract float calResult();
	public abstract void getSubjects();
	public abstract void printDetails();
}
