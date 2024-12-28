public class Main {
    public static int StringCounter(String string) {
        if (string == null)
            return 0;

        int words_counter = 0;
        Character[] replace = {',', '.', '[', ']', '{', '}', '/', '-', ' '};
        Character[] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        for (Character character : replace) {
            string = string.replace(character, ';');
        }

        for (Character digit : digits) {
            string = string.replace(digit, '\\');
        }

        String[] split = string.split("");

        int word_length = 0;
        for (String character : split) {
            if (character.equals(";")) {
                if (word_length >= 3)
                    words_counter++;

                word_length = 0;
                continue;
            }

            if (character.equals("\\")) {
                continue;
            }

            word_length++;
        }
        if (word_length >= 3)
            words_counter++;

        return words_counter;
    }

}
