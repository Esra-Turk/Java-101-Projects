
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax() {
		if(this.salary >= 1000) {
			return this.salary * 0.03;
		}
		
		return 0;
	}
	
	public int bonus() {
		if(this.workHours > 40) {
			return (this.workHours - 40) * 30;
		}
		
		return 0;
	}
	
	public double raiseSalary() {
		int year = 2022 - this.hireYear;
		
		if(year < 10) {
			return this.salary * 0.05;	
		}
		
		if(year >= 9 && year < 20 ) {
			return this.salary * 0.1;
		}
		
		if(year >= 19) {
			return this.salary * 0.15;
		}
		
		return 0;
	}
	
	public void printWorker() {
		System.out.println("**********Çalışan Bilgileri**********");
		System.out.println("Adı: " + this.name);
		System.out.println("Maaşı: " + this.salary);
		System.out.println("Çalışma saati: " +this.workHours);
		System.out.println("Başlangıç yılı: " +this.hireYear);
		System.out.println("Vergi Borcu: " +this.tax());
		System.out.println("Mesai ücreti:" +this.bonus());
		System.out.println("Maaş artışı: " +this.raiseSalary());
		
		double totalSalary = this.salary + this.raiseSalary();
		System.out.println("Toplam maaş: " +totalSalary);
		
		double totalSalaryWithoutTax = totalSalary - this.tax() + this.bonus();
		System.out.println("Vergisiz ve mesai ücretleriyle Maaşı: " +totalSalaryWithoutTax);
	}
}
