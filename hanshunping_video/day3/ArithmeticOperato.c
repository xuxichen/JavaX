#include <stdio.h>
 
int main()
{
//    int a = 21;
//    int b = 10;
//    int c ;
 
//    c = a + b;
//    printf("Line 1 - c 的值是 %d\n", c );
//    c = a - b;
//    printf("Line 2 - c 的值是 %d\n", c );
//    c = a * b;
//    printf("Line 3 - c 的值是 %d\n", c );
//    c = a / b;
//    printf("Line 4 - c 的值是 %d\n", c );
//    c = a % b;
//    printf("Line 5 - c 的值是 %d\n", c );
//    a = a++;  // 赋值后再加 1 ，c 为 21，a 为 22
//    printf("Line 6 - a 的值是 %d\n", a );
//    c = a--;  // 赋值后再减 1 ，c 为 22 ，a 为 21
//    printf("Line 7 - c 的值是 %d\n", c );


    /**
        ArithmeticOperato.c:25:10: warning: multiple unsequenced modifications to 'i' [-Wunsequenced]
        i = i++;
          ~  ^
        1 warning generated.
        i 的值是 1

    */
    int i=1;
    i = i++;
    printf("i 的值是 %d\n", i);

 
}