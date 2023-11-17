
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WSFunciones")
public class WSFunciones {

  
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "user") String user, @WebParam(name = "contrasena") String contrasena) {
        if(user.equals("Pavel") && contrasena.equals("Pavel11")){
            return true;
        }else{
            return false;
        }
    }
    
    /*FUNCIONES BASICAS*/
    
    @WebMethod(operationName = "Suma")
    public int Suma(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2  ){
        return num1 + num2;
    }
    
    @WebMethod(operationName = "Resta")
    public int Resta(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2  ){
        return num1 - num2;
    }
    
    @WebMethod(operationName = "Multiplicacion")
    public int Multiplicacion(@WebParam(name = "num1") int num1,@WebParam(name = "num2") int num2  ){
        return num1 * num2;
    }
    
    @WebMethod(operationName = "Division")
    public double Division (@WebParam(name = "num1") double num1,@WebParam(name = "num2") double num2  ){
        
        if(num2 == 0){
            System.out.println("Error");
        }
        return num1/num2;
    }
    
    /*FORMULAS MATEMATICAS*/
    
    @WebMethod(operationName = "FAreaCirculo")
    public double AreaCirculo(@WebParam(name = "radio") double radio){
        
        return Math.PI * radio * radio; 
    }
    
    @WebMethod(operationName = "FSenos")
    public double Senos(@WebParam(name = "anguloA") double anA,@WebParam(name = "anguloB") double anB  ){
        
        double radA = Math.toRadians(anA);
        double radB = Math.toRadians(anB);
        
        double resultado = Math.sin(radA) * Math.cos(radB)+ Math.cos(radA) * Math.sin(radB);
        
        return resultado;
    }
    
    @WebMethod(operationName = "FHipotenusa")
    public double Hipotenusa(@WebParam(name = "a") double a,@WebParam(name = "num2") double b  ){
        
        return Math.sqrt(a*a + b*b);
    }
}
