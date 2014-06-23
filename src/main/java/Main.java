import org.apache.log4j.Logger;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class);
    private static final String BY = "BY";
    private static final String BE = "BE";
    private static final String RU = "RU";

    public static void main(String[] args) {
        Locale enLocale = Locale.ENGLISH;
        Locale ruLocale = new Locale(RU, RU);
        Locale byLocale = new Locale(BE, BY);

        ResourceBundle resourceBundle = ResourceBundle.getBundle("text_en_US", enLocale);
        logInfo(resourceBundle);
        resourceBundle = ResourceBundle.getBundle("text_be_BY", byLocale);
        logInfo(resourceBundle);
        resourceBundle = ResourceBundle.getBundle("text_ru_RU", ruLocale);
        logInfo(resourceBundle);
    }

    private static void logInfo (ResourceBundle resourceBundle) {
        String locale = resourceBundle.getString("locale");
        String question = resourceBundle.getString("question");
        String answer = resourceBundle.getString("answer");
        LOGGER.info("\nlocale: " + locale + "\nquestion: " + question + "\nanswer: " + answer);
    }
}
