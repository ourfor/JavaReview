/**
 * 老用户大量采购
 */

public class OldCustomerMany implements Strategy {
    public void getPrice(double price){
        System.out.println("打六五折 "+price * 0.65);
    }
}
