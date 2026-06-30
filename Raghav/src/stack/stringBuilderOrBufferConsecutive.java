public static void removeConsecutive(StringBuilder sb) {
    // Handle empty or single character structures immediately
    if (sb == null || sb.length() <= 1) {
        return;
    }

    int write = 0; // The write pointer stays at the last unique position

    // Loop through the StringBuilder using 'read' as the read pointer
    for (int read = 1; read < sb.length(); read++) {
        // If the current character is different from the last unique one
        if (sb.charAt(read) != sb.charAt(write)) {
            write++; // Move the write pointer forward
            sb.setCharAt(write, sb.charAt(read)); // Overwrite the character in place
        }
    }

    // Chop off the leftover duplicate characters at the end
    sb.setLength(write + 1);
}


public static void removeConsecutive(StringBuffer sb) {
    if (sb == null || sb.length() <= 1) {
        return;
    }

    int write = 0; 

    for (int read = 1; read < sb.length(); read++) {
        if (sb.charAt(read) != sb.charAt(write)) {
            write++;
            sb.setCharAt(write, sb.charAt(read)); 
        }
    }

    // Shrink the buffer to the new correct size
    sb.setLength(write + 1);
}



public static void main(String[] args) {
    StringBuilder text = new StringBuilder("aabbccddeeeaa");
    
    System.out.println("Before: " + text); // Output: aabbccddeeeaa
    
    removeConsecutive(text); // Modifies 'text' directly
    
    System.out.println("After:  " + text); // Output: abcdea
}
