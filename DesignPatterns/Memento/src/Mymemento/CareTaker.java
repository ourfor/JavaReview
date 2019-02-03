package Mymemento;
import java.util.*;

public class CareTaker {
    /**
     * 负责人类
     * date: 20190202
     * description: 扶着保存好备忘录Memento
     */

    private Memento instance;
    private List<Memento> list = new ArrayList<Memento>();

    public Memento getInstance() {
        return instance;
    }

    public void setInstance(Memento instance) {
        this.instance = instance;
    }

    public Memento getList() {
        return list.get(list.size()-1);
    }

    public void setList(Memento e) {
        list.add(e);
    }

    public boolean delList(){
        Memento e = list.get(list.size()-1);
        return list.remove(e);
    }
}
