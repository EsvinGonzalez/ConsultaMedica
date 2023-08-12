public class ConsultaMedica implements Consulta {
    @Override
    public void agendarConsulta() {
        System.out.println("consulta agendada para el mes de agosto");
    }

    @Override
    public void realizarConsulta() {
        System.out.println("realiza tu consulta medica");
    }
}
