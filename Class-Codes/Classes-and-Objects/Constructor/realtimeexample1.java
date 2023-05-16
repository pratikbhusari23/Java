class DeviceDriver{

    String name="My Device Driver";
    double version=3.8;

    void open(){
        System.out.println("Opening device driver...");
    }
    void close(){
        System.out.println("Closing device driver...");
    }
    void read(){
        System.out.println("Reading device driver...");
    }
    void write(){
        System.out.println("Writing device driver...");
    }
    void flush(){
        System.out.println("Flushing data from device driver...");
    }

}

class DeviceDriverTest{

    public static void main(String[] args) {
        DeviceDriver obj=new DeviceDriver();
        
        System.out.println("Name of the device driver is: "+obj.name);
        System.out.println("Version of the device driver is: "+obj.version);

        obj.open();
        obj.read();
        obj.write();
        obj.flush();
        obj.close();
    }
}
