//: polymorphism/shape/Square.java
package shape;
import static net.mindview.util.Print.*;

public class Square extends Shape {
  @Override public void draw() { print("Square.draw()"); }
  @Override public void erase() { print("Square.erase()"); }
  @Override public void foo() { print("Square.foo()"); }
} ///:~
