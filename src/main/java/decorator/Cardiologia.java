package decorator;

public class Cardiologia extends CargoDecorator {

    public Cardiologia(Cargo cargo) {
        super(cargo);
    }

    public float getPercentualCargaHoraria() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Cardiologia";
    }
}
