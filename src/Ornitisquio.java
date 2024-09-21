public class Ornitisquio extends Dinosauria {
    private boolean possuiPlacas;

    public Ornitisquio(String especie, int idade, String dieta, boolean possuiPlacas) {
        super(especie, idade, dieta);
        this.possuiPlacas = possuiPlacas;
    }

    @Override
    public void locomocao() {
        System.out.println(getEspecie() + " se movimenta lentamente.");
    }

    public void defesa() {
        String defesa = possuiPlacas ? "utilizando suas placas." : "sem placas e utilizando outras táticas de defesa.";
        System.out.println(getEspecie() + " está se defendendo " + defesa);
    }
}