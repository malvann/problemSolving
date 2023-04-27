package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DictionariesAndMaps {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Map<String, String> phoneBook = new HashMap<>();

            int integer = Integer.parseInt(reader.readLine());
            String[] record;
            while (integer-- > 0) {
                record = reader.readLine().strip().split(" ");
                phoneBook.put(record[0], record[1]);
            }

            String name;
            String phoneNum;
            while ((name = reader.readLine()) != null) {
                phoneNum = phoneBook.get(name);
                if (phoneNum == null) System.out.println("Not found");
                else System.out.println(String.format("%s=%s", name.strip(), phoneNum));
            }
        }
    }
}
