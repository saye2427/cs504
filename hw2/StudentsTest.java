public class StudentsTest {
	
	public static void main(String[] args) {
		
		//Test that child classes work, esp. their overrides
		
		//Check GradStudent child class
		GraduateStudent bobGrad = new GraduateStudent();
		bobGrad.setId(1);
		bobGrad.setMidterm(95);
		bobGrad.setFinal(92); //This student should thus receive an A
		
		System.out.println("ID # " + bobGrad.getId() + "\nFinal Grade = " + bobGrad.getLetterGrade());
		System.out.println("");
		
		//Check GradStudent override (the getLetterGrade method), and check the other type of constructor
		GraduateStudent jillGrad = new GraduateStudent(2, 50, 70); //This student should recieve an F as the lowest passing grade is C for grad students
		
		System.out.println("ID # " + jillGrad.getId() + "\nFinal Grade = " + jillGrad.getLetterGrade());
		System.out.println("");
		
		//Check the UnderGradStudent child class, and its overridden method conditions
		UnderGraduateStudent sallyUnderGrad = new UnderGraduateStudent(3);
		sallyUnderGrad.setMidterm(50);
		sallyUnderGrad.setFinal(70); //This student should receive a D since D is the lowest possible passing grade for undergrads (whereas this was an F for a Grad student)
		
		System.out.println("ID # " + sallyUnderGrad.getId() + "\nFinal Grade = " + sallyUnderGrad.getLetterGrade());
		System.out.println("");
		
	}

}