
public class FirstYear extends Student {
	private String s1,s2,s3,s4,s5,s6;
	private int m1,m2,m3,m4,m5,m6;
	
	public FirstYear(String name,int rollno, int regno)
	{
		super(name,rollno,regno);
	}
	public void getSubjects()
	{
		s1 = "Engg Physics";
		s2 = "Engg Chemistry";
		s3 = "Maths 1";
		s4 = "Maths Methods";
		s5 = "Engg Drawing";
		s6 = "Computer Programming";
	}
	public void setMarks(int m1,int m2,int m3,int m4,int m5,int m6)
	{
		this.m1=m2;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		this.m6=m6;
	}
	public void printDetails()
	{
		System.out.println("Name of the Student: "+name);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Registered Number: "+regno);
	}
	public float calResult()
	{
		System.out.println("Marks in Subjects");
		System.out.println(s1+" : "+m1);
		System.out.println(s2+" : "+m2);
		System.out.println(s3+" : "+m3);
		System.out.println(s4+" : "+m4);
		System.out.println(s5+" : "+m5);
		System.out.println(s6+" : "+m6);
		return (float)((m1+m2+m3+m4+m5+m6)/6);
	}
}
