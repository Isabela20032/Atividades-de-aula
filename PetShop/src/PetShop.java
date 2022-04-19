public class PetShop{
    public static void main(String[] args) {
        
    Cachorro seuDog = new Cachorro();
    
    seuDog.nome = "Jade";
    seuDog.raça = "Shih-tzu";
    seuDog.sexo = "Fêmea";
    seuDog.idade = 2;


    System.out.println("Seu Dog");
    System.out.println("-------------------------------------------");
    System.out.println("Nome: " + seuDog.nome);
    System.out.println("Raça:" + seuDog.raça);
    System.out.println("Sexo:" + seuDog.sexo);
    System.out.println("Idade:" + seuDog.idade);
    System.out.println();

    Cachorro meuDog = new Cachorro();


    meuDog.nome = "Cisco";
    meuDog.raça = "Vira-lata";
    meuDog.sexo = "Fêmea";
    meuDog.idade = 5;

    System.out.println("Meu Dog");
    System.out.println("-------------------------------------------");
    System.out.println("Nome: " + meuDog.nome);
    System.out.println("Raça:" + meuDog.raça);
    System.out.println("Sexo:" + meuDog.sexo);
    System.out.println("Idade:" + meuDog.idade);
    System.out.println();
    }
}