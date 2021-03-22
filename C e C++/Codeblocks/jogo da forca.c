#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iostream>




void main(){
 char palavra[255];

setbuf(stdin, 0);

fgets(palavra, 255, stdin);

palavra[strlen(palavra)];

printf("%s", palavra);

}
