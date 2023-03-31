package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CargoTest {

    @Test
    void deveRetornarCargaHorariaCargo() {
        Cargo cargo = new CargoMedico(1000.0f);

        assertEquals(1000.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCargoComCardiologia() {
        Cargo cargo = new Cardiologia(new CargoMedico(1000.0f));

        assertEquals(1100.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCargoComPediatria() {
        Cargo cargo = new Pediatria(new CargoMedico(1000.0f));

        assertEquals(1200.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCargoComEmergencia() {
        Cargo cargo = new Emergencia(new CargoMedico(1000.0f));

        assertEquals(1050.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCargoComCardiologiaMaisPediatria() {
        Cargo cargo = new Cardiologia(new Pediatria(new CargoMedico(1000.0f)));

        assertEquals(1320.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCargoComCardiologiaMaisEmergencia() {
        Cargo cargo = new Cardiologia(new Emergencia(new CargoMedico(1000.0f)));

        assertEquals(1155.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCargoComPediatriaMaisEmergencia() {
        Cargo cargo = new Pediatria(new Emergencia(new CargoMedico(1000.0f)));

        assertEquals(1260.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarCargaHorariaCargoComCardiologiaMaisPediatriaMaisEmergencia() {
        Cargo cargo = new Cardiologia(new Pediatria(new Emergencia(new CargoMedico(1000.0f))));

        assertEquals(1386.0f, cargo.getCargaHoraria());
    }

    @Test
    void deveRetornarEstruturaCargo() {
        Cargo cargo = new CargoMedico();

        assertEquals("Médico", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComCardiologia() {
        Cargo cargo = new Cardiologia(new CargoMedico());

        assertEquals("Médico/Cardiologia", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComPediatria() {
        Cargo cargo = new Pediatria(new CargoMedico());

        assertEquals("Médico/Pediatria", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComEmergencia() {
        Cargo cargo = new Emergencia(new CargoMedico());

        assertEquals("Médico/Emergência", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComCardiologiaMaisPediatria() {
        Cargo cargo = new Cardiologia(new Pediatria (new CargoMedico()));

        assertEquals("Médico/Pediatria/Cardiologia", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComCardiologiaMaisEmergencia() {
        Cargo cargo = new Cardiologia(new Emergencia (new CargoMedico()));

        assertEquals("Médico/Emergência/Cardiologia", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComPediatriaMaisEmergência() {
        Cargo cargo = new Pediatria(new Emergencia (new CargoMedico()));

        assertEquals("Médico/Emergência/Pediatria", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComCardiologiaMaisPediatriaMaisEmergencia() {
        Cargo cargo = new Cardiologia (new Pediatria(new Emergencia (new CargoMedico())));

        assertEquals("Médico/Emergência/Pediatria/Cardiologia", cargo.getEstrutura());
    }
}
