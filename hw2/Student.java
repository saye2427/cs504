class Student {
	
	private int id;
	private int midtermExam;
	private int finalExam;
	
	public void setId(int idNum) {
		id = idNum;
	}
	
	public int getId() {
		return id;
	}
	
	public void setMidterm(int midtermScore) {
		midtermExam = midtermScore;
	}
	
	public int getMidterm() {
		return midtermExam;
	}
	
	public void setFinal(int finalScore) {
		finalExam = finalScore;
	}
	
	public int getFinal() {
		return finalExam;
	}
	
	public double calcAvg() {
		double avg;
		avg = (midtermExam + finalExam) / 2.0;
		return avg;
	}
	
	public char getLetterGrade() {
		char letterGrade = ' ';
		
		return letterGrade;
	}

}
