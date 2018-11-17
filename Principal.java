public class Tipo_Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo t1=new Triangulo(4,8,3);
        
        System.out.println("Perimetro: "+t1.perimetro(4, 10, 4)+" , Tipo de Triangulo: "+t1.tipo_Triangulo());
    }
    
}
