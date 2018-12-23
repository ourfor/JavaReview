/**
 * 新用户大批量采购
 */

public class NewCustomerMany implements Strategy {
    public void getPrice(double price){
        System.out.println("打八五折 "+price * 0.85);
    }
}
