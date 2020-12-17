/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: sebas
 *
 * Created on 16 de diciembre de 2020, 10:51
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    //variables
    int costat_curt;
    char caracter;
    //carrega de variables
    cout << "Donam el costat curt del rectangle";
    cin >> costat_curt;
    cout << "Donam el caracter per pintar el rctangle";
    cin >> caracter;
    
    //pinte el rectangle
    int i, j;
    for(i = 0; i< costat_curt; i++){
        for(j = 0; j< costat_curt*2; j++){
            if(i==0 || i == costat_curt-1 || j==0 || j==(costat_curt*2)-1)
                cout << caracter;
            else
                cout << " ";
        }
        cout << "\n";
    }
    return 0;
}

