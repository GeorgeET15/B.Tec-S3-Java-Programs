import java.util.Scanner;

class calculatorFunctions {

	void Add(double a, double b) {
		
		double sum = a + b;
		System.out.println(" ");
		System.out.println("Answer = " + sum);
		System.out.println(" ");
	}
	
	void Subtract(double a, double b) {
	
		double subtract = a - b;
		System.out.println(" ");
		System.out.println("Answer = " + subtract);
		System.out.println(" ");
	}
	
	void Multiply(double a, double b) {
	
		double multiply = a * b;
		System.out.println(" ");
		System.out.println("Answer = " + multiply);
		System.out.println(" ");
	}
	
	void Divide(double a, double b) {
		
		double divide = a / b;
		System.out.println(" ");
		System.out.println("Answer = " + divide);
		System.out.println(" ");
	}
}



class problem_3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("Calculator");
		System.out.println("-----------");
		System.out.println(" ");
		System.out.print("Enter 1st number :- ");
		double a = scanner.nextInt();
		System.out.print("Enter 2nd number :- ");
		double b = scanner.nextInt();
		System.out.println(" ");
		
		calculatorFunctions calc = new calculatorFunctions();
		
		
		do {
		
			
			System.out.println(" ");
			System.out.println("List of Operations");
			System.out.println("-------------------");
			System.out.println("Addition - 1");
			System.out.println("Subtraction - 2");
			System.out.println("Multiplication - 3");
			System.out.println("Division - 4");
			System.out.println("Exit - 5");
			System.out.println(" ");
			System.out.print("Choose an option :- ");
			int n = scanner.nextInt();
			
		
			switch(n) {
			
				case 1: 
					calc.Add(a, b);
					break;
				case 2: 
					calc.Subtract(a, b);
					break;
				case 3: 
					calc.Multiply(a, b);
					break;
				case 4: 
					calc.Divide(a, b);
					break;
				case 5: 
					System.exit(0);
			}
		}while(true);
	}
}
