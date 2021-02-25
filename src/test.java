

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class test {

    public static void main(String[] args) {

        String input = "@";
        String result = convertByteArraysToBinary(input.getBytes(StandardCharsets.UTF_8));
       String s = ENCODE(result, 8, " ");
        // pretty print the binary format
        System.out.println(DECODE("01101111"));

    }

    public static String convertByteArraysToBinary(byte[] input) {

        StringBuilder result = new StringBuilder();
        for (byte b : input) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                result.append((val & 128) == 0 ? 0 : 1);      // 128 = 1000 0000
                val <<= 1;
            }
        }
        return result.toString();
    }
       public static String ENCODE(String binary, int blockSize, String separator) {

        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()) {
            result.add(binary.substring(index, Math.min(index + blockSize, binary.length())));
            index += blockSize;
        }

        return result.stream().collect(Collectors.joining(separator));
    }
 public static String DECODE(String s) {
   int charCode = Integer.parseInt(s, 2);
String str = new Character((char)charCode).toString();
   return str;
    }
}
