import java.util.Scanner;

class guessnumber {
    public static void guessingnumbergame() {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int k = 5;
        int i, guess;
        System.out.println("A number is choose between 1 to 100. you can try 5 times:");
        for (i = 0; i < k; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess) {
                System.out.println("congrats,your guess is perfect number:");
                break;
            } else if (number > guess && i != k - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (number < guess && i != k - 1) {
                System.out.println("The number is less than" + guess);
            }
        }
        if (i == k) {
            System.out.println("Now, your chance is end" + "k trails");
            System.out.println("The number was" + number);
        }
    }

    public static void main(String[] args) {
        guessingnumbergame();
    }
}