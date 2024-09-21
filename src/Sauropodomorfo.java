public class Sauropodomorfo extends Dinosauria {
    private int altura;

    public Sauropodomorfo(String especie, int idade, String dieta, int altura) {
        super(especie, idade, dieta);
        this.altura = altura;
    }

    @Override
    public void locomocao() {
        System.out.println(getEspecie() + " está se move lentamente devido ao seu grande tamanho.");
    }

    public void forrageamento() {
        System.out.println(getEspecie() + " está se alimentando de folhas altas.");
    }
}
//sao meus dinos preferidos <3