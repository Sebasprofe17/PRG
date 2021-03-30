/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

/**
 *
 * @author sebbre
 */
public class ElementNoEstaException extends Exception {

    public ElementNoEstaException() {
        super("L'element no està a la llista");
    }
    
}
