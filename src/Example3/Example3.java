package Example3;

/**
 * This example covers abstract classes and methods.
 * Implement the previous example by creating an abstract class with class name abstractMin.
 * Add an abstract method "whichOneIsSmaller" to the class which accepts an Object as an argument 
 * and returns the smaller Object of the two, similar to the previous example.
 * Complete class Example3.Value3 to make Example3.Example3 work.
 * Some reverse engineering might be needed. Read the errors properly.
 * Make all three cases in main() to pass!
 * === DON'T CHANGE ANY METHOD DECLARATION/ DEFINITION. ===
 */
public class Example3 {
    private static Object minimum(Comparable[] values) {
        // Fill this up
    }

    public static void main(String[] unused) {
        // Case 1 (should return null)
        Value3[] values = new Value3[] {};
        System.out.println(minimum(values));

        // Case 2 (should return 10)
        values = new Value3[] {new Value3(10)};
        System.out.println(((Value3) minimum(values)).getVal());

        // Case 3 (should return 3)
        values = new Value3[] {new Value3(14), new Value3(10), new Value3(98), new Value3(3)};
        System.out.println(((Value3) minimum(values)).getVal());
    }
}
