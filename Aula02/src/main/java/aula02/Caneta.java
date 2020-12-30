package aula02;
public class Caneta {
    // Criação dos atributos da caneta
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    // Criação dos métodos da caneta
    // Void significa sem retorno
    void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Uma caneta " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Está tampada? " + tampada);
    }
    
    // O this está se referindo ao objeto que chamou
    // Quando quero mexer em um atributo de um objeto específico, devo utilizar 
    // o this
    
    void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");         
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
