package main;

public class ServerNameGenerator {
    public static void main (String[] args) {
        String [] adjectives = {"tall", "short", "wet", "dry", "clean", "dirty", "hot", "cold", "nice", "mean"};
        String [] nouns = {"dog", "cat", "fish", "racoon", "computer", "Texas", "Starbucks", "coffee", "Chuck Norris" };

        String adjective = random(adjectives);
        String noun = random(nouns);

        System.out.printf("Your servers name is:\n%s-%s", adjective, noun);
    }
    private static String random(String[] stringArray) {
        int index = (int) (Math.random() * stringArray.length);
        return stringArray[index];
    }
}
