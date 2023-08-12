public class Paciente extends Persona {
    private String historialMedico;
    private String seguroDeVida;

    public Paciente(String nombre, int edad, String genero, String direccion, String historialMedico, String seguroDeVida) {
        super(nombre, edad, genero, direccion);
        this.historialMedico = historialMedico;
        this.seguroDeVida = seguroDeVida;
    }

    public String getHistorialMedico() {
        return historialMedico;
    }

    public String getSeguroDeVida() {
        return seguroDeVida;
    }
}