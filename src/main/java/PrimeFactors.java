import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String result = generate(n);

        System.out.printf(result.substring(1));
    }

    public static String generate(int n){
        String result = "";
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) {
                int j = 2;
                for (j = 2; j <= i / 2; j++) {
                    if(i % j == 0)
                        break;
                }
                if(j == i/2+1)
                    result += "," + i;
            }
        }
        return result;
    }
}
