#include <stdio.h>
#include <stdlib.h>

void main(){

    int cont, n, c;

    c=1;

    while(c==1){
    system("CLS");
    printf ("Escolha um numero para ver a tabuada (de 10) dele ");
    scanf ("%d", &n);

    for (cont=1; cont<=10; cont++){

        printf("\n %d x %d = %d" ,n,cont,n * cont);
    }

    printf ("\n\nDeseja ver outra tabuada? (1 = Sim e 2 = Nao) ");
    scanf ("%d", &c);
    while (c!=1 && c!=2){

        printf("Favor digitar apenas 1 para ver a tabuada de outro numero e 2 para sair do programa! ");
        scanf ("%d", &c);

    }
}
}
