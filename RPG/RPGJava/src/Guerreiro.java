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

    void defender(int valorDoAtaque){
        if (valorDoAtaque <= this.resistencia){
            System.out.println("O ataque foi defendido!");
        }else{
            int danoCausado = valorDoAtaque - this.resistencia;
            System.out.println("O dano causado foi de: " + danoCausado);
            this.vida -= danoCausado;
        }
    }


}