package Mymemento;

public class Memento {
    /**
     * 备忘录类
     * date: 20190202
     * description: 复制存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录Memento
     */
    private String name;
    private int age;
    private double salary;

    public Memento(Originator e){
        this.name=e.getName();
        this.age=e.getAge();
        this.salary=e.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
