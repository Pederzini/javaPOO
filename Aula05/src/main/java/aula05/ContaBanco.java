package aula05;
public class ContaBanco {
    // Definição dos atributos
    // Número da conta
    public int numConta;
    // Corrente(CC) ou poupança(CP)
    protected String tipo;
    // Nome do titular
    private String dono;
    // Saldo na conta
    private float saldo;
    // Conta aberta ou fechada
    private boolean status;
    
    // -------------------------------------------------------------------------

    // Método construtor
    public ContaBanco() {
        /* Para identificar o Método Construtor, é o método que 
        tem o mesmo nome que a sua classe*/
        this.saldo = 0;
        this.status = false;
    }
    
    // -------------------------------------------------------------------------
    
    // Getters e Setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    // Fim dos Getters e Setters
    
    // -------------------------------------------------------------------------
   
    // Início dos métodos comuns
    
    public void estadoAtual() {
        System.out.println("-------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        if(isStatus()) {
            System.out.println("Status: aberta");
        } else {
            System.out.println("Status: fechada");
        }
    }
    
    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        System.out.println("Conta aberta com sucesso!");
        // Quando abro a conta, tenho que falar se é CC ou CP
        // Se for CC, começa com R$50,00
        // Se for CP, começa com R$150,00
        if(getTipo() == "CC") {
            setSaldo(50);
        } else if (getTipo() == "CP") {
            setSaldo(150);
        }
    }
    
    public void fecharConta() {
        // Não pode ter dinheiro lá dentro e não pode ter débito
        if(getSaldo() == 0) {
            setStatus(false);
        } else if(getSaldo() > 0) {
            System.out.println("Você ainda possui saldo na conta "
                    + "de " + getDono());
        } else {
            System.out.println("Sua conta está em débito");
        }
    }
        
    public void depositar(float valor) {
        // Conta tem que estar aberta (status true)
        if(isStatus()) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado na conta de " + getDono());
        } else {
            System.out.println("Conta está fechada, não pode depositar");
        }
    }
        
    public void sacar(float saque) {
        // Conta tem que estar aberta (status true)
        // Tem que ter saldo
        if(isStatus()) {
            if(getSaldo() >= saque) {
                setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado na conta de " + getDono());
            } else {
                System.out.println("Saldo insuficiente para o saque desejado "
                        + "na conta de " + getDono());
            }
        } else {
            System.out.println("Conta está fechada, não pode sacar");
        }
    }
        
    public void pagarMensal() {
        // Quando chamar o método, a mensalidade é cobrada diretamente do saldo
        // Para CC, R$12,00
        // Para CP, R$20,00
        float valMensal = 0;
        if(getTipo() == "CC") {
            valMensal = 12;
        } else if (getTipo() == "CP") {
            valMensal = 20;
        }
        
        if(isStatus()) {
            if(getSaldo() >= valMensal) {
                setSaldo(getSaldo() - valMensal);
                System.out.println("Mensalidade paga com sucesso");
            } else {
                System.out.println("Saldo insuficiente para cobrança na conta"
                        + "de " + getDono());
            }
        } else {
            System.out.println("Conta fechada, não há mensalidade");
        }
    }
    // Fim dos métodos comuns
}
