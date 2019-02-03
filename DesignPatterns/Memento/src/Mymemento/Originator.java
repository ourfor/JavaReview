package Mymemento;

import Mymemento.Memento;

public class Originator {
    /**
     * 源发器类，用于记录当前时刻它的内部状态，并可使用备忘录恢复内部状态
     * author: ourfor
     * date: 20190202
     * description: 练习备忘录模式
     */

    private String name;
    private int age;
    private double salary;


    //备忘录对象的创建和恢复

    //进行备忘操作，并返回备忘对象

    public Memento GetMemento(){
        return new Memento(this);
    }

    //进行数据恢复，恢复成指定备忘录对象的值
    public void Recovery(Memento e){
        this.name=e.getName();
        this.age=e.getAge();
        this.salary=e.getSalary();
    }

    public Originator(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
