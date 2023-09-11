package leetcode;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int size = magazine.length();
        for (char ch : ransomNote.toCharArray()) {
            magazine = magazine.replaceFirst(String.valueOf(ch), "");
            if (magazine.length() == size) return false;
            size = magazine.length();
        }
        return true;
    }
}
