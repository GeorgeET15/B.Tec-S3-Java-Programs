import java.util.Scanner;

class problem_2 {
	public static void main(String[] args) {
	
		System.out.println(" ");
		System.out.println("Integer Reverser");
		System.out.println("-----------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println(" ");
		System.out.print("Enter the integer :- ");
		int n = scanner.nextInt();
		int rev = 0;
		
		for(int i = n; i != 0;  i = i/10 ) {
		
			int rem; 
			rem = i%10;
			rev = rev * 10 + rem;

			
		}
		
		System.out.println(" ");
		System.out.println("Reverse = " + rev);
		System.out.println(" ");
	}
}
