public class AodFactory implements Factory {
    public Car Produce(){
        return new AodCar();
    }
}
