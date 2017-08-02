import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //Easiest exercise ever
        System.out.printf("*");

        int n = 0;
        Scanner input = new Scanner(System.in);
        //Draw a horizontal line
        System.out.printf("\nInput n for 'Draw a horizontal line':\n");
        n = input.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.printf("*");

        //Draw a vertical line
        System.out.printf("\nInput n for 'Draw a vertical line':\n");
        n = input.nextInt();
        for(int i = 1; i <= n; i++)
            System.out.printf("*\n");

        //Draw a right triangle
        System.out.printf("\nInput n for 'Draw a right triangle':\n");
        n = input.nextInt();
        for(int i = 1;i <= n; i++){
            for(int j = 1;j <= i; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
