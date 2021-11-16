import strategy.LeituraRetornoBancoBradesco;
import strategy.LeituraRetornoBancoBrasil;
import strategy.ProcessarBoletos;

public class Principal {

    public static void main(String[] args) {
        final ProcessarBoletos processarBoletoBB = new ProcessarBoletos(new LeituraRetornoBancoBrasil());
        String boletoBB = Principal.class.getResource("banco-brasil-1.csv").getPath();

        final ProcessarBoletos processarBoletoBradesco = new ProcessarBoletos(new LeituraRetornoBancoBradesco());
        String boletoBradesco = Principal.class.getResource("bradesco-1.csv").getPath();

        processarBoletoBradesco.processar(boletoBradesco);
        System.out.println("Lendo arquivo "+ boletoBradesco +"\n");

        processarBoletoBB.processar(boletoBB);
        System.out.println("Lendo arquivo "+ boletoBB +"\n");
    }//metodo

}//classe
