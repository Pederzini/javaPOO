package aula02;
public class Caneta {
    // Criação dos atributos da caneta e atribuição de visibilidade
    public String modelo;
    public String cor;
    private float ponta;
    // Caso não defina a visibilidade, ela, por padrão, fica como
    // pública para pacote (simplificaremos como pública apenas)
    protected int carga;
    //protected boolean tampada;
    private boolean tampada;
    
    // Criação dos métodos da caneta
    // Void significa sem retorno
    public void status() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Uma caneta " + cor);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
        System.out.println("Está tampada? " + tampada);
    }
    
    // O this está se referindo ao objeto que chamou
    // Quando quero mexer em um atributo de um objeto específico, devo utilizar 
    // o this
    
    public void rabiscar() {
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");         
        }
    }
    
    /*
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar() {
        this.tampada = false;
    }
    */
    
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar() {
        this.tampada = false;
    }
}
