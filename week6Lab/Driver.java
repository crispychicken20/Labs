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


        System.out.println("[Before Scenario:]");

        /*
         * The 'equals' method comes from if the object 
         * "equals one another"
         * comes from the Object root of the class hierarchy
         * also implements an equal relation on objects that
         * are non-null references.
         */

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));


        //System.out.println("[After Scenario]");
        // System.out.println(a.equals(b));
        // System.out.println(c.equals(d));


    }
}
