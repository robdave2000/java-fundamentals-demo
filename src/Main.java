public class Main {
    public static void main(String[] args)
    {
        DroidFactory r2d2 = new DroidFactory("R2D2");

        r2d2.setModelType("C");

        System.out.println(r2d2.toString());

        r2d2.speak();
    }
}
