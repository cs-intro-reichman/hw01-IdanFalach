/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side.
 * This is known as the Triangle Inequality Theorem.
 * Write a program that tests if three given integers form a triangle.
 */
public class Triangle {
    public static void main(String[] args) {
        int firstSide = Integer.parseInt(args[0]);
        int secondSide = Integer.parseInt(args[1]);
        int thirdSide = Integer.parseInt(args[2]);

        boolean isTriangle = (firstSide + secondSide > thirdSide) && (firstSide + thirdSide > secondSide) &&
                (secondSide + thirdSide > firstSide);

        System.out.println(firstSide + ", " + secondSide + ", " + thirdSide + ": " + isTriangle);
    }
}
