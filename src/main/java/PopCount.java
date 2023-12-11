public class PopCount {
    public int eggCount(int number) {
        if (number != 0){
            int count = 0;
            String tab = convertDecimalToBinary(number);
            for(int i = 0; i<=tab.length()-1;++i){
                if(tab.charAt(i)=='1'){
                    ++count;
                }
            }
            return count;
        }
        else{
            return number;
        }
        
    }

    public static String convertDecimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();

        // Cas particulier pour zéro
        if (decimalNumber == 0) {
            return "0";
        }

        // Division par 2 successives et enregistrement des restes
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder); // Insérer le reste au début de la chaîne
            decimalNumber /= 2;
        }

        return binary.toString();
    }
}
