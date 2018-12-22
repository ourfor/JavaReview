public class SingleStarvation {

    private SingleStarvation(){}

    private static SingleStarvation Single = null;

    static{
        Single = new SingleStarvation();
    }

    public static SingleStarvation getInstance(){
        return Single;
    }

    int age;

    public void Info(){
        System.out.println("我是一个饿汉式的单例类的对象");
    }
}
