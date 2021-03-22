#include <stdio.h>
#include <stdlib.h>

void main(){

    int x,y,z;

    printf("Tipos de triangulo! \n");
    printf("\nExistem 3 tipos de triangulo, que recebem os nomes de: equilatero, escaleno e isosceles!");
    printf("\nPara saber qual e qual, voce tem que saber...");

    printf("\nO valor do primeiro lado do triangulo: ");
    scanf("%d",&x);
    printf("\nO valor do segundo lado do triangulo: ");
    scanf("%d",&y);
    printf("\nO valor do terceiro lado do triangulo: ");
    scanf("%d",&z);

    printf("\n\n");

    if(x==y && y==z){

        printf("esse triangulo e um equilatero, com 3 lados iguais!\n\n");
    };

    if(x!=y && y!=z && x!=z){

        printf("esse triangulo e um escaleno, com 3 lados diferentes!\n\n");
    };

    if (x==y || x==z || y==z){

        printf("esse triangulo e um isosceles, com 2 lados iguais e 1 diferente\n\n");
    };

}
