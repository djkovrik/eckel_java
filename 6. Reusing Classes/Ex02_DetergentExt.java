/**
 * Inherit a new class from class Detergent. Override scrub( ) and add a
 * new method called sterilize( ).
 */
import static net.mindview.util.Print.*;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}

class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        print(x);
        print("Testing main base class:");
        Cleanser.main(args);
    }
}

public class Ex02_DetergentExt extends Detergent {

    public void scrub() {
        append(" Ex02_DetergentExt.scrub()");
        super.scrub();
    }

    public void sterilize() { append(" sterilize()"); }

    public static void main(String[] args) {
        Ex02_DetergentExt ed = new Ex02_DetergentExt();
        ed.scrub();
        ed.sterilize();
        print(ed);
        print("Testing sub base class:");
        Detergent.main(args);
    }
}
