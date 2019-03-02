#include <assert.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* readline();
char** split_string(char*);

// Complete the formingMagicSquare function below.
int formingMagicSquare(int arr[3][3]) {
    int i,j;
    int row1 = 0;
    int row1diff, row2diff, row3diff, col1diff, col2diff, col3diff, dig1diff, dig2diff;
    int row2 = 0;
    int row3 = 0;
    int col1 = 0;
    int col2 = 0;
    int col3 = 0;
    int dig1 = 0; 
    int dig2 = 0;
    int diff = 0;
   

    for(i = 0 ; i< 3 ; i++){
        for(j = 0 ; j < 3 ; j++){
            if(i == 0){
                row1 = row1 + arr[i][j];
            } else if( i == 1 ){
                row2 = row2 + arr[i][j];
            } else if (i == 2 ){
                row3 = row3 + arr[i][j];
            }
            
            if(j == 0){
                col1 = col1 + arr[i][j];
            } else if(j == 1){
                col2 = col2 + arr[i][j];
            } else if(j == 2){
                col3 = col3 + arr[i][j];
            }

            if( i == j){
                dig1 = dig1 + arr[i][j];
            }

            if( i == 3 - j - 1){
                  dig2 = dig2 + arr[i][j];
            }
        }
    }

    row1diff = 15 - row1;
    row2diff = 15 - row2;
    row3diff = 15 - row3;
    col1diff = 15 - col1;
    col2diff = 15 - col2;
    col3diff = 15 - col3;
    dig1diff = 15 - dig1;
    dig2diff = 15 - dig2;

    if(row1diff == col1diff && row1diff == dig1diff){
         diff = diff +  ((arr[0][0] + row1diff) - arr[0][0]);
         arr[0][0] = arr[0][0] + row1diff;
         row1diff = arr[0][0] - row1;
         col1diff = arr[0][0] - col1;
         dig1diff = ar[0][0] - dig1;
     } 

     if( row1diff == col2diff ){
         if(row1diff != 0 && col2diff != 0){
             if(row1diff < 0 || col2fiff < 0){
             
             }
             diff = diff +  ((arr[0][1] + row1diff) - arr[0][1]);
             arr[0][1] = arr[0][1] + row1diff;
             row1diff = 0;
             col2diff = 0;
         }
     }

     if( row1diff == col3diff && row1diff == dig2diff){
         if(row1diff != 0 && col3diff != 0 && dig2diff != 0){
             diff = diff +  ((arr[0][2] + row1diff) - arr[0][2]);
             arr[0][2] = arr[0][2] + row1diff;
             row1diff = 0;
             col3diff = 0;
             dig2diff = 0;
         }
     }

    for(i=0;i< 3 ; i++){
        for(j=0;j<3;j++){
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}

int main()
{
    int arr[3][3];
    int i,j;
    for(i = 0 ; i< 3 ; i++){
        for(j = 0 ; j< 3 ; j++){
            scanf("%d" , &arr[i][j]);
        }
    }
    formingMagicSquare(arr);
    return 0;
}


