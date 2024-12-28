public class Main {
    public static int StringCounter(String string) {
        if (string == null)
            return 0;

        int words_counter = 0;
        Character[] replace = {',', '.', '[', ']', '{', '}', '/', '-', ' '};

        for (Character character : replace)
            string = string.replace(character, ';');


        String[] splited_string = string.split(";");

        Character[] replace_digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};


        for (String element : splited_string) {
            for (Character digit : replace_digits)
                element = element.replace(digit, ' ');

            if (element.length() >= 3) {
                if (!(element.split(" ").length >= 2))
                    words_counter++;
            }
        }

        return words_counter;
    }

}
