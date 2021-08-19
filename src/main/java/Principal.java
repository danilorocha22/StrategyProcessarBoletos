import strategy.LeituraRetornoBancoBradesco;
import strategy.LeituraRetornoBancoBrasil;
import strategy.ProcessarBoletos;

@SuppressWarnings("all")
public class Principal {

    public static void main(String[] args) {
        /*final ProcessarBoletos processarBoletos = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        String nomeArquivo = Principal.class.getResource("banco-brasil-1.csv").getPath();*/

        final ProcessarBoletos processarBoletos = new ProcessarBoletos(new LeituraRetornoBancoBradesco());
        String nomeArquivo = Principal.class.getResource("bradesco-1.csv").getPath();

        System.out.println("Lendo arquivo "+ nomeArquivo +"\n");
        processarBoletos.processar(nomeArquivo);
    }//metodo
}//classe
