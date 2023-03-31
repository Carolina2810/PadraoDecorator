package decorator;

public class Emergencia extends CargoDecorator{

    public Emergencia(Cargo cargo) {
        super(cargo);
    }

    public float getPercentualCargaHoraria() {
        return 5.0f;
    }

    public String getNomeEstrutura() {
        return "Emergência";
    }
}
