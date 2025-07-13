#include <stdio.h>
#include <string.h>

int main()
{
    char member[25] = "Samiksha";
    char username[25] = "Samikshapatil";
    char entername[25], enterusername[25];

    int Totalamount;
    int Discount; 

    printf("Enter Username: ");
    scanf("%24s", enterusername);

    printf("Enter Your Total Amont:");
    scanf("%d", &Totalamount);

    
    if ((strcmp(member, entername) == 0 || strcmp(username, enterusername) == 0) && Totalamount >= 5000)
    {
        Discount = Totalamount * 30 / 100;
        printf("Your Amount Will be:", Discount);
    }
    else
    {
        Discount = Totalamount * 5 / 100;
        printf("Your Amount Will be:", Discount);
    }
   printf("Your final amount after discount is: %d\n", Totalamount - Discount);
    return 0;
}
