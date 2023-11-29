package task05;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXYPair() {
        return new int[]{x, y};
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }

    public double distance() {
        return distance(0, 0);
    }

    static class Main {
        public static void main(String[] args) {
            Point point = new Point(5, 8);
            Point point2 = new Point(4, 7);

            System.out.println(point.distance(4, 7));
            System.out.println(point.distance(point2));
            System.out.println(point.distance());

        }
    }
}
