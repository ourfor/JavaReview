public class Manager extends Leader {

    Manager(String _name){
        super(_name);
    }

    public void DealRequire(Require req){
        if(req.getDay()<10){
            System.out.println("请假人:"+req.getName()+" 请假天数:"+req.getDay()+" 理由:"+req.getReason());
            System.out.println("批假人:经理"+this.getName());
        }
        else {
            if(NextLeader!=null) NextLeader.DealRequire(req);
        }

    }
}
