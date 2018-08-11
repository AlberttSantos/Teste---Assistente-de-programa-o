
package teste_assistente;


public class Veiculo {
    private float combustivel;
    private float consumo;

    public Veiculo(float consumo) {
        this.consumo = consumo;
        combustivel = 0;
    }
    
   //Metodo que simula o ato de dirigir
   public void dirigir (float distancia){
       float autonomia = 0;
       autonomia = combustivel*consumo;
       
                  
       if (combustivel <= 0) {
           System.out.println("Você não tem combustivel, abasteça o carro");
       }
       else if (autonomia >= distancia){
       System.out.println("Você dirigiu uma distancia de "+distancia); 
       
       // Calculo da quantidade de combustivel atual apos percorrer a distancia setada
       combustivel = this.getCombustivel() - (distancia/consumo);
       System.out.println("Nivel atual de combustivel "+this.getCombustivel());
       
       } else {
           System.out.println("Você não tem combustivel suficiente para percorrer essa distancia");
       }
   }
   
   //Metodo para obter quantidade atual de gasolina no tanque
    public float getCombustivel() {
        return combustivel;
    }
    
    //Metodo para adicionar Gasolina
    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }
 
    
    
}
