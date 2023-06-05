/*

Martin's father goes for a jog every morning. Martin follows him several minutes later. His father starts at a position that is X1 meters away from their home and runs rectilinearly at a constant speed of V1 meters per step for N steps.

Martin is standing at X2 meters away from his home. He wonders how fast he must run at some constant speed of V2 meters per step so as to maximize F, where F equals the number of his father's footsteps that Martin will land on during his run. It is given that the first step that Martin will land on, from his starting position, will have been landed on by his father.

Note that if more than one prospective velocity results in the same number of maximum common steps, output the highest prospective velocity as V2.

Write an algorithm to help Martin calculate F and V2.

Input

The first line of the input consists of an integer fatherPos, representing the initial position of Martin's father (X₁).

The second line consists of an integer martinPos, representing the initial position of Martin (X2).

The third line consists of an Integer velFather, representing the velocity of the father (V₁).

The last line consists of an integer steps, representing the number of steps taken by the father (N).

Output

Print two space-separated integers as the maximum number of common footsteps F and respective speed V₂

Constraints

1 s fatherPos≤ 105 0 ≤ martinPoss faterPos

1 ≤ velFathers 104

1 ≤ steps ≤ 104

Example

Input:

3

2

2

20

Output:

211


*/

#include<stdio.h>

#include<stdlib.h>

#include<string.h>

#include<stdbool.ho

/ only used in string related operations "/ typedef struct string strings

struct string

char *stri

char *input (FILE *fp, int size, int has space)

(

int actual size = 0;

char str (char *)malloc(sizeof(char)*(size actual size));

char ch;

if(has space 1)

(

while(EOF = (ch-fgetc (fp)) && ch != '\n')

{

str[actual_size] - ch;

actual_size++; if(actual_size >= size)

(

str realloc(str,sizeof (char)*actual size);

}

}

else

while(EOF 1 (ch-fgetc(fp)) && ch 1- '\n' && ch 1-)

str[actual_size] ch; actual_size++; if(actual size >= size)
str realloc(str, sizeof(char)*actual size);

}

}

actual_size++;

str = realloc(str, sizeof(char)actual size); str[actual_size-1] = '\0';

return str;

} /* only used in string related operations */

typedef struct array_single_int array_single_int; struct array_single_int

{

int *data;

int size;

};

array_single_int commonFootsteps (int fatherPos, int martinPos, int velFather, int steps)

array_single_int answer; // write your code here

I

}

return answer;
    
    }
    int main()

int fatherPos;

int martinpos; int velfather;

Int steps;

//input for fatherPos

scanf("%d", &fatherPos);

//input for martinPos scanf("%d", &martinPos);

//input for velFather scanf("%d", &velFather);

//input for steps scanf("%d", &steps);

array_single_int result commonFootsteps (fatherPos, martinPos, velFather, steps); for (int idx 0; idx < result.size 1; idx++) (

printf("%d", result.data[idx]);

printf("%d", result.data[result.size - 1]);

return 0;