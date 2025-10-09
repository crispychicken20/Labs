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

        math.add(x, y, z);

        int starting_value = 60;
        math.subtract(starting_value, x, y);

        math.divide(x, y);

        math.multiply(x, y);


    }
}
