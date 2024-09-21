class Dinosauria {
    private String especie;
    private int idade;
    private String dieta;

    public Dinosauria(String especie, int idade, String dieta) {
        this.especie = especie;
        this.idade = idade;
        this.dieta = dieta;
    }

    public Dinosauria() {
        this.especie = "Desconhecido";
        this.idade = 0;
        this.dieta = "Desconhecida";
    }

    public void comportamento() {
        System.out.println(especie + " está se comportando normalmente.");
    }

    public void locomocao() {
        System.out.println(especie + " está se movendo.");
    }

    public String getDieta() {
        return dieta;
    }

    public String getEspecie() {
        return especie;
    }
}

