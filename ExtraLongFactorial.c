#include<stdio.h>

int main(){
    int n, i;
    long double fact = 1;
    scanf("%d", &n);
    for(i = 1 ; i<=n ; i++ ){
        fact = fact * i;
    }

    printf("%.0Lf", fact);
}
