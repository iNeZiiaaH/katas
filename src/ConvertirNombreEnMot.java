public class ConvertirNombreEnMot {

    private static final String[] UNITS = {
            "zéro", "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf",
            "dix", "onze", "douze", "treize", "quatorze", "quinze", "seize"
    };

    private static final String[] TENS = {
            "", "", "vingt", "trente", "quarante", "cinquante", "soixante", "soixante-dix", "quatre-vingt",
            "quatre-vingt-dix"
    };

    public static String convertirNombreEnMot(int nombre) {
        if (nombre < 0 || nombre > 999) {
            throw new IllegalArgumentException("Le nombre doit être entre 0 et 999");
        }

        if (nombre < 17) {
            return UNITS[nombre];
        } else if (nombre < 20) {
            return "dix-" + UNITS[nombre - 10];
        } else if (nombre < 100) {
            return convertirDizaine(nombre);
        } else {
            return convertirCentaines(nombre);
        }
    }

    private static String convertirDizaine(int nombre) {
        int dizaine = nombre / 10;
        int unite = nombre % 10;

        String result;

        // Gérer les dizaines spéciales
        if (dizaine == 7) {
            result = TENS[6] + "-" + (unite == 1 ? "et-" : "") + UNITS[10 + unite];
        } else if (dizaine == 9) {
            result = TENS[8] + "-" + UNITS[10 + unite];
        } else {
            result = TENS[dizaine];
            if (unite == 1 && dizaine != 8) {
                result += "-et-un";
            } else if (unite != 0) {
                result += "-" + UNITS[unite];
            }
        }

        return result;
    }

    private static String convertirCentaines(int nombre) {
        int centaine = nombre / 100;
        int reste = nombre % 100;

        String result = "";

        if (centaine > 1) {
            result += UNITS[centaine] + " cent";
        } else {
            result += "cent";
        }

        if (reste != 0) {
            result += " " + convertirDizaine(reste);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertirNombreEnMot(123));
        System.out.println(convertirNombreEnMot(99));
        System.out.println(convertirNombreEnMot(500));
        System.out.println(convertirNombreEnMot(80));
        System.out.println(convertirNombreEnMot(71));
        System.out.println(convertirNombreEnMot(0));
    }
}
