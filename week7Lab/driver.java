package week7Lab;

public class driver {
    public static void main(String[] args) {

        changeInterface a1 = new changeInterface();
        IAdd add = a1;

        int x = 5;
        int y = 10;

        int added = add.add_aaa(x, y);

        System.out.println("x: " + a1.get_x() + " y: " + a1.get_y());
        System.out.println("Added: " + added);

        x = 5;
        y = 14;

        a1.change_x(x);
        a1.change_y(y);

        int newAdded = a1.add_aaa(x, y);

        System.out.println("Updated add: " + newAdded);

        /*
         * There are various ways of implementing this program
         * such as creating setter methods for x & y or directly creating the 
         * value in the parameters rather than initizaing a variable
         * 
         * I noitced that in the change methods of the implemented class
         * it is not neccessary to have that method since the add method from 
         * the interface is already a method that can change 
         * to user a change method to x & y
         */


    }
}
