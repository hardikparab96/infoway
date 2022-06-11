
public class Student {

	String name;
	int age;
	int rollno;
	int marks;
	
	public Student()
	{
		name="none";
		age=0;
		rollno=0;
		marks=0;
	}
	
	public Student(String name,int age, int rollno,int marks)
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.marks=marks;
	}
	
	public String toString()
	{
		String str="Name: "+name+" , "+"Age: "+age+" , "+"Rollno: "+rollno+" , "+"Marks: "+marks;
		return str;
	}
	
	public static void maxage(Student a[])//a is an refernce
	{
		Student max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i].age>max.age)
			{
				max=a[i];
			}
		}
		System.out.println("student details having maximum age: "+max);
	}
	
	public static void minage(Student a[])//a is an refernce
	{
		Student max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i].age<max.age)
			{
				max=a[i];
			}
		}
		System.out.println("student details having minimum age: "+max);
	}
	
	public static void findavg(Student a[])
	{
		int sum=0;
		float avg;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i].marks;
		}
		avg=(float)sum/(a.length);
		System.out.println("the average of a student marks is: "+avg);
	}
	
	
}
