public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Esvin", 26, "Masculino", "Jalapa", "miopia, dolor de cabeza", "7679");
        System.out.println("Paciente: " + paciente.getNombre());
        System.out.println("Historial medico: " + paciente.getHistorialMedico());
        System.out.println("Seguro de vida: " + paciente.getSeguroDeVida());

        Medico medico = new Medico("Dra. Blanca Vela", 40, "femenino", "Jalapa av. chipilapa", "oculista", "785468", "8:00 am");
        System.out.println("Medico: " + medico.getNombre());
        System.out.println("Especialidad: " + medico.getEspecialidad());
        System.out.println("Numero de colegiado: " + medico.getNumeroColegiado());
        System.out.println("Hora de consulta: " + medico.getHoraConsulta());

        Consulta consultaMedica = new ConsultaMedica();
        consultaMedica.agendarConsulta();
        consultaMedica.realizarConsulta();

        Consulta consultaDental = new ConsultaDental();
        consultaDental.agendarConsulta();
        consultaDental.realizarConsulta();
    }
}