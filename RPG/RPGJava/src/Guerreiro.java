public class Guerreiro{

    String nome;
    int forca;
    int destreza;
    int agilidade;
    int inteligencia;
    int carisma;
    int resistencia;
    int vida;
    int estamina;
    int sorte;
    int mana;

    //método
    int atacar(int valorDado){
        int valorAtaque = 0;
        if(valorDado < 2){
            System.out.println("O ataque falhou!");
        }else{
            valorAtaque = this.forca + valorDado;
        }
        return valorAtaque;
    }


}
