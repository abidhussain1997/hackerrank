#include<stdio.h>

int main(){
    int cases, i , j;
    scanf("%d", &cases);
    int arr[cases];
    for(i = 0 ; i < cases; i++ ){
        scanf("%d", &arr[i]);
    }
    for(i = 0 ; i < cases; i++ ){
        int height = 1;
        int cycles = arr[i];
        for(j = 0; j < cycles ; j++){
                if(j % 2 == 0){
                    height = height * 2;
                } else {
                    height = height + 1;
                }
        }
        printf("%d\n", height);
    }
}
