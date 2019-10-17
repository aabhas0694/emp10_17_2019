package Example2;

/**
 * In this example, you get a nice chance to understand interfaces, upcasting,
 * downcasting and a review of basic class design.
 * Like the previous example, class Example2.Example2 also prints the minimum of values in the values[] array
 * but this time the implementation is different.
 * Look closely at the class definitions!
 * Some reverse engineering might be needed. Read the errors properly.
 * Make all three cases in main() to pass!
 * === DON'T CHANGE ANY METHOD DECLARATION/ DEFINITION. ===
 */
public class Example2 {
    private static Object minimum(Comparable[] values) {
        // Fill this up
    }

    public static void main(String[] unused) {
        // Case 1 (should return null)
        Value2[] values = null;
        System.out.println(minimum(values));

        // Case 2 (should return 4)
        values = new Value2[] {new Value2(4)};
        System.out.println(((Value2) minimum(values)).getVal());

        // Case 3 (should return 6)
        values = new Value2[] {new Value2(14), new Value2(10), new Value2(98), new Value2(6)};
        System.out.println(((Value2) minimum(values)).getVal());
    }
}
