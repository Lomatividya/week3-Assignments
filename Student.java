package week3.day1;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Vidya");

	}
	public void studentDept() {
		System.out.println("Chemistry");

	}
	public void studentId() {
	System.out.println("06P057");

	}
	
	
	
	public static void main(String[] args) {
	 Student obj = new Student();
	 obj.collegeName();
	 obj.collegeCode();
	 obj.collegeRank();
	 obj.deptName();
	 obj.studentName();
	 obj.studentDept();
	 obj.studentId();
	 
	}


}
