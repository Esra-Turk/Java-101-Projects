public class Teacher {
	String name;
	String branch;
	String phoneNumber;
	
	Teacher(String name, String branch, String phoneNumber) {
		this.name = name;
		this.branch = branch;
		this.phoneNumber = phoneNumber;		
	}
	
	public void print() {
		System.out.println("Ad: "+ this.name);
		System.out.println("Ders: "+ this.branch);
		System.out.println("Numara: "+ this.phoneNumber);
	}
}
