package FeeManagement;

import java.util.List;

public class Organization {
	private List<Teachers> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private int totalMoneyPaid;
	
	public Organization(List<Teachers> teachers,List<Student> students){
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneyPaid = 0;
	}

	public List<Teachers> getTeachers() {
		return teachers;
	}
	
	public void addTeachers(Teachers teacher) {
		teachers.add(teacher);
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int MoneyEarned) {
	    totalMoneyEarned += MoneyEarned;
	}

	public int getTotalMoneyPaid() {
		return totalMoneyPaid;
	}

	public static void updateTotalMoneyPaid(int totalMoneyPaid) {
		totalMoneyEarned -= totalMoneyPaid;
	}
	
}

