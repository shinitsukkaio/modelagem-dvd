class AparelhoDVD {
    boolean ligado = false;
    int volume = 2;
    Filme filme = null;
    boolean tocando = false;
    
    public void ligar() {
        ligado = true;
        System.out.println("DVD ligado");
    }
    
    public void desligar() {
        ligado = false;
        tocando = false;
        System.out.println("DVD desligado");
    }
    
    public void aumentarVolume() {
        if (!ligado) {
            System.out.println("DVD está desligado");
            return;
        }
        if (volume < 5) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }
    
    public void diminuirVolume() {
        if (!ligado) {
            System.out.println("DVD está desligado");
            return;
        }
        if (volume > 1) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }
    
    public void inserirFilme(Filme f) {
        if (!ligado) {
            System.out.println("DVD está desligado");
            return;
        }
        filme = f;
        System.out.println("Filme inserido: " + filme.nome);
    }
    
    public void removerFilme() {
        if (!ligado) {
            System.out.println("DVD está desligado");
            return;
        }
        if (tocando) {
            System.out.println("filme está tocando, Aperte PARAR primeiro");
            return;
        }
        filme = null;
        System.out.println("filme removido");
    }
    
    public void play() {
        if (!ligado) {
            System.out.println("DVD está desligado");
            return;
        }
        if (filme == null) {
            System.out.println("não tem filme");
            return;
        }
        tocando = true;
        System.out.println("Reproduzindo: " + filme.nome + " (" + filme.duracao + " minutos)");
    }
    
    public void stop() {
        if (!ligado) {
            System.out.println("DVD está desligado");
            return;
        }
        if (!tocando) {
            System.out.println("nada está tocando");
            return;
        }
        tocando = false;
        System.out.println("parou");
    }
}
