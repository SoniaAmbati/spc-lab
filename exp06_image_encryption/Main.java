package exp06_image_encryption;

public class Main {
    public static void main(String[] args) {
        String message = "cloud-image";
        int key = 7;

        System.out.println("Image Encryption Simulation");
        System.out.println("===========================");
        System.out.println("Original message: " + message);

        String encrypted = encrypt(message, key);
        System.out.println("Encrypted message: " + encrypted);
        System.out.println("Decrypted message: " + decrypt(encrypted, key));
    }

    private static String encrypt(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            sb.append((char) (ch + key));
        }
        return sb.toString();
    }

    private static String decrypt(String text, int key) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            sb.append((char) (ch - key));
        }
        return sb.toString();
    }
}
