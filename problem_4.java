import java.util.Scanner;
class problem_4 {
    public static void main(String[] args) {

        //Name and Division
        String name = "George Emmanuel Thomas";
        String division = "CSE Beta";
        System.out.println("Name :- " + name);
        System.out.println("Class :- " + division);
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of Elements :- ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int even = 0;
        int odd = 0;
        int zero = 0;
      
        System.out.print("Enter the elements in the array :- ");

        for(int i = 0; i < n; i++) {

            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {

            if(numbers[i] % 2 == 0 && numbers[i] != 0) {
                even += 1;
            }
            else if( numbers[i] == 0) {
                zero += 1;
            }
            else {
                odd += 1;
            }
        }
        System.out.println("Total Number of Even Elements = " + even);
        System.out.println("Total Number of Odd Elements = " + odd);
        System.out.println("Total Number of Zero Elements = " + zero);
    }
}