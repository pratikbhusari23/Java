class Virtualization {
    static String defaultVirtualizationPlatform = "VMware";
    int virtualMachineID;

    void display() {
        System.out.println("Default Virtualization Platform: " + defaultVirtualizationPlatform);
        System.out.println("Virtual Machine ID: " + virtualMachineID);
    }
}

class MainDemo {
    public static void main(String[] args) {
        Virtualization obj1 = new Virtualization();
        Virtualization obj2 = new Virtualization();

        obj1.virtualMachineID = 1;
        obj2.virtualMachineID = 2;

        obj1.display();
        obj2.display();

        Virtualization.defaultVirtualizationPlatform = "Hyper-V";

        obj1.display();
        obj2.display();
    }
}
/*
Default Virtualization Platform: VMware
Virtual Machine ID: 1
Default Virtualization Platform: VMware
Virtual Machine ID: 2
Default Virtualization Platform: Hyper-V
Virtual Machine ID: 1
Default Virtualization Platform: Hyper-V
Virtual Machine ID: 2
*/
