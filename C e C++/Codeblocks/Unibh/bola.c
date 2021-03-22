#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main(){

    float aux1,h,t;
    char str[] = "<- a partir daqui a bola voltou ao solo.";

    aux1=0;
    printf("|---------------------------|");
    printf("\n|   TEMPO(s)  |  ALTURA(m)  |");
    printf("\n|-------------|-------------|");

    for ( t=0; t<=3; t+=0.1 ){

        aux1 = 9.81*t*t;
        aux1 = aux1/2;
        h = 10*t;
        h = h-aux1;

        printf("\n|   %.3fs    |", t);

        if(h>=0){

            printf("   %.3fm    |", h);
            printf("\n|-------------|-------------|");

        }else{

            printf("   0.000m    |%s",str);
            printf("\n|-------------|-------------|");
            strcpy(str," ");
        }
    }
}
