#include <stdio.h>

 int findNumber(int a_count, int a[]);
 int main(){
     int n, i;
     scanf("%d", &n);
     int arr[n];
     for(i = 0; i < n ; i++){
         scanf("%d", &arr[i]);
     }
     printf("%d\n",findNumber(n, arr));
     
     return 0;
 }

 int findNumber(int a_count, int a[]){

 //int a_count = sizeof(a[]) / 4;
 int count, max = 0;
      int i,j,k, temp, flag, diff;
      for(i = 0 ; i < a_count - 1 ; i++ ){
          for( j = i + 1 ; j < a_count ; j++){
              if(a[i] > a[j] ){
                  temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
              }
          }
      }

      //for(i=0;i < a_count ;i++){
        // printf("%d " , a[i]);
      //}

      for(i = 0 ; i < a_count; i++){
          if(a[i] >= a[i+1]){
              diff = a[i] - a[i-1];
          } else {
              diff = a[i+1] - a[i];
          }

          if(diff <= 1){
              count++;
          } else {
              if(max < count){
                  max = count;
              }
              count = 0;
          }
      }
      return max;
 }
