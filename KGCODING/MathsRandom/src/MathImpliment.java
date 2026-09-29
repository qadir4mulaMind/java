public class MathImpliment {
    public static void main(String[] args) {
        System.out.println(Math.ceil(99.6));
        System.out.println(Math.round(77.3));
        System.out.println(Math.abs(-77));
        System.out.println(Math.floor(56.9));
        for (int i = 0; i < 10 ; i++) {
            System.out.println((int)(Math.random() * 100));
        }
        System.out.println(Math.PI);
    }
}