package exercicioaula02;
public class ExercicioAula02 {
    public static void main(String[] args) {
       ComprarVideogame v1 = new ComprarVideogame();
       v1.marca = "Xbox";
       v1.modelo = "Series X";
       v1.preco = 4500;
       v1.quebrado = false;
       v1.informacoes();
       v1.comprar();

       ComprarVideogame v2 = new ComprarVideogame();
       v2.marca = "Playstation";
       v2.modelo = "PS5";
       v2.preco = 4000;
       v2.quebrado = true;
       v2.informacoes();
       v2.comprar();
     
       ComprarVideogame v3 = new ComprarVideogame();
       v2.marca = "Playstation";
       v2.modelo = "PS5";
       v2.preco = 4000;
       v2.quebrado = false;
       v2.informacoes();
       v2.comprar();
    }
}
