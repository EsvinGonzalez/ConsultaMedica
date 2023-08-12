public class Medico extends Persona {
    private String especialidad;
    private String numeroColegiado;
    private String horaConsulta;

    public Medico(String nombre, int edad, String genero, String direccion, String especialidad, String numeroColegiado, String horaConsulta) {
        super(nombre, edad, genero, direccion);
        this.especialidad = especialidad;
        this.numeroColegiado = numeroColegiado;
        this.horaConsulta = horaConsulta;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public String getHoraConsulta() {
        return horaConsulta;
    }
}
