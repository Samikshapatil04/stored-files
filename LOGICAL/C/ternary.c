#include <stdio.h>
#include <string.h>

int main()
{
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    (num % 2 == 0) ? printf("The number %d is Even.\n", num) : printf("The number %d is Odd.\n", num);

    return 0;
}
// using ternay operator