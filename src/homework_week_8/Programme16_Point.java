package homework_week_8;

public class Programme16_Point {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public static class Point {
        private int x;
        private int y;

        // No-arg constructor
        public Point() {
        }

        // Constructor with parameters to initialize fields
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Getter for x
        public int getX() {
            return x;
        }

        // Getter for y
        public int getY() {
            return y;
        }

        // Setter for x
        public void setX(int x) {
            this.x = x;
        }

        // Setter for y
        public void setY(int y) {
            this.y = y;
        }

        // Method to calculate distance from (0, 0)
        public double distance() {
            return Math.sqrt(x * x + y * y);
        }

        // Method to calculate distance from another point (x, y)
        public double distance(int x, int y) {
            int xDiff = this.x - x;
            int yDiff = this.y - y;
            return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        }

        // Method to calculate distance from another point object
        public double distance(Point another) {
            return distance(another.getX(), another.getY());
        }
    }
}


