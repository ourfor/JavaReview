public abstract class Leader {
    protected String name;
    protected Leader NextLeader;

    Leader(String _name){
        name=_name;
    }

    public String getName(){
        return name;
    }

    public void setNextLeader(Leader next){
        NextLeader=next;
    }

    public abstract void DealRequire(Require req);


}
