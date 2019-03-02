#include <stdio.h>

int main(){
    int idx = 248;
    int arr[idx];
    int a = 21;
    int b = 21;
    int temp_a = a;
    int temp_b = b;
    int itr = -1;

    while(temp_a != 0){
        int itr++;
        int rem_a = temp_a % 10;
        temp_b = b;
        while(temp_b != 0){
            int rem_b = temp_b % 10;
            int mul = rem_a * rem_b
            temp_b = temp_b / 10;
        }
        temp_a = temp_a / 10;
    }
}