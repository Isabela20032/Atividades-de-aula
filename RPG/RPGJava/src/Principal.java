public class Principal {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro();
        Mago m = new Mago();
        Arqueiro a = new Arqueiro();
        
        //Objeto Guerreiro
        g.nome = "Vladimir";
        g.forca = 80;
        g.agilidade = 30;
        g.carisma = 0;
        g.destreza = 42;
        g.inteligencia = -3;
        g.estamina = 90;
        g.resistencia = 80;
        g.sorte = 10;
        g.vida = 100;
        g.mana = 63;


        g.atacar(1);

        //Objeto Mago
        m.nome = "Agostinho Carrara";
        m.mana = 100;
        m.vida = 40;
        m.destreza = 90;
        m.resistencia = 50;
        m.sorte = 85;
        m.inteligencia = 95;
        m.estamina = 45;

        //Objeto Arqueiro
        a.nome = "Jhoson";
        a.destreza = 90;
        a.resistencia = 30;
        a.estamina = 45;
        a.sorte = 5;
        a.vida = 75;
        a.inteligencia = 60;
        a.mana = 60;




    }
}
