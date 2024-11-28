public class ConsultorioMedico {
    public void agendarConsulta(String especialidade, String tipoPagamento) {
        double valor = 0.0;
        if (especialidade.equals("cardiologia")) {
            System.out.println("Consulta com Cardiologista agendada.");
            valor = 250.0;
        } else if (especialidade.equals("dermatologia")) {
            System.out.println("Consulta com Dermatologista agendada.");
            valor = 180.0;
        } else {
            System.out.println("Especialidade não reconhecida!");
            return;
        }

        if (tipoPagamento.equals("cartao_credito")) {
            System.out.println("Pagamento de R$" + valor
                    + " via Cartão de Crédito.");

        } else if (tipoPagamento.equals("transferencia_bancaria")) {
            System.out.println("Pagamento de R$" + valor +
                    " via Transferência Bancária.");
        } else {
            System.out.println("Método de pagamento não reconhecido!");
        }
    }

    public static void main(String[] args) {
        ConsultorioMedico consultorio = new ConsultorioMedico();
        consultorio.agendarConsulta("cardiologia",
                "cartao_credito");
        consultorio.agendarConsulta("dermatologia",
                "transferencia_bancaria");
        consultorio.agendarConsulta("odontologia",
                "cartao_credito");
    }
}