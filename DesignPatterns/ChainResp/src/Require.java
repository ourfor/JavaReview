public class Require {
    private String name;
    private String reason;
    private int day;

    Require(String _name,int _day,String _reason){
        name=_name;
        day=_day;
        reason=_reason;
    }

    String getName(){
        return name;
    }

    String getReason(){
        return reason;
    }

    int getDay(){
        return day;
    }
}
