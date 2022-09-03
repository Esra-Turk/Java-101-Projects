public class Course {
	Teacher courseTeacher;
	String name;
	String code;
	String prefix;
	int note;
	int finalGrade;
	
	Course(String name, String code, String prefix) {
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = 0;
		this.finalGrade = 0;	
	}
	
	public void addTeacher(Teacher courseTeacher) {
		//öğretmenlerin branşları ve derslerin aynı olup olmadığı kontrol edilir
		if(courseTeacher.branch == this.prefix) {
			this.courseTeacher = courseTeacher;
		}
		else {
			System.out.println("Öğretmen ve ders bölümleri uyuşmuyor");
		}
	}
	
	public void printTeacher() {
		this.courseTeacher.print();	
	}
}
