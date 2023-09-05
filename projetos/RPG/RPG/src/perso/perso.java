package perso;

public class perso {

    public int vida = 10;
    public int dano = 3;
    public int lvl = 1;


    public void personagem(int vida, int dano, int lvl) {
        this.dano = dano;
        this.vida = vida;
        this.lvl = lvl;
    }

    public int vidap(int danom) {
        this.vida = this.vida - danom;
        return this.vida;
    }
}


