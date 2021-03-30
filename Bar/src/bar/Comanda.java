/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bar;

import java.util.ArrayList;

/**
 *
 * @author sebbre
 */
public class Comanda {
    private ArrayList < ElementPedido < Menjar>> llista;
    private ElementPedido < Beguda> beguda;
    private String client;

    public Comanda(String client) {
        llista = new ArrayList < ElementPedido < Menjar>>();
        this.client = client;
    }
    
    
    
    public ArrayList<ElementPedido<Menjar>> getLlista() {
		return llista;
	}
    
    public ElementPedido<Beguda> getBeguda(){
    	return beguda;
    }

    
    public void afegirMenjar(Menjar m, int cantitat) {
    	try {
	    	if(llista.contains(m)) {
	    		throw new ElementDuplicatException();
	    	}
	    	llista.add(new ElementPedido<Menjar>(m,cantitat));
    	}catch(ElementDuplicatException e) {
    		setQuantitatMenjar(m,cantitat+llista.get(llista.indexOf(m)).getCantitat());
    		System.out.println(e);
    	}
    	
    }
    
    public void setQuantitatMenjar(Menjar m, int cantitat) {
    	try {
    		if(!llista.contains(m)) {
	    		throw new ElementNoEstaException();
	    	}
    	}catch(ElementNoEstaException e) {
    		afegirMenjar(m, cantitat);
    		System.out.println(e);
    	}
    	try {
    		llista.get(llista.indexOf(m)).setCantitat(cantitat);
    	}catch(Exception e) {
    		System.out.println(e);
    	}
    }
    
    public void afegirBeguda(Beguda b, int cantitat) {
    	beguda = new ElementPedido<Beguda>(b,cantitat);
    }
    
    public void setQuantitatBeguda(int cantitat) throws BegudaNoDeclaradaException{
    	if(beguda==null)
    		throw new BegudaNoDeclaradaException();
    	beguda.setCantitat(cantitat);
    }

	public String llistar() throws ComandaBuidaException{
        String cadena = "";
        
        if(llista.size()>0){
            cadena += "Menjars: \n";
            //for(ElementPedido a : llista)
            for(int i= 0; i< llista.size(); i++)
            	cadena += "\t"+llista.get(i).toString()+"\n";
                //cadena += "\t"+a.toString()+"\n";
        }
        if(beguda!=null){
            cadena += "Beguda: \n";
            cadena += "\t"+beguda.toString()+"\n";
        }
        if(cadena.equalsIgnoreCase("")){
            throw new ComandaBuidaException();
        }
        return cadena;
    }
    
    
}
