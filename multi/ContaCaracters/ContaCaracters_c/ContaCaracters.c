/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ContaCaracters.c
 * Author: sebas
 *
 * Created on 18 de diciembre de 2020, 10:43
 */

#include <stdio.h>
#include <stdlib.h>
#define TAMANY 26
/*
 * 
 */
void inicialitzaArray(int* v, int tamany);
char* demanaCadena(char* miisatge);
void contaCaracters(char* cadena, int* lletres);

int main(int argc, char** argv) {
    int tamany = TAMANY;
    int* lletres = (int*) malloc(tamany*sizeof(int));
    inicialitzaArray(lletres, tamany);
    int i;
    for(i = 0; i < TAMANY; i++){
        printf("%d ",*(lletres+i));
    }
    char* cadena = demanaCadena("Donam la cadena");
    printf("\n");
    contaCaracters(cadena, lletres);
    for(i = 0; i < TAMANY; i++){
        printf("%c ",i+97);
    }
    printf("\n");
    for(i = 0; i < TAMANY; i++){
        printf("%d ",*(lletres+i));
    }
    return (0);
}

/**
 *Conta les ocurrencies de cada caracter en una cadena 
 * @param cadena punter a la caden
 * @param lletres punter al contador de lletres
 */
void contaCaracters(char* cadena, int* lletres){
    while(*cadena!='\0'){
        if(*cadena >= 97 && *cadena <= 122)
            lletres[*cadena-97]++;
        cadena++;
    }
}

/***
 * Funció que demana una cadena i torna el punter a la cadena
 * @param missatge punter al missatge
 * @return punter a la cadena introduida
 */
char* demanaCadena(char* missatge){
    char* cadena = (char*) malloc(1024*sizeof(char));
    printf("%s",missatge);
    scanf("%s", cadena);
    return cadena;
}

/**
 * Funció que inicialitza un array de enters a 0
 * @param v punter al array de enters;
 * @param tamany enter en el tamany d'el arreglo
 */
void inicialitzaArray(int* v, int tamany){
    int i;
    for(i = 0; i < tamany; i++){
        *(v+i)=0;
    }
}

