package week8Lab;

/**
 * Driver class initializing the class object
 * showing calls to the methods from implemented class
 * @author Christopher Perez
 * @version 1.0
 * @see MyMath interface 
 * @see MathImple class
 */
public class Driver {
    public static void  main(String[] args) {
        MathImple math = new MathImple();

        int x= 20;
        int y = 5;
        int z = 12;

        int sum = math.add(x, y, z);

        System.out.println("Sum: " + sum);

        int starting_value = 60;
        int minus = math.subtract(starting_value, x, y);

        System.out.println("Subtraction: " + minus);

        int valDivided = math.divide(x, y);
        System.out.println("Divided: " + valDivided);

        int valMultipled = math.multiply(x, y);
        System.out.println("Multiplied: " + valMultipled);


    }
}
