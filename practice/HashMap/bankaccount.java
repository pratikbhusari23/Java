import java.util.*;

class Demo {

    public static void transaction(int acc_no, int tran) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if (map.containsKey(acc_no)) {

            int balance = map.get(acc_no);
            if (tran > 0) {
                balance += tran;
            } else {
                balance -= tran;
            }

            map.put(acc_no, balance);

        } else {
            map.put(acc_no, tran);
        }

        for (int key : map.keySet()) {

            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }
    }

    public static void main(String[] args) {

        int acc_no = 123;
        int tran = 5000;

        transaction(acc_no, tran);

        acc_no = 123;
        tran = -5000;

        transaction(acc_no, tran);

    }
}
