/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
    public static void main(String[] args) {
        int firstRangeNumber = Integer.parseInt(args[0]);
        int secondRangeNumber = Integer.parseInt(args[1]);

        int min = Math.min(firstRangeNumber, secondRangeNumber);
        int max = Math.max(firstRangeNumber, secondRangeNumber);

        int firstRandomNumber = (int) (min + (Math.random() * (max - min)));
        int secondRandomNumber = (int) (min + (Math.random() * (max - min)));
        int thirdRandomNumber = (int) (min + (Math.random() * (max - min)));

        System.out.println(firstRandomNumber);
        System.out.println(secondRandomNumber);
        System.out.println(thirdRandomNumber);

        int smallestRandomNumber = Math.min(firstRandomNumber, Math.min(secondRandomNumber, thirdRandomNumber));
        System.out.println("The minimal generated number was " + smallestRandomNumber);
    }
}
