package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; deu erro porque ponta é um atributo privado
        c1.carga = 80;
        /* Dentro da classe Aula02, eu tenho um método principal
            que está utilizando o objeto c1, que é uma caneta. Então
            ele vai deixar eu mexer em um atributo protegido porque
            ele está dentro de uma classe que utiliza a classe caneta
        */
        // c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        /* Esses métodos (que são públicos) funcionam para modificar
            o atributo tampada (que é privado) porque eles estão
            dentro da própria classe
        */
    }
}
