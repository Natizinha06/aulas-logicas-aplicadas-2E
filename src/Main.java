public class Main {
    public static void main(String[] args) {
        //Aula introdutória de Orientação à objetos
        Pessoa adao = new Pessoa();
        //Declaração de objeto
        Pessoa qualquer;
        //instaciação do objeto
        qualquer = new Pessoa();
        // Deinição de formato da pessoa qualquer
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        // Criar novos objetos
        Pessoa rainha;
        //istanciar objetos
        rainha = new Pessoa();
        // definir forma do objeto
        rainha.nome = "tina";
        rainha.sobrenome = "Tunner";
        // Definir comportamento do objeto
        rainha.falar();
        System.out.println(rainha.falar("alto"));
    }
}