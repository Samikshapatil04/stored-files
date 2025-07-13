#include <stdio.h>
#include <string.h>

int main()
{
    char day1[25] = "Sunday";
    char day2[25] = "Saturday";
    char inputdayone;

    printf("Enter the Day: ");
    scanf("%24s", &inputdayone);
    
    if (strcmp(inputdayone, day1) == 0 || (inputdayone, day2) == 0 )
    {
        printf("Weekend day\n");
    }
    else
    {
        printf("Week Day\n");
    }

    return 0;
}
