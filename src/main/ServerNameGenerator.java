package main;

public class ServerNameGenerator {
    public static void main (String[] args) {
        String [] adjectives = {"tall", "short", "wet", "dry", "clean", "hot", "cold"};
        String [] nouns = {"dog", "cat", "fish", "racoon", "computer", "Texas"};

        String adjective = random(adjectives);
        String noun = random(nouns);

        System.out.printf("Here is your servers name:" + adjective + noun);
    }
    private static String random(String[] stringArray) {
        int index = (int) (Math.random() * stringArray.length);
        return stringArray[index];
    }
}
