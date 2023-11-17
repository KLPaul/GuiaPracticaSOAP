
package test;

import wsdl.WSFunciones;
import wsdl.WSFunciones_Service;

public class TestWS {
    
    public static void main(String[] args) {
        
        WSFunciones_Service servicio = new WSFunciones_Service();
        WSFunciones cliente = servicio.getWSFuncionesPort();
        
        //LOGIN
        
        if(cliente.login("Pavel", "Pavel")){
            System.out.println("Credenciales Correctas");
        }else{
            System.out.println("Credenciales Incorrectas");
        }
        
        //SUMA
        
        System.out.println("Suma: "+cliente.suma(3, 3));
        
        //RESTA
        
        System.out.println("Resta: "+cliente.resta(8, 4));
        
        //MULTIPLICACION
        
        System.out.println("Multiplicacion: "+cliente.multiplicacion(5, 5));
        
        //DIVISON
        
        System.out.println("Division: "+cliente.division(8, 2));
        
        //SUMA SENOS
        
        System.out.println("Suma Senos: "+cliente.fSenos(8, 2));
        
        //HIPOTENUSA
        
        System.out.println("Hipotenusa: "+cliente.fHipotenusa(11, 3));
        
        //AREA CIRCULO
        
        System.out.println("Area Circulo: "+cliente.fAreaCirculo(14));
    }
    
    
}
