public class Customer {
    public static void main(String args[]){
        Factory BmwFact = new BmwFactory();
        Factory AodFact = new AodFactory();

        BmwFact.Produce().Run();
        AodFact.Produce().Run();
    }
}
