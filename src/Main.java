public class Main {
    public static void main(String[] args)
    {
        DroidFactory r2d2 = new DroidFactory("R2D2", "A");

        System.out.println(r2d2.toString());

        r2d2.speak();
    }
}
