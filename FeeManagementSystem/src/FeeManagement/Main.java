package FeeManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teachers poojaTeacher = new Teachers(1,"Pooja",1000);
		Teachers pallaviTeacher = new Teachers(2,"Pallavi",20000);
		Teachers vikasTeacher = new Teachers(3,"Vikas",30000);
		
		List<Teachers> teacherList = new ArrayList<Teachers>();
		teacherList.add(poojaTeacher);
		teacherList.add(pallaviTeacher);
		teacherList.add(vikasTeacher);
		
		Student pooja1 = new Student(1,"Pooja",1000,"pooja@gmail.com");
		Student pallavi1 = new Student(2,"Pallavi",2000,"pallavi@gmail.com");
		Student vikas1 = new Student(3,"Vikas",12325345,"vikas@gmail.com");
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(vikas1);
		studentList.add(pallavi1);
		studentList.add(vikas1);
		
		Organization CodersCave = new Organization(teacherList,studentList);
		
		pooja1.payFees(50000);
		pallavi1.payFees(8000);
		System.out.println("CodersCave Organization Fund Earned "+CodersCave.getTotalMoneyEarned());
		
		poojaTeacher.receiveSalary(poojaTeacher.getSalary());
		System.out.println("CodersCave spent salary: "+poojaTeacher.getName()+" || remaining money is:"+CodersCave.getTotalMoneyEarned());

		pallaviTeacher.receiveSalary(pallaviTeacher.getSalary());
		System.out.println("CodersCave spent salary: "+pallaviTeacher.getName()+" || remaining money is:"+CodersCave.getTotalMoneyEarned());
		System.out.println();
		
		System.out.println("Student Details.............................");
		System.out.println(pooja1);
		System.out.println(pallavi1);
		System.out.println(vikas1);
		System.out.println();
		
		System.out.println("Teacher Details..............................");
		System.out.println(poojaTeacher);
		System.out.println(pallaviTeacher);
		System.out.println(vikasTeacher);
		
		
		
		

	}

}
