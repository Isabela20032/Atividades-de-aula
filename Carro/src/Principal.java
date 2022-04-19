public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        Carro seuCarro = new Carro();

        meuCarro.fabricante = "Lamborghni";
        meuCarro.modelo = "Aventador";
        meuCarro.cor = "Amarelo";
        meuCarro.anoFab = 2009;
        meuCarro.valorDeMercado = 2.00f;
        meuCarro.flex = true;
        meuCarro.tipoDeCombustivel = "Alcool/gasolina";

        seuCarro.fabricante = "Honda";
        seuCarro.modelo = "Civic";
        seuCarro.anoFab = 2009;
        seuCarro.cor = "Preto";
        seuCarro.flex = false;
        seuCarro.tipoDeCombustivel = "gasolina";

        System.out.println("Meu carro");
        System.out.println("-------------------------------------------");
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.anoFab);
        System.out.println();
        
        System.out.println("Seu carro");
        System.out.println("-------------------------------------------");
        System.out.println("Modelo: " + seuCarro.modelo);
        System.out.println("Ano: " + seuCarro.anoFab);
    }
}