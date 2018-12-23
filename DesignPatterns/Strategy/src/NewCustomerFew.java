/**
 * 新用户小批量采购
 */

public class NewCustomerFew implements Strategy {
    public void getPrice(double price){
        System.out.println("不打折 "+price);
    }
}
