public class Main {
    public static void main(String[] args) {
        String original = "abc DEFG ABC defg abc  ";
        String convertidaLower = original.toLowerCase();
        String convertidaUpper = original.toUpperCase();
        String convertidaTrim = original.trim();
        String convertidaSub = original.substring(2);
        String convertidaSub2Args = original.substring(2, 9);
        String convertidaReplace = original.replace("a", "K"); // Funciona com varios args.Ex: "abc"
        int convertidaIndex = original.indexOf("bc");
        int convertidaIndexLast = original.lastIndexOf("bc");


        System.out.println("Original: " + original + "-");
        System.out.println("toLowerCase: " + convertidaLower + "-");
        System.out.println("toUpperCase: " + convertidaUpper + "-");
        System.out.println("Trim: " + convertidaTrim + "-");
        System.out.println("Sub: " + convertidaSub + "-");
        System.out.println("Sub: " + convertidaSub2Args + "-");
        System.out.println("Replace: " + convertidaReplace + "-");
        System.out.println("Index: " + convertidaIndex + "-");
        System.out.println("LastIndex: " + convertidaIndexLast + "-");

        String frase = "amora maçã banana";
        String[] fraseVect = frase.split(" ");

        System.out.println(fraseVect[0]);
        System.out.println(fraseVect[1]);
        System.out.println(fraseVect[2]);

    }
}