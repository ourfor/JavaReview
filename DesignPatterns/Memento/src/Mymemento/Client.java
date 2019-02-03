package Mymemento;
import java.util.*;

/**
 * 客户端程序，用于组织各类的关系
 */

public class Client {
    public static void main(String args[]){
        CareTaker Taker = new CareTaker();

        Originator test = new Originator("李白",30,6000);
        //第一次备忘打印
        System.out.println("第一次打印");
        System.out.println(test.getName()+"----"+test.getAge()+"---"+test.getSalary());

        Taker.setList(test.GetMemento());

        test.setName("杜甫");
        test.setAge(27);
        test.setSalary(5800);



        //第二次备忘打印
        System.out.println("第二次打印");
        System.out.println(test.getName()+"----"+test.getAge()+"---"+test.getSalary());

        //恢复备忘

        test.Recovery(Taker.getList());
        Taker.delList();

        test.setSalary(7000);
        Taker.setList(test.GetMemento());

        System.out.println("第三次打印");
        System.out.println(test.getName()+"----"+test.getAge()+"---"+test.getSalary());

        test.setAge(45);
        Taker.setList(test.GetMemento());

        System.out.println("第四次打印");
        System.out.println(test.getName()+"----"+test.getAge()+"---"+test.getSalary());

        test.Recovery(Taker.getList());
        Taker.delList();

        System.out.println("第五次打印");
        System.out.println(test.getName()+"----"+test.getAge()+"---"+test.getSalary());

        test.Recovery(Taker.getList());
        Taker.delList();

        System.out.println("第六次打印");
        System.out.println(test.getName()+"----"+test.getAge()+"---"+test.getSalary());


    }
}
