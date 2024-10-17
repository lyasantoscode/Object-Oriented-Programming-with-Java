import javax.swing.text.StyledEditorKit;
//Objeto - Propriedades e Métodos
//arquivo que inclui os metodos em Carro.java

public class Motivacao {
    public static void main(String[] args) {


        Carro carro = new Carro();
        carro.setCor("Vermelho"); // set vai definir um valor para objeto
        carro.setLargura(1.70);
        carro.setAltura(1.50);
        carro.primeiraMarcha(); // método da Classe Carro , primeiro forma de fazer inclui junto com a segunda marcha
        carro.segundaMarcha(); // método da Classe Carro
      //  carro.marchas(); // método da Classe Carro, essa é a segunda forma de fazer...fazendo que não precise dois dos metodos acima invidualmente. Resumindo, como uma forma de organizar a aplicação


        System.out.println("Cor do Carro: " + carro.getCor()); //get vai recuperar o valor
        System.out.println("Largura do Carro: " + carro.getLargura()); //get vai recuperar o valor
        System.out.println("Altura do Carro: " + carro.getAltura()); //get vai recuperar o valor
    }
}





