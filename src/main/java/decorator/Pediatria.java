package decorator;

public class Pediatria extends CargoDecorator {

    public Pediatria(Cargo cargo) {
        super(cargo);
    }

    public float getPercentualCargaHoraria() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Pediatria";
    }
}
