class NetworkSecurity {
    static String encryptionAlgorithm = "AES";
    String firewallStatus;

    void display() {
        System.out.println("Encryption Algorithm: " + encryptionAlgorithm);
        System.out.println("Firewall Status: " + firewallStatus);
    }
}

class MainDemo {
    public static void main(String[] args) {
        NetworkSecurity obj1 = new NetworkSecurity();
        NetworkSecurity obj2 = new NetworkSecurity();

        obj1.firewallStatus = "Enabled";
        obj2.firewallStatus = "Disabled";

        obj1.display();
        obj2.display();

        NetworkSecurity.encryptionAlgorithm = "RSA";

        obj1.display();
        obj2.display();
    }
}
/*

Encyption Algorithm: AES
Firewall Status: Enabled
Encryption Algorithm: AES
Firewall Status: Disabled
Encryption Algorithm: RSA
Firewall Status: Enabled
Encryption Algorithm: RSA
Firewall Status: Disabled

*/
