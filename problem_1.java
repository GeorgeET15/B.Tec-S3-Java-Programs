import java.util.Scanner;

class problem_1 {
	public static void main(String[] args) {
	

		Scanner scanner = new Scanner(System.in);
		System.out.println("Student Grade Finder");
		System.out.println("--------------------");
		System.out.println(" ");
		System.out.print("Enter Your Score :- ");
		int n = scanner.nextInt();
		
		if(n >= 90) {
		
			System.out.println(" ");
			System.out.println("Your grade : A");
		}
		else if(n >= 80) {
			System.out.println(" ");	
			System.out.println("Your grade : B");
		}
		else if(n >= 70) {
			System.out.println(" ");	
			System.out.println("Your grade : C");
		}
		
		else if( n >= 60) {
			System.out.println(" ");	
			System.out.println("Your grade : D");
		}
		
		else {
			System.out.println(" ");	
			System.out.println("Fail");
		}
		
	}	
}
