
public class StudentResultProcessingSystem {
		public static void main(String[] args)
		{
			float res1,res2;
			FirstYear fy=new FirstYear("Bharath",501,2013501);
			SecondYear sy=new SecondYear("Bharath",501,2013501);
			fy.printDetails();
			fy.getSubjects();
			sy.getSubjects();
			fy.setMarks(64, 81, 91, 90, 78, 82);
			sy.setMarks(69, 46, 59, 63, 67, 57);
			System.out.println("First Year Result:");
			res1 = fy.calResult();
			System.out.println("Total Percentage: "+res1);
			System.out.println("Second Year Result:");
			res2 = sy.calResult();
			System.out.println("Total Percentage: "+res2);
			System.out.println();
			System.out.println("Final Percentage after Second Year "+ (res1+res2)/2);
			
			System.out.println();
			
			fy=new FirstYear("Saketh",502,2013502);
			sy=new SecondYear("Saketh",502,2013502);
			fy.printDetails();
			fy.getSubjects();
			sy.getSubjects();
			fy.setMarks(64, 51, 58, 93, 85, 68);
			sy.setMarks(68, 75, 94, 51, 56, 58);
			System.out.println("First Year Result:");
			res1 = fy.calResult();
			System.out.println("Total Percentage: "+res1);
			System.out.println("Second Year Result:");
			res2 = sy.calResult();
			System.out.println("Total Percentage: "+res2);
			System.out.println();
			System.out.println("Final Percentage after Second Year "+ (res1+res2)/2);
			
		}
}
