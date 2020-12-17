/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: sebas
 *
 * Created on 16 de diciembre de 2020, 10:27
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    int costat_curt;//el valor del costat curt
    char caracter;//el valor de caracter en el que faig el rectangle
    //carregue les variables;
    printf("Donam el costat");
    scanf("%d",&costat_curt);
    scanf("%c", &caracter);
    printf("Donam el caracter en el que vols pintar el rectangle");
    scanf("%c", &caracter);
    //pinte el rectangle
    int i,j;
    for(i=0; i<costat_curt;i++){
        for(j=0; j<costat_curt*2; j++){
            if(i==0 || i==costat_curt-1 || j==0 || j==(costat_curt*2)-1)
                printf("%c",caracter);
            else
                printf(" ");
        }
        printf("\n");
    }
    
    return (0);
}

