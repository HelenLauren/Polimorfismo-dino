public class Main {
    public static void main(String[] args) {
        // objetos polimorficos
        Dinosauria dino1 = new Teropode("Tiranossauro", 5, "Carnívoro", "Tricerátops");
        Dinosauria dino2 = new Ornitisquio("Estegossauro", 8, "Herbívoro", true);
        Dinosauria dino3 = new Sauropodomorfo("Braquiossauro", 12, "Herbívoro", 25);
        Dinosauria dino4 = new Teropode("Velociraptor", 3, "Carnívoro", "Pequenos mamíferos");

        if (dino1 instanceof Teropode) {
            ((Teropode) dino1).predacao();
        }
        if (dino2 instanceof Ornitisquio) {
            ((Ornitisquio) dino2).defesa();
        }
        if (dino3 instanceof Sauropodomorfo) {
            ((Sauropodomorfo) dino3).forrageamento();
        }
        if (dino4 instanceof Teropode) {
            ((Teropode) dino4).predacao();
        }
        // é o metodo polimórfico
        executarLocomocao(dino1);
        executarLocomocao(dino2);
        executarLocomocao(dino3);
        executarLocomocao(dino4);
    }

    public static void executarLocomocao(Dinosauria dino) {
        dino.locomocao(); //faz a chamada polimórfica :)
    }
}
