public class Call {
    public static void main(String args[]){

        SingleEnum s = SingleEnum.INSTANCE;

        s.print();

        SingleStarvation one = SingleStarvation.getInstance();
        one.Info();
        SingleHunger two = SingleHunger.getInstance();
        two.Info();

        SingleLazy three = SingleLazy.getInstance();
        three.Info();

        SingleInside four = SingleInside.getInstance();
        four.Info();


        new Thread(){
            public void run(){
                System.out.println("1:"+SingleLazy.getInstance());
            }
        }.start();

        new Thread(){
            public void run(){
                System.out.println("2:"+SingleLazy.getInstance());
            }
        }.start();

        new Thread(){
            public void run(){
                System.out.println("3:"+SingleLazy.getInstance());
            }
        }.start();




    }
}
