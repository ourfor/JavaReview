public class GeneralManager extends Leader {

    GeneralManager(String _name){
        super(_name);
    }

    public void DealRequire(Require req){
        if(req.getDay()<30){
            System.out.println("请假人:"+req.getName()+" 请假天数:"+req.getDay()+" 理由:"+req.getReason());
            System.out.println("批假人:总经理"+this.getName());
        }
        else {
            System.out.println(""+req.getName()+"这小子是不想干了吧! "+"请"+req.getDay()+"假");
        }

    }
}
