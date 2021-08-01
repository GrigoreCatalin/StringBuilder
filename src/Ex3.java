public class Ex3 {
    public static void main(String[] args) {
        String str = "The number 1 deadliest animal on the PLANET Earth is the ©Mosquito!®";

        StringBuilder sBuilder = new StringBuilder(str);

        for (int i = 0; i < sBuilder.length(); i++) {
            if (Character.isLetter(sBuilder.charAt(i)) && Character.isUpperCase(sBuilder.charAt(i))) {
                sBuilder.setCharAt(i, Character.toLowerCase(sBuilder.charAt(i)));
            } else if (Character.isLetter(sBuilder.charAt(i)) && Character.isLowerCase(sBuilder.charAt(i)))
                sBuilder.setCharAt(i, Character.toUpperCase(sBuilder.charAt(i)));
        }

        String newStr = sBuilder.toString();
        System.out.println(newStr);
    }
}
