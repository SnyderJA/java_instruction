package biz;

public class Grade {
	
	int numGrade;
	String lettGrade;
	

	
	public Grade() {
		super();
		numGrade = 0;
		
	}


	public Grade(int numGrade, String lettGrade) {
		super();
		this.numGrade = numGrade;
		this.lettGrade = lettGrade;
	}


	public int getNumGrade() {
		return numGrade;
	}


	public void setNumGrade(int numGrade) {
		this.numGrade = numGrade;
	}


	public String getLettGrade() {
		return lettGrade;
	}


	public void setLettGrade(String lettGrade) {
		this.lettGrade = lettGrade;
	}
	
	
	
	
	

}
