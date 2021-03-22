#include <stdio.h>
#include <stdlib.h>

void main(){

    int temp,somaTotal,nTemps;
    temp=0;
    nTemps=0;
    printf("Algoritmo da temperatura media!\n\n");
    printf("Insira quantas temperaturas quiser e receba atualizacoes da media\n");
    printf("Digite temperatura = 999 para encerrar o programa\n\n");

    while(temp!=999){

        printf("insira a temperatura = ");
        scanf ("%d", &temp);

        if (temp!=999){
            somaTotal=somaTotal+temp;
            nTemps=nTemps+1;
        }

    system("CLS");
        printf("por enquanto a media da temperatura e: %d\n\n", somaTotal/nTemps);
    }

    system("CLS");
    printf("\npor fim, a media da temperatura foi: %d\n",somaTotal/nTemps);
    printf("e foi registrado um numero %d temperaturas\n",nTemps);

}
