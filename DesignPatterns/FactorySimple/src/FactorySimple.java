public class FactorySimple {
    public static Car Produce(String message){
        switch(message){
            case "宝马": return new BmwCar();
            case "奥迪": return new AodCar();
            default: return null;
        }
    }
}
