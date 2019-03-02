#include<stdio.h>

int main(){

    int i, j, testCases;

    scanf("%d" , &testCases);

    for(i = 0 ; i < testCases ; i++){
        int students, threshold;
        int present_std = 0;

        scanf("%d" , &students);
        scanf("%d" , & threshold);

        int std_arr[students];

        for(j = 0 ; j < students ; j++){
            scanf("%d", &std_arr[j]);
        }

        for(j = 0 ; j < students ; j++){
            if(std_arr[j] <= 0){
                present_std++;
            }
        }

        if(present_std >= threshold ){
            printf("NO");
        } else {
            printf("YES");
        }

    
    }

}
