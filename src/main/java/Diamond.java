import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        //Isosceles Triangle
        System.out.printf("Input n for 'Isosceles Triangle':\n");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + i -1; j++) {
                if (j >= n - i + 1)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }

        //Diamond
        System.out.printf("Input n for 'Diamond':\n");
        n = input.nextInt();
        int[] starts = new int[2 * n];
        int[] ends = new int[2 * n];
        for(int i= 1;i <= n;i++){
            starts[i] = starts[2 * n - i] = n - i + 1;
            ends[i] = ends[2 * n - i] = n + i - 1;
        }
        for(int i = 1;i <= n * 2 - 1;i++){
            for(int j = 1;j <= ends[i];j++){
                if(j >= starts[i])
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.printf("\n");
        }

        //Diamond with Name
        System.out.printf("Input n for 'Diamond with Name':\n");
        n = input.nextInt();
        starts = new int[2 * n];
        ends = new int[2 * n];
        for(int i= 1;i <= n;i++){
            starts[i] = starts[2 * n - i] = n - i + 1;
            ends[i] = ends[2 * n - i] = n + i - 1;
        }
        for(int i = 1;i <= n * 2 - 1;i++) {
            if(i == n) {
                for(int j = 1;j <= n - 3;j++)
                    System.out.printf(" ");
                System.out.printf("Yifei");
            }
            else {
                for (int j = 1; j <= ends[i]; j++) {
                    if (j >= starts[i])
                        System.out.printf("*");
                    else
                        System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }
}
