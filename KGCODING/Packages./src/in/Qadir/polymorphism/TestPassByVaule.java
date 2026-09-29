package in.Qadir.polymorphism;

public class TestPassByVaule {
    public static class Point
    {
        int x, y;

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void move(Point p)
    {
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static void main(String[] arg){
        Point first = new Point(4, 5);
        System.out.println("First: " + first);
        move(first);
        System.out.println("First: " + first);
    }
}