public class Pessoa {
    // Atributos da pessoa
    public String nome;
    public String sobrenome;
    // Metodo de classe
    public void falar() { System.out.println("falei");}
    //sobrecarga do metodo falat
    public String falar(String volume){
        return "falei" + volume;
    }
}
