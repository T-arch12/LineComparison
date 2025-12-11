import java.util.ArrayList;
import java.util.List;

class LineComparison {

    public static void main(String[] args) {
    System.out.println("Welcome to Line Comparison Computation Program");

        // UC1
        Line l1 = new Line(new Point(1, 2), new Point(4, 6));
        System.out.println("\nUC1: Line Length = " + l1.getLength());
        //UC2
        Line l2 = new Line(new Point(0, 0), new Point(3, 4));
        Line l3 = new Line(new Point(1, 1), new Point(4, 5));
        System.out.println("\nUC2: l2 equals l3 → " + l2.equals(l3));
        //UC3
        int result = l2.compareTo(l1);
        System.out.println("\nUC3: Compare Line Lengths → " + result);
        System.out.println("\nUC4: Sorting Lines by Length");

        List<Line> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(new Line(new Point(0,0), new Point(6,8)));

        list.sort(null);

        for (Line line : list) {
            System.out.println(line);
        }

    }
}