public class Client {
    public static void main(String args[]){
        Leader a = new Director("张三");
        Leader b = new Manager("李四");
        Leader c = new GeneralManager("王五");

        //确定组织关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        Require req = new Require("Tom",20,"回家探亲");
        Require sed = new Require("John",5,"感冒了");
        Require awk = new Require("Mary",2,"补办身份证");

        a.DealRequire(req);
        a.DealRequire(sed);
        a.DealRequire(awk);

    }
}
