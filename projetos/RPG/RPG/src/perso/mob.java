package perso;

public class mob {

    public int vida = 10;
    public int dano = 3;
    public int level = 1;

    public int vidam(int danop) {
        this.vida = this.vida - danop;
        return this.vida;
    }

}



