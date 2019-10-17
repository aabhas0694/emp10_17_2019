package Example1;

/**
 * In this example, you get a nice chance to understand the Comparator interface, downcasting
 * and a review of basic class design.
 * Class Example1.Example1 prints the minimum of values in the values[] array.
 * Some reverse engineering might be needed. Read the errors properly.
 * Make all three cases in main() to pass!
 * === DON'T CHANGE ANY METHOD DECLARATION/ DEFINITION. ===
 */
public class Example1 {
    private static Object minimum(Comparable[] values) {
        // Fill this up
    }

    public static void main(String[] unused) {
        // Case 1 (should return null)
        Value1[] values = new Value1[] {};
        System.out.println(minimum(values));

        // Case 2 (should return 4)
        values = new Value1[] {new Value1(4)};
        System.out.println(((Value1) minimum(values)).getVal());

        // Case 3 (should return 6)
        values = new Value1[] {new Value1(14), new Value1(10), new Value1(98), new Value1(6)};
        System.out.println(((Value1) minimum(values)).getVal());
    }
}
