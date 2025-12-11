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
    }
}