public class Triangulo {

public Triangulo(int l1, int l2, int l3){
    
   lado1=l1;
   lado2=l2;
   lado3=l3;
}    
    

public String tipo_Triangulo(){
    
    if(lado1==lado2 || lado1==lado3 || lado2==lado3){
        
        return "Isosceles";
    }
    else{
        if(lado1==lado2 & lado1==lado3)
        
        return "Equilatero";    

    else{
        return "Escaleno";    
        }
      }
    }
    
    public int perimetro(int lado1, int lado2, int lado3){
        
        int resultado;
        
        resultado=lado1+lado2+lado3;
        
        return resultado;
    }



int lado1,lado2,lado3;

}
