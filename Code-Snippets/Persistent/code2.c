/*
Question

An agent sends a secret message to headquarters containing the details of his project. He sends one soft copy to the agency's computer (P) and sends one hard copy by fax to Roger, the technical head of the agency (Q). But during the transmission, noise in the network causes some bits of the data message P to get distorted. However, we know that Roger always matches the binary values of both messages and checks whether he can convert the message P to message Q by flipping the minimum number of bits.

Write an algorithm to help Roger find the minimum number of bits that must be flipped to convert message P to message Q.

Input

The first line of the input consists of

an integer num1, representing the secret message sent to the agency's computer (P). The second line consists of an integer num2, representing the message sent to the technical head

of the agency (Q).
Output

Print an integer representing the minimum number of bits that must be flipped to convert message P to

message Q.

Constraints

-104 num1, num2≤ 109

Example

Input

7

10

Output:

3

Explanation:

Binary representation of P is

00000111.

Binary representation of Q is

00001010.

Three bits of P at position 5, 6 and 8

must be flipped.

So, the number of bits that must be

flipped is 3.

*/

include<stdio.h> #include<stdlib.h>

#include<string.h> #include<stdbool.h>

/* only used in string related operations */ typedef struct String string;

struct String

{

char *str;

B

};

char *input (FILE *fp, int size, int has_space)

{

int actual size = 0;

char *str = (char *)malloc(sizeof(char)*(size+actual_size));

char ch;

if(has_space ==1)

I

while (EOF != (ch-fgetc (fp)) && ch != '\n')

str[actual size] ch; =

actual size++;

if(actual size > size).

str = realloc(str, sizeof(char)*actual size);

else while(EOF 1- (ch-fgetc (fp)) && ch 1-'\n' 8 ch 1-)

str[actual_size] -ch;

actual size++;

if (actual_size>- size)

str -> realloc(str,sizeof(char) actual size);

}

actual size++;

str = realloc(str,sizeof(char) actual size);

str[actual_size-1] = '\0';

return str;

} /* only used in string related operations */

I

*/

int flippedBits(int numi, int num2).

{

int answer;

// Write your code here

return answer;

}int main()

int num1;

int num2;

//input for num1 scanf("%d", &num1);

//input for num2 scanf("%d", &num2);

int result = flippedBits (num1, num2); printf("%d", result);

return 0;

}

I