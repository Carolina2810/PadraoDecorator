package decorator;

public class CargoMedico implements Cargo{

    public float cargaHoraria;

    public CargoMedico() {
    }

    public CargoMedico(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public String getEstrutura() {
        return "Médico";
    }
}
