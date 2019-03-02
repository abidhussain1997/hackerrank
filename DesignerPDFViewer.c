#include <stdio.h>
#include <string.h>


int main(){
    int arr[26];
    int i, max = 0;
    for(i = 0 ; i < 26 ; i ++){
        scanf("%d", &arr[i]);
    }
    
    char str[10];
    scanf("%s", str);
    int size  = strlen(str);
    for(i = 0 ; i < size ; i++){
        int a = str[i] - 97;
        if(arr[a] > max){
            max = arr[a];
        }
    }

    int result = size * max;
    printf("%d", result);
    return 0;
}
