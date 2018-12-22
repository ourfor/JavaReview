public class Operation implements InstallSoftware {
    String SystemInfo;
    Operation(String input){
        SystemInfo=input;
    }
    public void Status(){
        System.out.println("已经安装好"+this.SystemInfo+"操作系统");
    }
}
