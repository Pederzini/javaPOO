package exercicioaula02;
public class ComprarVideogame {
    String marca;
    String modelo;
    float preco;
    boolean quebrado;
    
    void informacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preco: " + this.preco);
        System.out.println("Quebrado: " + this.quebrado);
        System.out.println("");
    }
    
    void comprar() {
        if (this.preco > 4000) {
            System.out.println("Muito caro para comprar!");
            System.out.println("");
        } else if (this.quebrado == true) {
            System.out.println("Videogame quebrado");
            System.out.println("");
        } else {
            System.out.println("Comprado com sucesso!");
            System.out.println("");
        }
    }
}
