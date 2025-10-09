package week8Lab;

/**
 * Interface with function declarations that will be 
 * implemented within
 * @see MathImple
 * @author Christopher Perez
 * @version 1.0
 */
public interface MyMath {
    /**
     * method declaration of addition
     * @param x integer variable
     * @param y intger variable
     * @param z integer variable
     */
    public int add(int x, int y, int z);

    /**
     * method delcarion of subtraction
     * @param starting_value integer variable which is the starting value
     * @param sub_x integer x that will subtract into starting value
     * @param sub_y integer y that will subtract into starting value
     */
    public int subtract(int starting_value, int sub_x, int sub_y);

    /**
     * method declaration of multiplication
     * @param x multiply x to y
     * @param y multiply y to x
     */
    public int multiply(int x, int y);

    /**
     * method declaration of division
     * @param value_x value of x
     * @param div_by_y value of y to divide
     */
    int divide(int value_x, int div_by_y);
    
} 
   
