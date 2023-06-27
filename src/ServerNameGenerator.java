import java.util.Random;
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {
                "despair",
                "tired",
                "lost",
                "java",
                "hurt",
                "awful",
                "deceitful",
                "cruel",
                "horrible",
                "abusive",
        };

        String[] nouns = {
                "cat",
                "megatron",
                "naruto",
                "saitama",
                "eggman",
                "umar",
                "nation-wide",
                "monkey",
                "gandalf",
                "ricky-smiley"
        };
        String randomAdjective = getRandomElement(adjectives);
        String randomNoun = getRandomElement(nouns);
        String generatedName = generateName(randomNoun, randomAdjective);
        System.out.println("Random adjective is: " + randomAdjective);
        System.out.println("Random noun is: " + randomNoun);
        System.out.println("Generated name: " + generatedName);
    }
    public static String getRandomElement(String[] array){
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
    public static String generateName(String noun, String adjective){
        return  adjective + "-" + noun;

    }
}

