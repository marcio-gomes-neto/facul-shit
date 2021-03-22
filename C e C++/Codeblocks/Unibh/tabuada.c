#include <stdio.h>
#include <stdlib.h>

void main(){

    int cont1,cont2;

    for(cont1=1; cont1 < 11; ++cont1){

        if(cont1<10){
            printf("\n 0%d ", cont1);
        }else{
            printf("\n %d ", cont1);
        };

        for(cont2=2; cont2 < 11; ++cont2){

            if(cont1*cont2<10){
                printf(" 0%d ", cont1*cont2);
            }else{
                printf(" %d ", cont1*cont2);
            };

    };
};

}
