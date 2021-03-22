#include <stdio.h>
#include <stdlib.h>

void main(){

    int pontos;

    printf("Insira sua pontuacao: ");
    scanf("%d", &pontos);

    if(pontos >= 75){

        printf("\n\n Parabens, vc passou! (com %d pontos)", pontos);

    }else{

        printf("Que pena, vc nao passou! Faltou %d pontos!", (-pontos+75));

    };
}
