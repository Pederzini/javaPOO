package aula06;
public class ControleRemoto implements Controlador {
   // Atributos
   private int volume;
   private boolean ligado;
   private boolean tocando;
   // Métodos especiais

    public ControleRemoto() {
        volume = 50;
        ligado = true;
        tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
   
    // Métodos abstratos

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + isLigado());
        System.out.println("Está tocando? " + isTocando());
        System.out.print("Volume: " + getVolume());
        for(int i = 0; i <= getVolume(); i+=10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado()) {
            setVolume(getVolume() + 1);
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()) {
           setVolume(getVolume() - 1);
        } else {
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(isLigado() && getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if(isLigado() && !isTocando()) {
            setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }

    @Override
    public void pause() {
        if(isLigado() && isTocando()) {
            setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
}
