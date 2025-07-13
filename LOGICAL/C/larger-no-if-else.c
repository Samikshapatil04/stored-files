#include<stdio.h>
int main(){
    int i,j;
    printf("Enter the First Number: ");
    scanf("%d", &i);
    printf("Enter the second Number: ");
    scanf("%d", &j);
    
    if (i > j){
        printf("The Number %d is Greater", i);
    }else{
       printf("The Number %d is Greater", j);
    }
}
