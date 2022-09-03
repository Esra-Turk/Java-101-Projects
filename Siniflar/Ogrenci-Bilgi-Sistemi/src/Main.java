public class Main {
	public static void main(String[] args) {
		Teacher t1 = new Teacher("esra", "TRH", "12345");
		Teacher t2 = new Teacher("elif", "FZK", "1234567");
		Teacher t3 = new Teacher("arif", "MAT", "2345");
		
		Course tarih = new Course("Tarih", "102", "TRH");
		tarih.addTeacher(t1);
		
		Course fizik = new Course("Fizik", "202", "FZK");
		fizik.addTeacher(t2);
		
		Course mat = new Course("Matematik", "101", "MAT");
		mat.addTeacher(t3);
		
		Student s1 = new Student("Fazıl Öz", "472", 2, mat, tarih, fizik);
		s1.addBulkExamNote(45, 78, 98);
		s1.addFinalGradeNote(85,90,70);
		s1.isPass();
		
		System.out.println("*************************************************");
		
		Student s2 = new Student("Esra Türk", "1713", 3, mat, tarih, fizik);
		s2.addBulkExamNote(20, 30, 50);
		s2.addFinalGradeNote(50,50,55);
		s2.isPass();
		
		System.out.println("*************************************************");
		
		Student s3 = new Student("Elif Kızılkaya", "133", 4, mat, tarih, fizik);
		s3.addBulkExamNote(90, 50, 78);
		s3.addFinalGradeNote(100,55,85);
		s3.isPass();
	}
}
