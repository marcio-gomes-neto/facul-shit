#include <stdio.h>
#include <stdlib.h>

void main(){

    int nTemp,tempU,cont,tempTotal;

    cont=0;
    tempTotal=0;

    printf("Algoritmo da temperatura media!\n\n");
    printf("Quantas temperaturas foram registradas? ");
    scanf("%d", &nTemp);

    while (cont<nTemp){

        printf("insira o valor de uma temperatura registrada: ", tempU);
        scanf("%d", &tempU);
        tempTotal=tempTotal+tempU;



        system("CLS");
        printf("por enquanto, a media = %d\n\n", tempTotal/nTemp);
        cont=cont+1;
    }

        system("CLS");
        printf("a media final foi: %d\n", tempTotal/nTemp);
}
