public class Computer {
    Hardware devices = new Hardware();
    Operation Windows = new Operation("Windows");
    Operation Linux = new Operation("Linux");

    void InstallWindows(){
        devices.Status();
        Windows.Status();
    }

    void InstallLinux(){
        devices.Status();
        Linux.Status();
    }
}
