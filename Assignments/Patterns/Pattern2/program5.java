/*
for rows=4
10
9 8
7 6 5
4 3 2 1

for rows=5

15
14 13
12 11 10
9 8 7 6
5 4 3 2 1

for rows=6

21
20 19
18 17 16
15 14 13 12
11 10 9 8 7
6 5 4 3 2 1

 */

class Pattern2 {
    public static void main(String s[]) {
        int rows = 6;
        int count = rows * (rows + 1) / 2;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();
        }
    }
}