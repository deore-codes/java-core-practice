package day01.oops;

public class StudentGrade 
{
	
	private int id;
	private String name;
	private int marks;
	
	public StudentGrade(int id , String name , int marks)
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void calculateGrade()
	{
		if(marks > 80)
		{
			System.out.println("Grade : A ");
		}
		else if(marks >=60)
		{
			System.out.println("Grade : B ");
		}
		else
		{
			System.out.println("Grade : C ");
		}
	}
	
	public void displayStudent()
	{
		System.out.println("ID : "+ id);
		System.out.println("Name : "+ name);
		System.out.println("Marks : "+ marks);
	}
	
	
	public static void main(String[] args)
	{
		StudentGrade s1 = new StudentGrade(1, "Sandesh Deore" , 90);
		
		s1.displayStudent();
		s1.calculateGrade();
	}

}
