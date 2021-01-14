/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorparking;

/**
 *
 * @author sebbre
 */
public class Parking {
    private String adresa;
    private Vehicle[] vehicles;
    
    Parking(String adresa, int places){
        this.adresa = adresa;
        vehicles = new Vehicle[places];
    }
    
    Parking(String adresa){
        this.adresa = adresa;
        vehicles = new Vehicle[10];
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Vehicle getVehicle(int numero) {
        return vehicles[numero];
    }

    public boolean aparcar(Vehicle v) {
        for(int i = 0; i<vehicles.length; i++){
            if(vehicles[i]==null){
                vehicles[i] = v;
                return true;
            }
        }
        return false;
    }
    
    public int quedenLliures(){
        int lliures = 0;
        for(int i = 0; i<vehicles.length; i++){
            if(vehicles[i]==null){
                lliures++;
            }
        }
        return lliures;
    }
    
}
