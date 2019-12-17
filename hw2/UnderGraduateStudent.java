class UnderGraduateStudent extends Student {

	UnderGraduateStudent() {
		//default constructor
	}
	
	UnderGraduateStudent(int idNum) {
		setId(idNum);
	}
	
	UnderGraduateStudent(int idNum, int midtermScore, int finalScore) {
		setId(idNum);
		setMidterm(midtermScore);
		setFinal(finalScore);
	}
	
	public char getLetterGrade() {
		double avgGrade = calcAvg();
		char letterGrade = super.getLetterGrade();
		
		if (avgGrade >= 90)
			letterGrade = 'A';
		else if (avgGrade >= 80)
			letterGrade = 'B';
		else if (avgGrade >= 70)
			letterGrade = 'C';
		else if (avgGrade >= 60)
			letterGrade = 'D';
		else
			letterGrade = 'F';
		
		return letterGrade;	
	}
	
}
