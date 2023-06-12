package padroescomportamentais.interpreter;

public class SofaScore {

    public static String formula = "gol + assistencia / 2";

    public static double calcularNota(double gol, double assistencia) {
        String expressao;
        expressao = formula.replace("gol", Double.toString(gol));
        expressao = expressao.replace("assistencia", Double.toString(assistencia));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}



