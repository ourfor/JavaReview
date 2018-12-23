/**
 * 老用户小批量采购
 */

public class OldCustomerFew implements Strategy {
    public void getPrice(double price){
        System.out.println("打八折 "+price * 0.8);
    }
}
