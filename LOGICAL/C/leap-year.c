#include <stdio.h>
#include <string.h>

int main()
{
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    (num % 4 == 0) ? printf("The Year %d is a Leap Year.\n", num) : printf("The number %d is Not a Leap Year.\n", num);

    return 0;
}
// using ternay operator