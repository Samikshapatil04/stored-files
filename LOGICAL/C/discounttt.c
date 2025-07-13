#include <stdio.h>
#include <string.h>

int main()
{
    char member[25] = "Samiksha";
    char username[25] = "Samikshapatil";
    char entername[25], enterusername[25];

    int Totalamount;
    int Discount;

    printf("Enter Your Name: ");
    scanf("%24s", entername);

    printf("Enter Username: ");
    scanf("%24s", enterusername);

    printf("Enter Your Total Amount: ");
    scanf("%d", &Totalamount);

   
    if ((strcmp(member, entername) == 0 || strcmp(username, enterusername) == 0) && Totalamount >= 5000)
    {
        Discount = Totalamount * 30 / 100;
        printf("You got a 30%% discount!\n");
    }
    else
    {
        Discount = Totalamount * 5 / 100;
        printf("You got a 5%% discount!\n");
    }

    printf("Your final amount after discount is: %d\n", Totalamount - Discount);
   
    return 0;
}
