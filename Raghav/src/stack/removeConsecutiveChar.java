class Main {
    
    public static String removeConsecutiveCharacterFromString(String s) {
        // Handle empty or single character strings immediately
        if (s == null || s.length() <= 1) {
            return s;
        }

        // Convert the string to a mutable character array
        char[] chars = s.toCharArray();

        // Initialize the two pointers
        int write = 0; // The write pointer stays at the last unique position

        // Loop through the array using 'read' as the read pointer
        for (int read = 1; read < chars.length; read++) {
            // If the character at 'read' is different from the character at 'write'
            if (chars[read] != chars[write]) {
                write++;                 // Move the write pointer forward
                chars[write] = chars[read]; // Overwrite the position with the new character
            }
        }

        // Build a new string using only the unique characters up to the write pointer
        return new String(chars, 0, write + 1);
    }
    
    
    public static void main(String[] args) {
        String input = "aabbccddeeeaa";
        String result = removeConsecutiveCharacterFromString(input);
        
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + result); ;
    }
}
