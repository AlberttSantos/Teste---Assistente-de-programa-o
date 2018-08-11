
package teste_assistente;

public class Teste_Assistente {

 
    public static void main(String[] args) {
        
        //Consumo do carro 10km/l
        Veiculo v = new Veiculo(10);
        
        //Definindo quantidade de conbustivel no tanque por litro
        v.setCombustivel(10);
        
        //Definindo quantidade de KM percorridos
        v.dirigir(50);

        
    }
    
}
