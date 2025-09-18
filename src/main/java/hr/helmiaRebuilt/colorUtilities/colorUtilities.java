package hr.helmiaRebuilt.colorUtilities;

import net.md_5.bungee.api.ChatColor;

public class colorUtilities {

    /**
     * Parses a string for both hex color codes (e.g., "<#FF5733>") and `&` color codes (e.g., "&a").
     * Handles spaces after color codes and ensures a message with only color codes sends nothing.
     *
     * @param message The raw input string.
     * @return The formatted string with applied colors or null if the result is empty.
     */
    public static String parseColors(String message) {
        if (message == null || message.isEmpty()) return null;

        StringBuilder formatted = new StringBuilder();
        int index = 0;

        while (index < message.length()) {
            // Check for hex color codes (<#FF5733>)
            if (message.startsWith("<#", index) && index + 8 < message.length() && message.charAt(index + 8) == '>') {
                String hexColor = message.substring(index + 1, index + 8); // Extract hex code
                try {
                    formatted.append(ChatColor.of(hexColor));
                } catch (IllegalArgumentException e) {
                    // Invalid hex color, append as plain text
                    formatted.append("<#").append(hexColor).append(">");
                }
                index += 9; // Skip past the hex color code
            }
            // Check for `&` color codes (e.g., "&a")
            else if (message.charAt(index) == '&' && index + 1 < message.length()) {
                char colorCode = message.charAt(index + 1);
                ChatColor color = ChatColor.getByChar(colorCode);

                if (color != null) {
                    formatted.append(color);
                } else {
                    // Invalid `&` color code, append as plain text
                    formatted.append("&").append(colorCode);
                }
                index += 2; // Skip past the `&` color code
                // Skip any whitespace after the color code
                while (index < message.length() && Character.isWhitespace(message.charAt(index))) {
                    index++;
                }
            } else {
                // Append regular characters
                formatted.append(message.charAt(index));
                index++;
            }
        }

        // Return null if the result is empty (e.g., only color codes were sent)
        String result = formatted.toString().trim();
        return result.isEmpty() ? null : result;
    }
}
