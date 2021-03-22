-#include<stdio.h>
#include<stdlib.h>
#include<math.h>

void main(){

float x;

printf ("Digite um valor para x!\n");
scanf("%f",&x);

printf("Se x = %.1f entao, f(x) vai ser igual a: ", x);
if(x <= 0){

    printf("x nao pode ser igual a 0!");

}else if (x>0 && x<=2){

    x = pow (x*x + 0.5, 3);
    printf("f(x)= %.5f", x );

}else if(x>2 && x<=10){

    x = 1/(x*x-4);
    printf("f(x)= %.5f", x );

}else if(x>10 && x<=20 ){

    x = 2*sin(x) + cos(4*x);
    printf("f(x)= %.5f", x );

}else if(x>20){

    x = 23.8;
    printf("f(x)= %.5f", x );

};
}
