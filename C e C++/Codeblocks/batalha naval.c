#include <stdio.h>
#include <stdlib.h>

void lt(){
    system("CLS");
}

void definetabuleiro5x5(char tabuleiro[10][10]){
    int i,j;
    for (i = 0; i < 10; i++){
        for (j = 0; j < 10; j++){
        tabuleiro [i][j] = 'A';
        };
    };
};
void definemascara5x5(char mascara[10][10]){
    int i,j;
    for (i = 0; i < 10; i++){
        for (j = 0; j < 10; j++){
        mascara [i][j] = 'X';
        };
    };
};
void mostratabuleiro5x5(char tabuleiro[10][10]){
    int i,j;
    for (i = 0; i < 10; i++){
        for (j = 0; j < 10; j++){
            printf("%c  ", tabuleiro [i][j]);
        };
        printf("\n");
    };
};
void mostramascara5x5(char mascara[10][10]){
    int i,j;
    for (i = 0; i < 10; i++){
        for (j = 0; j < 10; j++){
            printf("%c  ", mascara [i][j]);
        };
        printf("\n");
    };
};


void posicionanavios(char tabuleiro[10][10]){
    int a,b,navio,c,qtd;

    definetabuleiro5x5(tabuleiro);
    qtd = 4;
    for (navio = 0; navio < 4; navio++){
        lt();
        mostratabuleiro5x5(tabuleiro);

        a = -1;
        b = -1;

        printf("Posicione agora, %d cargueiros!(2 casas)\n", qtd);

        while (a < 1 || a > 10){
            printf("Escolha uma linha de 1 a 10: ");
            scanf("%d", &a);
        };
        while (b < 1 || b > 10){
            printf("Escolha uma coluna de 1 a 10: ");
            scanf("%d", &b);
        };
        tabuleiro[a-1][b-1]='N';
        lt();
        mostratabuleiro5x5(tabuleiro);
        printf("Mas para qual direcao?\n");
        printf("1- Cima\n");
        printf("2- Baixo\n");
        printf("3- Direita\n");
        printf("4- Esquerda\n");
        c = 5;
        while (c > 4 || c < 1){
            scanf("%d",&c);
            switch(c){
                case 1:
                    tabuleiro[a-2][b-1]='N';
                    break;
                case 2:
                    tabuleiro[a][b-1]='N';
                    break;
                case 3:
                    tabuleiro[a-1][b]='N';
                    break;
                case 4:
                    tabuleiro[a-1][b-2]='N';
                    break;
                default:
                    printf("opcao invalida!\n");
                    break;
            };
        };
        qtd = qtd-1;
    };
    qtd = 3;
    for (navio = 0; navio < 3; navio++){
    lt();
        mostratabuleiro5x5(tabuleiro);

        a = -1;
        b = -1;

        printf("Posicione agora, %d cruzadores!(3 casas)\n", qtd);

        while (a < 1 || a > 10){
            printf("Escolha uma linha de 1 a 10: ");
            scanf("%d", &a);
        };
        while (b < 1 || b > 10){
            printf("Escolha uma coluna de 1 a 10: ");
            scanf("%d", &b);
        };
        tabuleiro[a-1][b-1]='N';
        lt();
        mostratabuleiro5x5(tabuleiro);
        printf("Mas para qual direcao?\n");
        printf("1- Cima\n");
        printf("2- Baixo\n");
        printf("3- Direita\n");
        printf("4- Esquerda\n");
        c = 5;
        while (c > 4 || c < 1){
            scanf("%d",&c);
            switch(c){
                case 1:
                    tabuleiro[a-2][b-1]='N';
                    lt();
                    mostratabuleiro5x5(tabuleiro);

                    printf("E agora?\n");
                    printf("1- Cima novamente\n");
                    printf("2- Para baixo\n");
                    c = 5;
                    while (c > 4 || c < 1){
                        scanf("%d",&c);
                        switch(c){
                            case 1:
                                tabuleiro[a-3][b-1]='N';
                                break;
                            case 2:
                                tabuleiro[a][b-1]='N';
                                break;
                            default:
                                printf("opcao invalida!\n");
                                break;
                            };
                        };

                    break;
                case 2:
                    tabuleiro[a][b-1]='N';
                    lt();
                    mostratabuleiro5x5(tabuleiro);

                    printf("E agora?\n");
                    printf("1- Cima \n");
                    printf("2- Baixo novamente\n");
                    c = 5;
                    while (c > 2 || c < 1){
                        scanf("%d",&c);
                        switch(c){
                            case 1:
                                tabuleiro[a-2][b-1]='N';
                                break;
                            case 2:
                                tabuleiro[a+1][b-1]='N';
                                break;
                            default:
                                printf("opcao invalida!\n");
                                break;
                            };
                        };
                    break;
                case 3:
                    tabuleiro[a-1][b]='N';
                    lt();
                    mostratabuleiro5x5(tabuleiro);

                    printf("E agora?\n");
                    printf("1- Direita novamente \n");
                    printf("2- Esquerda\n");
                    c = 5;
                    while (c > 2 || c < 1){
                        scanf("%d",&c);
                        switch(c){
                            case 1:
                                tabuleiro[a-1][b+1]='N';
                                break;
                            case 2:
                                tabuleiro[a-1][b-2]='N';
                                break;
                            default:
                                printf("opcao invalida!\n");
                                break;
                        };
                    };
                    break;
                case 4:
                    tabuleiro[a-1][b-2]='N';
                    lt();
                    mostratabuleiro5x5(tabuleiro);

                    printf("E agora?\n");
                    printf("1- Direita \n");
                    printf("2- Esquerda novamente\n");
                    c = 5;
                    while (c > 2 || c < 1){
                        scanf("%d",&c);
                        switch(c){
                            case 1:
                                tabuleiro[a-1][b-1]='N';
                                break;
                            case 2:
                                tabuleiro[a-1][b-3]='N';
                                break;
                            default:
                                printf("opcao invalida!\n");
                                break;
                        };
                    };
                    break;
               default:
                printf("opcao invalida!\n");
                break;
            };
        };
        qtd = qtd-1;
    };
    };

void jogada(int tentativa){
    int pontos,acerto,a, b;
    char tabuleiro[10][10], mascara[10][10], pst;
    pontos = 0;
    tentativa = 0;
    a = 0;
    b = 0;
    acerto = 0;

    definetabuleiro5x5(tabuleiro);
    definemascara5x5(mascara);
    posicionanavios(tabuleiro);

    while(acerto != 17){
        lt();
        mostramascara5x5(mascara);
        a = 0;
        b = 0;

        printf("\nTentativas: %d\n", tentativa);
        printf("\nAcertos: %d\n", acerto);

        while (a < 1 || a > 10){
            printf("Escolha uma linha de 1 a 10: ");
            scanf("%d", &a);
        };

        while (b < 1 || b > 10){
            printf("Escolha uma coluna de 1 a 10: ");
            scanf("%d", &b);
        };


        mascara[a-1][b-1] = tabuleiro[a-1][b-1];
        tentativa = tentativa+1;
        printf("\nTentativas: %d\n", tentativa);
        if(tabuleiro[a-1][b-1] = 'N'){
            acerto= acerto+1;
        };
    };
};
void main(){
    int tentativa;
    char a;
    a='j';
    while(a!='s' && a!='n'){
        jogada(tentativa);

    };
};
