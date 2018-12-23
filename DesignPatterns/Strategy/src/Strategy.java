/**
 * 某市场销售人员针对不同的情况实行不同的报价策略：
 * 1. 新用户小批量采购 不打折
 * 2. 新用户大批量采购 打八五折
 * 3. 老用户小批量采购 打八折
 * 4. 老用户大批量采购 打六五折
 */
public interface Strategy {
    void getPrice(double price);
}
