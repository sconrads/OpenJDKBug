import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class JDKBug {

    public static void main(String args[]) {
        BigDecimal amount = new BigDecimal("2345.78");

        DecimalFormat norwegianNynorskAmountFormatter = getAmountFormatter(new Locale("nn", "NO"));
        System.out.println("Nynorsk amount formatting: " + norwegianNynorskAmountFormatter.format(amount));


        DecimalFormat norwegianBokmaalAmountFormatter = getAmountFormatter(new Locale("nb", "NO"));
        System.out.println("Bokmål amount formatting: " + norwegianBokmaalAmountFormatter.format(amount));
    }

    private static DecimalFormat getAmountFormatter(Locale locale) {
        NumberFormat nf = NumberFormat.getNumberInstance(locale);
        return (DecimalFormat) nf;
    }

}