// ============================================================
//   Topic 8: ARRAY OF STRINGS
//   An array of strings is an array whose elements are strings.
//   Each string is stored as a sequence of characters ending
//   with the null character '\0'.
//   Example: char names[3][10] = {"Ram", "Shyam", "Maya"}
//   Stored row by row just like a 2D char array.
// ============================================================

public class ArrayOfStrings {
    public static void main(String[] args) {

        System.out.println("===== 8. ARRAY OF STRINGS =====");

        // String array (Java equivalent of char names[3][10])
        String[] names = {"Ram", "Shyam", "Maya"};

        System.out.println("String Array: names[3] = {\"Ram\", \"Shyam\", \"Maya\"}");
        System.out.println();

        // Print each string and its characters (like 2D char array)
        System.out.printf("%-10s %-10s %-30s%n", "Index", "String", "Characters (with \\0)");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < names.length; i++) {
            StringBuilder chars = new StringBuilder();
            for (char c : names[i].toCharArray()) {
                chars.append(c).append(" ");
            }
            chars.append("\\0"); // null terminator
            System.out.printf("%-10d %-10s %-30s%n", i, names[i], chars.toString());
        }

        System.out.println();
        System.out.println("--- 2D char array representation ---");

        // Simulate char names[3][10]
        int maxLen = 10;
        char[][] charNames = new char[names.length][maxLen];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length(); j++) {
                charNames[i][j] = names[i].charAt(j);
            }
            charNames[i][names[i].length()] = '\0'; // null terminator
        }

        // Print char 2D array
        for (int i = 0; i < charNames.length; i++) {
            System.out.print("names[" + i + "]: ");
            for (int j = 0; j < maxLen; j++) {
                if (charNames[i][j] == '\0') {
                    System.out.print("\\0 ");
                    break;
                } else {
                    System.out.print(charNames[i][j] + "  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Note: Each string can store up to 9 characters + '\\0'");
        System.out.println("Stored row by row just like a 2D char array.");
        System.out.println("Assuming each string can store up to BA + 9 characters = 9 chars + '\\0'");
    }
}
