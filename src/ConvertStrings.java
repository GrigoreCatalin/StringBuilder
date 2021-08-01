public class ConvertStrings {

    public static int parseInt (String number){
        int numberInt = Integer.valueOf(number).intValue();
        return numberInt;
    }

    public static double parseDouble (String number){
        double numberDoble = Double.valueOf(number).doubleValue();
        return numberDoble;
    }

    public static boolean parseBoolean(String value){
        boolean booleanValue = Boolean.valueOf(value).booleanValue();
        return booleanValue;
    }

}
