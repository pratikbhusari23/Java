/*
A company has a sales record of N products for M days. The company wishes to know the maximum revenue received from a given product of the N products each day. Write an algorithm to find the highest revenue received each day.

Input

The first line of the input consists of two space-separated

integers- days and products, representing the days (M) and the products in the sales record (N), respectively.

The next M lines consist of N space- separated integers - salesRecord, representing the grid of sales revenue (can be positive or negative) received from each product each day.

Output

Print M space-separated integers representing the maximum revenue received each day.
Example

Input:

34

100 198 333 323

122 232 221 111 223 565 245 764

Output:

333 232 764

Explanation:

The maximum revenue received on the first day is 333, followed by a maximum revenue of 232 on the second day and a maximum revenue of 764 on the third day
*/

2 3 #include<stdio.h> #include<stdlib.h>

4

5

5

#include<string.h> #include<stdbool.h>

only used in string related operations "/ typedef struct string string;

struct string

{

char *str;

char *input (FILE *fp, int size, int has_space

int actual size = 0;

)

char *str = (char *)malloc(sizeof(char)*(size+actual_size));

char ch;

I

if (has_space 1)

{

while (EOF != (ch=fgetc (fp)) && ch != '\n')

str[actual_size] = ch; actual_size++; if(actual size >= size)

str = realloc(str, sizeof(char)*actual_size);

}

}

else

while(EOF 1 (ch-fgetc (fp)) && ch != '\n' && ch != '')

str[actual_size] = ch; actual_size++; if(actual_size >= size)

str = realloc(str, sizeof(char)*actual_size);

actual_size++;

str = realloc(str, sizeof(char)"actual_size); str[actual_size-1] = '\0';

return str;

}

/* only used in string related operations */

typedef struct array_single_int array_single_int; struct array_single_int

int *data;

int size;

};

typedef struct array_double_int array_double_int; struct array_double_int

int **data;

int row;

int col;

};

array single int maxRevenue (array_double_int salesRecord).

array single int answer;

// write your code here

int main(){ int days, products; 1

scanf("%d", &days, &products); for (int j=0;j<products;j++) { scanf("%d", &salesRecord[i][j]);

int salesRecord[days] [products]; for (int i=0;i<days;i++){

}

int maxRevenue [days]; for(int i=0;i<days; i++){

maxRevenue[i] salesRecord[i][0]; for (int j=1; i<producs; j++){ if(salesRecord[i][j]>maxRevenue[i]){ maxRevenue[i]-salesRecord[i][];

for (int i=0;icdays; i++){ printf("%d", maxRevenue[i]); }

return 0;

}
return answer;

int main()

array_double_int salesRecord;

//input for salesRecord

scanf("%d", &salesRecord.row); scanf("%d", &salesRecord.col); salesRecord.data = (int **)malloc(sizeof(int *) salesRecord.row); for (int idx = 0; idx < salesRecord.row; idx++) I

{

salesRecord.data[idx] = (int *)malloc(sizeof(int) salesRecord.col); for (int jdx = 0; jdx < salesRecord.col; jdx++)

scanf("%d", &salesRecord.data[idx][jdx]); }

}

}

array_single_int result = maxRevenue (salesRecord); for (int idx = 0; idx < result.size 1; idx++) { } printf("%d", result.data[idx]);

printf("%d", result.data[result.size = 1]);

return 0;

}