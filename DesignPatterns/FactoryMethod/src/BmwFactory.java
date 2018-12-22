public class BmwFactory implements Factory {
    public Car Produce(){
        return new BmwCar();
    }
}
