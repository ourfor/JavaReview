public class SingleInside {
    private SingleInside(){}

    private static class InSide{
        private static SingleInside Single = new SingleInside();
    }

    public static SingleInside getInstance(){
        return InSide.Single;
    }

    public static void Info(){
        System.out.println("I am a single instance that made by Static Class insige");
    }
}
