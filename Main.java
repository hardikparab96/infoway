import java.util.Scanner;
//updated by hardik
public class Main {

	public static void main(String[] args) {
		
		Student [] s = new Student[3];
		
		 Scanner sc =new Scanner(System.in);
		 
		 for(int i=0;i<s.length;i++)
	        {
	        	System.out.println("enter the name");
	        	String n=sc.next();
	        	System.out.println("enter the age");
	        	int a=sc.nextInt();
	        	System.out.println("enter the rollno");
	        	int r=sc.nextInt();
	        	System.out.println("enter the marks");
	        	int m=sc.nextInt();
	        	
	        	s[i]=new Student(n,a,r,m);
	        }
 do {
	    System.out.println("\n1.display maxage\n2.display minage\n3.display avgmarks\n4.exit");
			
		int choice=sc.nextInt();
		if(choice==4)
			break;
		
		switch(choice)
		{
		case 1:Student.maxage(s);
		       break;
		       
		case 2:Student.minage(s);
		       break;
		case 3:Student.findavg(s);
		       break;
		default:System.out.println("invalid case");
		
		}// switch case ends
		
		
	}while(true);   // do while loop ends
		
 System.out.println("bye bye");
 
 
 
 
//        s[0] = new Student("abhijeet",22,2);
//        s[1] = new Student("neha",23,3);
//        s[2] = new Student("aniket",27,4);
        
//        Scanner sc =new Scanner(System.in);
//        for(int i=0;i<s.length;i++)
//        {
//        	System.out.println("enter the name");
//        	String n=sc.next();
//        	System.out.println("enter the age");
//        	int a=sc.nextInt();
//        	System.out.println("enter the rollno");
//        	int r=sc.nextInt();
//        	System.out.println("enter the marks");
//        	int m=sc.nextInt();
//        	
//        	s[i]=new Student(n,a,r,m);
//        }
//        
//        for(int i=0;i<s.length;i++)
//        {
//        	System.out.println(s[i]);
//        }
//        
//        Student.maxage(s);
//        Student.findavg(s);
//        System.out.println(s[0]);
//        System.out.println(s[1]);
//        System.out.println(s[2]);
	}

}
