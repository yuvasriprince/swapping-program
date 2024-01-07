
#include <stdio.h>
int main(){
    int name1,name2;
    printf("enter the number: ");
    scanf("%d",&name1);
    printf("enter your second number: ");
    scanf("%d",&name2);
    printf("before the Swapping %d\n",name1);
    printf("before the Swapping %d\n",name2);
    name1=name1+name2;
    name2=name1-name2;
    name1=name1-name2;
    printf("after the Swapping %d\n",name1);
    printf("after the Swapping %d\n",name2);
    return 0;
}