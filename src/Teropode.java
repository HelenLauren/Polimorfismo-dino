public class Teropode extends Dinosauria {
    private String presa;

    public Teropode(String especie, int idade, String dieta, String presa) {
        super(especie, idade, dieta);
        this.presa = presa;
    }

    @Override
    public void locomocao() {
        System.out.println(getEspecie() + " está se deslocando de forma rápida e ágil.");
    }

    public void predacao() {
        System.out.println(getEspecie() + " está caçando sua presa: " + presa + ".");
    }
}

