#include<stdio.h>

int main(){
    int a[3], b[3], i, acount, bcount;

    for(i = 0 ; i < 3 ; i++){
        scanf("%d", &a[i]);
    }

    for(i = 0 ; i < 3 ; i++){
        scanf("%d", &b[i]);
    }

    for(i = 0 ; i < 3 ; i++){
        if(a[i] > b[i]){
            acount++;
        } else if(a[i] == b[i]){
            continue;
        } else {
            bcount++;
        }
    }

    printf("%d %d", acount, bcount);
}