import java.util.Scanner;

class problem_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Name and Division
        String name = "George Emmanuel Thomas";
        String division = "CSE Beta";
        System.out.println("Name :- " + name);
        System.out.println("Class :- " + division);
        System.out.println(" ");

        System.out.print("Enter the row and column for the 1st Matrix :- ");
        int r1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        System.out.print("Enter the row and column for the 2nd Matrix :- ");
        int r2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        int[][] n1 = new int[r1][c1];
        int[][] n2 = new int[r2][c2];
        int[][]  sum = new int[r1][c1]; 

        System.out.print("Enter the elements of the 1st Matrix :- ");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {

                n1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("First Matrix");
        System.out.println("------------");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {

                System.out.print(n1[i][j]);
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }


        System.out.print("Enter the elements of the 2nd Matrix :- ");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {

                n2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Second Matrix");
        System.out.println("------------");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {

                System.out.print(n2[i][j]);
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }

        if((r1 == r2) && (c1 ==c2)) {

            for(int i = 0; i < r2; i++ ) {

                for(int j = 0; j < c2; j++) {

                    sum[i][j] = n1[i][j] + n2[i][j];
                }
            }
        }

        System.out.println("Sum Matrix");
        System.out.println("------------");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {

                System.out.print(sum[i][j]);
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();
        }

        System.out.println("Transpose Matrix");
        System.out.println("------------");
        for(int i = 0; i < c1; i++) {

            for(int j = 0; j < r1; j++) {

                 System.out.print(sum[j][i]);
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
            System.out.println();

        }
    }
}