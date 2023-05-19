class ProcessManagement {
    static String defaultSchedulingAlgorithm = "Round Robin";
    int processID;

    void display() {
        System.out.println("Default Scheduling Algorithm: " + defaultSchedulingAlgorithm);
        System.out.println("Process ID: " + processID);
    }
}

class MainDemo {
    public static void main(String[] args) {
        ProcessManagement obj1 = new ProcessManagement();
        ProcessManagement obj2 = new ProcessManagement();

        obj1.processID = 1001;
        obj2.processID = 1002;

        obj1.display();
        obj2.display();

        ProcessManagement.defaultSchedulingAlgorithm = "First Come First Serve";

        obj1.display();
        obj2.display();
    }
}
/*
 
Default Scheduling Algorithm: Round Robin
Process ID: 1001
Default Scheduling Algorithm: Round Robin
Process ID: 1002
Default Scheduling Algorithm: First Come First Serve
Process ID: 1001
Default Scheduling Algorithm: First Come First Serve
Process ID: 1002

*/
