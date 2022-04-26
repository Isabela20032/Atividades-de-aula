public class Passeio {
    public static void main(String[] args) {
        Caminhada caminhada = new Caminhada();

        Cachorro dog = new Cachorro();
        dog.nome = "Thor";
        dog.raca = "Galgo Afegão";
        dog.sexo = 'M';
    
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Talles";
        pessoa.cachorro = dog;
    
        caminhada.andar(pessoa);
    
    }   
}
