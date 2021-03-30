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
public class ElementPedido <T extends Aliment>{
    private T element;
    private int cantitat;

    public ElementPedido(T element, int cantitat) {
        this.element = element;
        this.cantitat = cantitat;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public int getCantitat() {
        return cantitat;
    }

    public void setCantitat(int cantitat) {
        this.cantitat = cantitat;
    }
    
    @Override
    public boolean equals(Object o){
        //return element.equals(((T) o));
    	return element.getNom().equalsIgnoreCase(((T)o).getNom());
    }

    @Override
    public String toString() {
        return "ElementPedido{" + "element=" + element + ", cantitat=" + cantitat + '}';
    }
    
    
}
