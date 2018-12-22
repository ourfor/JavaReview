public class Director extends Leader{

    Director(String _name){
        super(_name);
    }

    public void DealRequire(Require req){
        if(req.getDay()<3){
            System.out.println("请假人:"+req.getName()+" 请假天数:"+req.getDay()+" 理由:"+req.getReason());
            System.out.println("批假人:主任"+this.getName());
        }
        else {
            if(NextLeader!=null) NextLeader.DealRequire(req);
        }

    }
}
