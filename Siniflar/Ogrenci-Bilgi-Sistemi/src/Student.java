public class Student {
	String name,stuNo;
	int classes; //öğrencinin sınıfı
	Course c1; //dersler
	Course c2; 
	Course c3; 
	Course finalGrade; //sözlü notu
	double avarage; // not ortalamaları
	double avarage1;
	double avarage2;
	double avarage3;
	boolean isPass;
	
	Student(String name, String stuNo, int classes, Course c1, Course c2, Course c3) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.avarage = 0;
		this.isPass = false;
	}
	
	
	public void addBulkExamNote(int note1, int note2, int note3) {
		if(note1 >= 0 && note1 <= 100);
			this.c1.note = note1;
		if(note2 >= 0 && note2 <= 100);
			this.c2.note = note2;
		if(note3 >= 0 && note3 <= 100);
			this.c3.note = note3;
	}
	
	public void addFinalGradeNote(int finalGrade1, int finalGrade2, int finalGrade3) {
		if(finalGrade1 >= 0 && finalGrade1 <= 100)
			this.c1.finalGrade = finalGrade1;
		if(finalGrade2 >= 0 && finalGrade2 <= 100)
			this.c2.finalGrade = finalGrade2;
		if(finalGrade3 >= 0 && finalGrade3 <= 100)
			this.c3.finalGrade = finalGrade3;
	}
	
	public void calsAvarage() {
		//ortalama = sınav notu * 0.8 + sözlü notu * 0.2
		avarage1 = this.c1.note * 0.8 + this.c1.finalGrade * 0.2;
		avarage2 = this.c2.note * 0.8 + this.c2.finalGrade * 0.2;
		avarage3 = this.c3.note * 0.8 + this.c3.finalGrade * 0.2;
		
		this.avarage = (avarage1 + avarage2 + avarage3) / 3.0;
	}
	
	public void isPass() {
		calsAvarage();
		if(this.avarage >= 55) {
			System.out.println(this.name + " sınıfı başarılı bir şekilde geçmiştir");
		}
		else {
			System.out.println(this.name + " sınıfta kalmıştır");
		}
		
		printNote();
	}
	
	public void printNote() {
		System.out.println(c1.name + " notu: " + c1.note +"\t"+ c1.name + " sözlü notu: " + c1.finalGrade);
		System.out.println(c2.name + " notu: " + c2.note +"\t\t"+ c2.name + " sözlü notu: " + c2.finalGrade);
		System.out.println(c3.name + " notu: " + c3.note +"\t\t"+ c3.name + " sözlü notu: " + c3.finalGrade);
		System.out.println("Tüm Derslerin Ortalaması: " + (float)this.avarage );
	}
}
