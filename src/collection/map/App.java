package collection.map;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class App {
    public static void main(String[] args) {
        
        String input = "hello"; // Input string to hash
        
        try {
            // Step 1: Create a MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Step 2: Update the digest with the input string
            byte[] hashBytes = digest.digest(input.getBytes()); // getBytes() converts string to byte array

            // Step 3: Convert the byte array to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b)); // Convert each byte to a two-digit hex string
            }

            // Step 4: Print the result
            System.out.println("SHA-256 hash of '" + input + "': " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Hash algorithm not found: " + e.getMessage());
        }
        
    }
}
