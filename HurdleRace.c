#include<stdio.h>

int dose(int n, int arr[], int max_height){
    int i, max = 0;
    for(i = 0; i< n ; i++ ){
        if(arr[i] > max){
            max = arr[i];
        }
    }

    if(max_height < max){
        return (max - max_height);
    } else {
        return 0;
    }

}

int main(){

    int i, num_of_hudles, max_height;
    scanf("%d", &num_of_hudles);
    scanf("%d", &max_height);
    int arr[num_of_hudles];
    for(i = 0; i < num_of_hudles ; i++ ){
        scanf("%d", &arr[i]);
    }

    printf("%d \n", dose( num_of_hudles, arr, max_height));
    return 0;

}
