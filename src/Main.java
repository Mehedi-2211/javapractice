import emp.Employee;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
//		System.out.println("Hello world");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Md. Mehedi Hassan");
		Employee mehedi = new Employee("Mehedi", "01", "SQA Engineer", 5000, 18);
		System.out.println(mehedi.getName() +" "+ mehedi.getId() +" "+ mehedi.getDesignation() +" "+ mehedi.getSalary() +" "+  mehedi.getAge());
		mehedi.setName("Mehedi Hassan");
		System.out.println(mehedi.getName());
		Employee oni = new Employee("Oni", "02", "Developer", 5500, 19);
		System.out.println(oni.getName());
		oni.setName("Oni Hassan");
		System.out.println(oni.getName());

	}

}
