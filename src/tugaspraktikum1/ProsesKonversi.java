/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum1;

/**
 *
 * @author Fadhil
 */
public class ProsesKonversi {double Celcius;

    public ProsesKonversi(double Celcius) {
        this.Celcius = Celcius;
    }
    
    double Fahrenheit(){
        return (Celcius*1.8+32);
    }
    double Reamur(){
        return (Celcius*0.8);
    }
    double Kelvin(){
        return (Celcius+273.15);
    }
    String kondisi(){
        if(Celcius <= 0){
            return "Beku";
        }
        else if(Celcius >= 100){
            return "Mendidih";
        }
        else{
            return "Normal";
        }
    }
    
}
