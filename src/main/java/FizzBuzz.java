public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String result = "";
            result = i % 3 == 0 ? "Fizz" : "";
            result += i % 5 == 0 ? "Buzz" : "";
            if (result.equals(""))
                System.out.printf(Integer.toString(i));
            else
                System.out.printf(result);
            System.out.printf("\n");
        }
    }
}
