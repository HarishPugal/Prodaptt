package newpackages;
import java.util.List;
import java.util.Vector;

public class ArithmeticOperations {
    public static double add(Number n1, Number n2) {
        return n1.doubleValue() + n2.doubleValue();
    }

    public static double sub(Number n1, Number n2) {
        return n1.doubleValue() - n2.doubleValue();
    }

    public static double div(Number n1, Number n2) {
        if (n2.doubleValue() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return n1.doubleValue() / n2.doubleValue();
    }

    public static double add(List<Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void dumpList(List<?> list) {
        System.out.println("List dump with unbounded wildcard:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        // Adding 2 integers
        Integer i1 = new Integer(34), i2 = new Integer(43);
        System.out.println("Add with generic method: " + add(i1, i2));

        Float f1 = new Float(12.56), f2 = new Float(3.6778);
        System.out.println("Add with generic method: " + add(f1, f2));

        System.out.println("Subtraction with generic method: " + sub(f1, f2));
        System.out.println("Division with generic method: " + div(f1, f2));

        // Adding 2 integers through a list
        Vector<Number> l = new Vector<>();
        l.add(new Integer(34));
        l.add(new Integer(43));
        System.out.println("Add with upper bounded wildcard: " + add(l));

        // Dumping the list to the console.
        dumpList(l);
    }
}