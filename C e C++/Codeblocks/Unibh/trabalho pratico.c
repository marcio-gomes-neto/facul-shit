#include <stdio.h>
#include <stdlib.h>

void main(){

    float cargaInicial,carga,aux,aux1;
    int horas;
    horas=0;
    aux1=1;
    printf("--------Simulador de descarga da bateria--------\n");
    printf("Insira a carga inicial: ");
    scanf("%f", &cargaInicial);
    carga = cargaInicial;

    while ((carga*aux1) >= 1){

        printf("-------------------------------------------------\n");
        printf("Horas passadas: %d\n", horas);
        printf("Carga: %0.2f%%\n",carga*aux1);

        if((carga*aux1)<=20 && 10<=(carga*aux1)){
            printf("ALERTA! Bateria Fraca!\n");
        }
        if ((carga*aux1)< 10){
            printf("ALERTA! Bateria Critica! Conecte ao carregador!\n");
        }
        printf("-------------------------------------------------\n");

        horas=horas+1;

        aux = (-0.1)*horas;
        aux1 = (pow(2,aux));
    }
    printf("A carga da bateria chegou ao fim e precisa ser recarregada!\n");
    printf("A bateria que comecou em %0.2f%% durou %d horas!", cargaInicial, horas-1);
    printf("\n-------------------------------------------------");
}
