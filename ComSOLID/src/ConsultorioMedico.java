// Interface para pagamento
interface IPagamento {
    void processar(double valor);
}

// Pagamento via Cartão de Crédito
class PagamentoCartaoCredito implements IPagamento {
    public void processar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Cartão de Crédito.");
    }
}

// Especialidade Médica (exemplo de Cardiologia)
class Cardiologia {
    public double getValorConsulta() {
        return 250.0; // Valor da consulta
    }
    public void agendarConsulta() {
        System.out.println("Consulta com Cardiologista agendada.");
    }
}

// Consultório Médico - Classe central para agendar e processar pagamentos
public class ConsultorioMedico {
    public void agendarConsulta(Cardiologia especialidade,
                                IPagamento pagamento) {
        especialidade.agendarConsulta();
        double valor = especialidade.getValorConsulta();
        pagamento.processar(valor);
    }

    public static void main(String[] args) {
        ConsultorioMedico consultorio = new ConsultorioMedico();
        Cardiologia cardiologia = new Cardiologia();
        IPagamento pagamento = new PagamentoCartaoCredito();

        // Agendar e pagar consulta
        consultorio.agendarConsulta(cardiologia, pagamento);
    }
}