#include<stdio.h>


int fibmod(int t1, int t2, int n){
    if(n == 1 ){
        return t2; 
    } else {
        return fibmod(t2, (t1 + (t2 * t2)), n - 1 );
    }
}

int main(){
    int i, t1, t2, n , fibo = 0;
    scanf("%d %d %d", &t1, &t2, &n);
    fibo = fibmod(t1, t2, n - 1);
    printf("%d", fibo);
}
