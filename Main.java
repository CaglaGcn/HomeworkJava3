
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "Çağla";
		student.lastName ="Gülcan";
		student.eMail= "caglagulcan@gmail.com";
		student.password="111111";

		
		Instructor instructor = new Instructor();
		instructor.firstName ="Engin";
		instructor.lastName ="Demiroğ";
		instructor.profession="Java";
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.delete(student);
		userManager.update(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		
	}
	

}
