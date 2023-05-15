/*

Jake has created a new mathematical series which he calls the "Peralta Series" whose N'th element he

aped Current Question

denotes as J(N). There are 3 rules for this series.

6

7

03

4

}

p

Sc

int

int

SC.

Rule 1: J(0)=1. Rule 2: J(1)=1.

8

9

Rule 3: J(N)=(a*(N-1)+b*](N-2)) 9% mod where a and b are given constants and mod=10^9+7 and 9% denotes the modulus operator.

10

11

12

13 14

Jake is unable to find the value of J(N) for large values of N. So he asks for your help.

He gives you 3 integers - N. a, and b-

and asks you to find the value of J(N)

using the above rules.

15 16

17

18 19

20

21

22

23

Function Description

24

25

26

In the provided code snippet. implement the provided getJn(...)

method.

Input

You can write your code in the space below the phrase "WRITE YOUR LOGIC HERE

There will be multiple test cases

running so the Input and Output

should match exactly as provided.

1 2

3

Current Question

4

5 6

03

Input Format

The first line contains an integer N.

The second line contains an integer a.

The third line contains an integer b.

7
Skipped

8

9

10

11

Sample Input

5- denotes N

12

13

2- denotes a

14

2- denotes b

15 16

Constraints

17

1<=N,a,b<=1000000000

18
19

20

Output Format

Print the value of J(N).

21

22

i

23

in

Sample Output

24

76

25

SC

26

Input

Explanation

1) J(0)=1 and J(1)=1 as per the rules. and N=5 a=2, b=2 and mod=10^9+7. (2*1+2*1)9%mod=4.

3) (3)=(a*2)+b (1)mods

 */

 /*
  * 

Sample Output

24

76

25

SC

26

Input

Explanation

1) J(0)=1 and J(1)=1 as per the rules. and N=5 a=2, b=2 and mod=10^9+7. (2*1+2*1)9%mod=4.

3) (3)=(a*2)+b (1)mods
  */
 import java.util.*;
 import java.io.*;
 import java.lang.Math;
 
 public class program2 {
 
     public static int similarPairs(int A, int B) {



         // write your Logic here:
        

         
         int result = -404; // default output
         return result;
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
 
         // Input

         int A = sc.nextInt();
         int B = sc.nextInt();
 
         sc.close();
 
         // Output

         System.out.println(similarPairs(A, B));
     }
 }
 