public class SingleLazy {

    private SingleLazy(){

    }

    private static SingleLazy Single=null;

    public static SingleLazy getInstance(){

        if(Single==null){
            // 1 2 3
            synchronized(SingleLazy.class){
                if(Single==null){
                    try{
                        Thread.sleep(10);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    Single = new SingleLazy();
                }

            }

        }

        return Single;
    }

    public void Info(){
        System.out.println("I am a single instance that made by the Lazy Single Class");
    }
}
