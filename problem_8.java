import java.util.Scanner;
class Employee {

	String name;
	int id;
	double salary;
	
	Employee(String ename, int eid, double esalary) {
		
		name = ename;
		id = eid;
		salary = esalary;
	}
	
	void displayInfo(String ePost) {
	
		String post = ePost;
		System.out.println("Employee Details");
		System.out.println("--------------- \n");
		System.out.println("Position: " + post);
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Salary(Rs): " + salary);
	}
}

class Manager extends Employee {

	String department;
	String post = "Manager";
	
	Manager(String name, int id, double salary, String edepartment) {
	
		super(name, id, salary);
		department = edepartment;
		
	}
	void displayManagerInfo() {
		
		super.displayInfo(post);
		System.out.println("Department: " + department);
	}

}
class SeniorManager extends Developer {

	int exp;
	String post = "Senior Manager";

	SeniorManager(String name, int id, double salary, String department, int eExp) {
	
		super(name, id, salary, department);
		exp = eExp;
	}
	
	void displaySeniorManagerInfo() {
		
		
		super.displayInfo(post);
		System.out.println("Experience: " + exp + " years");
	}
}



class Developer extends Employee {
	
	String code;
	String post = "Developer";

	Developer(String name, int id, double salary, String ecode) {
	
		super(name, id, salary);
		code = ecode;
		
	}
	
	void displayDeveloperInfo() {
		
		
		super.displayInfo(post);
		System.out.println("Programming Language: " + code);
	}


}

class JuniorDeveloper extends Developer {

	int exp;
	String post = "Junior Developer";

	JuniorDeveloper(String name, int id, double salary, String code, int eExp) {
	
		super(name, id, salary, code);
		exp = eExp;
	}
	
	void displayJuniorDeveloperInfo() {
		
		
		super.displayInfo(post);
		System.out.println("Experience: " + exp + " years");
	}
}

class Intern extends Employee{

	String mentor;
	String post = "Intern";

	Intern(String name, int id, double salary, String ementor) {
	
		super(name, id, salary);
		mentor = ementor;
		
	}
	
	void displayInternInfo() {

		super.displayInfo(post);
		System.out.println("Mentor: " + mentor);
	}

}

public class problem_8 {
    public static void main(String[] args) {

        Manager manage = new Manager("Geevargheese Regi", 101, 60000.0, "IT");
        SeniorManager srman = new SeniorManager("Giribala Arun", 111, 300000.0, "Python", 6);
        Developer developer = new Developer("George Emmanuel Thomas", 102, 55000.0, "Java");
        JuniorDeveloper jrdev = new JuniorDeveloper ("Glenda Pinhero", 452, 48000.0, "C#", 2);
        Intern intern = new Intern("Gokul Raj", 101, 60000.0, "IT");
        
        
        System.out.println();
        manage.displayManagerInfo();
        System.out.println();
        srman.displaySeniorManagerInfo();
        System.out.println();
        developer.displayDeveloperInfo();
        System.out.println();
        jrdev.displayJuniorDeveloperInfo();
        System.out.println();
        intern.displayInternInfo();
        System.out.println();
        
        
        
        System.out.println();
        
    }
}
