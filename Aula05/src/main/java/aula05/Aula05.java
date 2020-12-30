package aula05;
public class Aula05 {
    public static void main(String[] args) {
        // Criação da conta da Mimzy
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Mimzy");
        p1.abrirConta("CC");
        
        // Criação da conta da Lilica       
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Lilica");
        p2.abrirConta("CP");
        
        // Operação de depósito
        p1.depositar(100);
        p2.depositar(500);
        
        // Operação de saque
        p1.sacar(100);
        p2.sacar(600);
        
        // Fechar conta
        p1.fecharConta();
        p2.fecharConta();
        
        // Pagar mensalidade
        p1.pagarMensal();
        p2.pagarMensal();
        
        // Consultar situação da conta
        p1.estadoAtual();
        p2.estadoAtual();              
    }
}
