package util;

import java.util.Locale;
import java.util.ResourceBundle;

// ResourceBundle carga el archivo de propiedades segun el Locale activo.
public class LanguageManager {
    private static Locale locale = new Locale("es");

    // Cambia el idioma actual ("es" o "en").
    public static void setLanguage(String lang) {
        locale = new Locale(lang);
    }

    // Busca la clave en el archivo messages_*.properties del idioma activo.
    public static String get(String key) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages", locale);
        return bundle.getString(key);
    }
}
