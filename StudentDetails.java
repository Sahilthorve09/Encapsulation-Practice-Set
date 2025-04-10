
public class StudentDetails {

	public static void main(String[] args) {
		Studentlogic data = new Studentlogic();
		data.setId(52);
		System.out.println("Student Id: "+data.getId());
		data.setName("Sahil Thorve");
		System.out.println("Student Id: "+data.getName());
		data.setMarks(100);
		System.out.println("Student Marks: "+data.getMarks()+"/100");
		
	}

}
