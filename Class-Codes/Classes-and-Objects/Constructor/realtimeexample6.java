class MemoryManagement {
    static String defaultAllocationAlgorithm = "First Fit";
    int processID;

    void display() {
        System.out.println("Default Allocation Algorithm: " + defaultAllocationAlgorithm);
        System.out.println("Process ID: " + processID);
    }
}

class MainDemo {
    public static void main(String[] args) {
        MemoryManagement obj1 = new MemoryManagement();
        MemoryManagement obj2 = new MemoryManagement();

        obj1.processID = 1001;
        obj2.processID = 1002;

        obj1.display();
        obj2.display();

        MemoryManagement.defaultAllocationAlgorithm = "Best Fit";

        obj1.display();
        obj2.display();
    }
}
/*
Default Allocation Algorithm: First Fit
Process ID: 1001
Default Allocation Algorithm: First Fit
Process ID: 1002
Default Allocation Algorithm: Best Fit
Process ID: 1001
Default Allocation Algorithm: Best Fit
Process ID: 1002
*/
