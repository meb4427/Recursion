import java.util.Arrays;

class Solution {
    public static int countAllChars(String[] arr) {
        if (arr == null)
            return 0;
        return Arrays.stream(arr)
                .filter(s -> s != null)
                .mapToInt(String::length)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(countAllChars(new String[] { "The wood", "Pecked peckers", "At the inn", "Tomorrowland" }));
        System.out.println(countAllChars(
                new String[] { "He", "fumbled", "in", "the,darkness", "looking", "for", "the", "light", "switch" }));
        System.out.println(countAllChars(new String[] { "I", "am", "never", "at", "home", "on", "Sundays" }));
    }
}
