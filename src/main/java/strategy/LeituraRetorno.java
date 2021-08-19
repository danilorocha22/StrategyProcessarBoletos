package strategy;

import java.time.format.DateTimeFormatter;
import java.util.List;

@SuppressWarnings("all")
public interface LeituraRetorno {
    DateTimeFormatter FORMATO_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter FORMATO_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public List<Boleto> lerArquivo(String nomeArquivo);
}