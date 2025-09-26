package School.week6Lab;


public class Driver {
    public static void main(String[] args) {
        Data1 a = new Data1();
        Data1 b = new Data1();
        Data1 c = new Data1();
        Data1 d = new Data1();

        a.setNum(5);
        b.setNum(6);
        c.setNum(1);
        d.setNum(1);


        // System.out.println("[Before Scenario:]");

        /*
         * The 'equals' method comes from if the object 
         * "equals one another"
         * comes from the Object root of the class hierarchy
         * also implements an equal relation on objects that
         * are non-null references.
         */

        // System.out.println(a.equals(b));
        // System.out.println(c.equals(d));


        System.out.println("[After Scenario]");
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        /*
         * The before scenario I was not famliar with the 
         * equals method so reading upon the documentation
         * I noticed when the objects are equalled they are both
         * considered false and I beleive this is the case since 
         * the reference of these objects in the heap are
         * different while when implementing my own 'equals'
         * method there is a clear indication of comparing the data
         * of both objects in this.num to OBJ.getNum()
         * which resulted in a to be remaing false since
         * both number values are not the same while
         * instead c & d were returned true.
         */


    }
}
