#include <stdio.h>
#include <stdlib.h>
#include <string>
#include <iostream>
#include <time.h>

using namespace std;

void limpatela(){
    system("CLS");
}


string escolhe_palavra(){

    string palavra;
    char val;
    val = 'n';
    while(val != 's'){
        cout << "Escolha uma palavra: ";
        cin >> palavra;

        limpatela();
        cout << "tem certeza que essa eh a palavra escolhida? '" << palavra << "'\ns/n\n";
        cin >> val;
        while (val != 's' && val !=  'n' ){
             cout << "\nopcao invalida, favor usar apenas s ou n";
             cin >> val;
        };
    };

    return palavra;
}

void menu(){
    int opt;
    opt = -1;

    while (opt != 1 && opt != 2 && opt != 3){

        cout << "Jogo da forca";
        cout << "\n 1 - Jogar";
        cout << "\n 2 - Sobre";
        cout << "\n 3 - teste";
        cout << "\n Selecione a opcao e aperte ENTER\n";

        cin >> opt;
        switch(opt){
        case 1:
            cout << "Jogo iniciado";
            break;
        case 2:
            cout << "Informações do jogo";
            break;
        case 3:
            escolhe_palavra();

            cout << "tchau tchau";
            break;
        default:
            limpatela();
            cout << "opcao invalida\n";
            break;
        }
    }
}


int main(){

    menu();


    return 0;
};
