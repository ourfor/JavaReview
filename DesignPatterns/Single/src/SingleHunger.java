public class SingleHunger {
    //饿汉式（立即加载）在编译完成时完成实例化
    private SingleHunger(){

    }

    private static SingleHunger single = new SingleHunger();   //利用静态成员只有一个副本的特点来构造单例模式。

    public static SingleHunger getInstance(){
        return single;
    }

    int age;

    public void Info(){
        System.out.println("我是一个饿汉式的单例类的对象");
    }
}
