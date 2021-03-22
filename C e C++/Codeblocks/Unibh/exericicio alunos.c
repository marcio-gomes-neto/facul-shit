#include <stdio.h>
#include <stdlib.h>

void main(){

    float aux1, bact;
    int t;

    bact=0;
    t=0;
    aux1=0;

    while(bact != 19200){

        aux1= pow(2 , 0.4*t);
        bact=1200*aux1;
        printf("-------------------\n");

        printf("Hora %d - ", t);
        printf("%.2f\n",bact);

        if(bact!=19200){
        t = t+1;
        }

    }
    printf("-------------------\n");

    printf("\nDemorou %d horas para a colonia chegar a %.2f individuos!\n", t,bact);
}
