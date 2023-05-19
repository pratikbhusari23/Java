class NetworkLayers {
    static String networkProtocol = "TCP/IP";
    String layerStatus;

    void display() {
        System.out.println("Network Protocol: " + networkProtocol);
        System.out.println("Layer Status: " + layerStatus);
    }
}

class MainDemo {
    public static void main(String[] args) {
        NetworkLayers obj1 = new NetworkLayers();
        NetworkLayers obj2 = new NetworkLayers();

        obj1.layerStatus = "Active";
        obj2.layerStatus = "Inactive";

        obj1.display();
        obj2.display();

        NetworkLayers.networkProtocol = "IPv6";

        obj1.display();
        obj2.display();
    }
}
/*
Network Protocol: TCP/IP
Layer Status: Active
Network Protocol: TCP/IP
Layer Status: Inactive
Network Protocol: IPv6
Layer Status: Active
Network Protocol: IPv6
Layer Status: Inactive
*/
