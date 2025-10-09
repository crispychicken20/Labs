// Ensure the MyMath interface is correctly imported or defined in the same package
package  week8Lab; // Ensure this import matches the package where MyMath is defined



/**
* Math implementation class from the declaration
 * methods within the MyMath Interface
 * @author Christopher Perez
 * @version 1.0
 * @see MyMath interface
 */
public class MathImple implements MyMath {
   
    /**
     * Method to get the sum of three declared variables
     * 
     * @param x implemeted x integer variable to add
     * @param y implemeted y integer variable to add
     * @param z implemeted z integer variable to add
     * @return sum of numbers
     */
    @Override
    public int add(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }    

    /**
     * 
     * Method to substract x and y into a starting value
     * 
     * @param starting_value Starting value that will be subtracted 
     * @sub_x  integer value x that will subtract from starting value
     * @sub_y  integer value y that will subtract from starting value
     * @return subtracted value
     */
    @Override
    public int subtract(int starting_value, int sub_x, int sub_y) {
        int minus = (starting_value - sub_x - sub_y);

        return minus;
    }

    /**
     * Method to multiply two variables together
     * @param x integer variable x will multipled by y
     * @param y integer variable y will multipled by x 
     * @return total of both x & y being multiplied
     */
    @Override
    public int multiply(int x, int y){
       int mulTotal = x * y;

       return mulTotal;
    }

    /**
     * Method to divide y into x
     * @param value_x x variable will be divided by y
     * @param div_by_y y divides unto x
     * @return the value of x after being divided by y
     */
    @Override
    public int divide(int value_x, int div_by_y){
        int divAfter = value_x / div_by_y;

        return divAfter;

    }
}
