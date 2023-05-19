class NetworkAddressing {
    static String defaultSubnetMask = "255.255.255.0";
    String ipAddress;

    void display() {
        System.out.println("Default Subnet Mask: " + defaultSubnetMask);
        System.out.println("IP Address: " + ipAddress);
    }
}

class MainDemo {
    public static void main(String[] args) {
        NetworkAddressing obj1 = new NetworkAddressing();
        NetworkAddressing obj2 = new NetworkAddressing();

        obj1.ipAddress = "192.168.1.100";
        obj2.ipAddress = "10.0.0.50";

        obj1.display();
        obj2.display();

        NetworkAddressing.defaultSubnetMask = "255.255.0.0";

        obj1.display();
        obj2.display();
    }
   /* 
    	    Default Subnet Mask: 255.255.255.0
	    IP Address: 192.168.1.100
	    Default Subnet Mask: 255.255.255.0
	    IP Address: 10.0.0.50
	    Default Subnet Mask: 255.255.0.0
	    IP Address: 192.168.1.100
	    Default Subnet Mask: 255.255.0.0
	    IP Address: 10.0.0.50

	    */
