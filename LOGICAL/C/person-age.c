#include <stdio.h>
#include <string.h>

int main()
{

    int inputone;
    int inputtwo;
    int age = 12;
    int height = 140;

    printf("Enter Your Age: ");
    scanf("%d", &inputone);

    printf("Enter Your Height: ");
    scanf("%d", &inputtwo);

    if ( inputone >= age  && inputtwo >= height)
    {
        printf("woohoo...You get a chance to Ride a Roller Coaster.\n");
    }
    else
    {
        printf("Sorry\n Try Another Ride");
    }

    return 0;

}
