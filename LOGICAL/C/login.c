#include <stdio.h>
#include <string.h>

int main()
{
    char email[25] = "samiksha123@gmail.com";
    char username[25] = "Samikshap";
    char password[25] = "Samiksha@123";

    char enteremail[25], enterusername[25], enterpassword[25];

    printf("Enter Email: ");
    scanf("%24s", enteremail);

    printf("Enter Username: ");
    scanf("%24s", enterusername);

    printf("Enter Password: ");
    scanf("%24s", enterpassword);

    
    if ((strcmp(email, enteremail) == 0 || strcmp(username, enterusername) == 0) && strcmp(password, enterpassword) == 0)
    {
        printf("Login Successful\n");
    }
    else
    {
        printf("Invalid Input! \nTry Again...\n");
    }

    return 0;
}
