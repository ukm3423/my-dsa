package comp;

public class App {
    public static void main(String[] args) {
        
        String input = "Sparrow Softech Private Limited"; 
        char[] output = input.toCharArray(); 
        int length = output.length;
        System.out.println(output);

        for(int i = 0; i < length/2; i++) {
            char temp = output[i];
            output[i] = output[length - i - 1];
            output[length - i - 1] = temp;
        }
        System.out.println(output);
    }
}
    