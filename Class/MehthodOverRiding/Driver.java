package MehthodOverRiding;

public class Driver {
    public static void main(String[] args) {

        // ! the method overridin execution of mehtod is directly depends on obj
        // ! creation of run time.
        Program p = new Program();
        p.sound();

        Program p1 = new ProgramChild1(); // up casting | impicit casting
        p1.sound();

        ProgramChild1 c = (ProgramChild1) new Program(); // down casting | explicit casting
        Program p2 = new ProgramChild2();
        p2.sound();
    }
}
