public class ConsultaDental implements Consulta {
    @Override
    public void agendarConsulta() {
        System.out.println("consulta agendada para el siguiente mes");
    }

    @Override
    public void realizarConsulta() {
        System.out.println("realiza tu consulta dental");
    }
}
