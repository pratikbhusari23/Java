/*

A cold storage company has N storage units for various products. The company has received N orders that must be preserved at respective N temperatures inside the storage units. The company manager wishes to identify which products must be preserved at negative temperatures.

Write an algorithm to help the manager find the number of products that have negative temperature storage requirements.

Input

The first line of the input consists of an integer numOfProducts, representing the number of products (N).

The second line consists of space- separated integers - temperatureo representing the temperatures at which the products must be

temperature1......, temperatureN-1

preserved in the storage units.

Output

Print an integer representing the number of products that must be preserved at negative temperatures

Constraints

0 ≤ numOfProducts ≤ 106

-106 <temperature, ≤ 106 0 <i<numOfProducts

Example

Input:

7 9-38-6-7810

Output:

3

Explanation:

The products that must be preserved at negative temperatures are at So, the output is 3.

indices [1,3,4] i.e. [-3, -6, -7].

*/

#include<stdio.h>

#include<stdlib.h>

#include<string.h>

#include<stdbool.h>

/ only used in string related operations */ typedef struct String string;

struct String

( char *str;

};

char *input (FILE *fp, int size, int has_space)

int actual_size 0; char *str = (char *)malloc(sizeof(char)*(size actual_size));

char ch;

if(has_space 1)

while (EOF != (ch-fgetc (fp)) && ch != '\n')

{

str[actual_size] = ch; actual size++;

if (actual_size >= size)

str = realloc(str, sizeof(char)*actual_size);

}

} else

while(EOF 1- (ch-fgetc(fp)) && ch 1- 185 ch 1)

str[actual_size] ch; actual_size++; If (actual size>- size)

str realloc(str,sizeof(char)*actual_size);

actual_size++;

} str realloc(str,sizeof(char)*actual size); return str;

str[actual_size-1] = '\0';

/* only used in string related operations */

T typedef struct array_single_int array_single_int; struct array_single_int

int *data;

int size;

};

"temperature" representing the temperatures at which the products must be preserved in the storage units.

int productsAtNegativeTemp (array_single_int temparature)

int productsAtNegativeTemp(array single Int temparature)

Folt

Evit

2

Ent answer;

Code saved

17 Write your code here

return answer;

int main()

{

array_single_int temparature;

//input for temparature

scanf("%d", &temparature.size);

*

temparature.data (int *)malloc(sizeof(int) temparature.size);

for (int idx = 0; idx < temparature.size; idx++)

{

scanf("%d", &temparature.data[idx]);

int result productsAtNegativeTemp (temparature); = printf("%d", result);

return 0;

}