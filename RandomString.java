import java.util.Random;

public class RandomString {

    static String gen_10_rand(int length) {
        return gen_rand(length, "0123456789");
    }

    static String gen_16_rand(int length) {
        return gen_rand(length, "0123456789abcdef");
    }

    static String gen_base64_rand(int length) {
        return gen_rand(length, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    }

    private static String gen_rand(int length, String rand) {
        StringBuilder tmp = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            tmp.append(rand.charAt(r.nextInt(rand.length())));
        }
        return tmp.toString();
    }
}
