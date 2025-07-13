#include<stdio.h>
int main(){
    int i;
    printf("Enter the Age: ");
    scanf("%d", i);
    if (i <= 12){
        printf("Child Ticket");
    }else{
        printf("Adult Ticket");
    }
}