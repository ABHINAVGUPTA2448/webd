public class java4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as command line argument");
            return;
        }

        String number = args[0];
        String reversed = new StringBuilder(number).reverse().toString();

        if (number.equals(reversed)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }
}