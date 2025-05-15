package practice.Char;

public class CharSet {
    public static void main(String[] args) {


//        String emoji = "😊";
//        System.out.println(emoji);                   // Outputs 😊
//        System.out.println(emoji.length());
//        System.out.println("Length: " + emoji.length()); // Output: 2
//        System.out.println("char[0]: " + (int) emoji.charAt(0)); // high surrogate
//        System.out.println("char[1]: " + (int) emoji.charAt(1)); // low surrogate



//        char ch = '\u0041';
//        System.out.println("Value of ch: " + ch);
//        System.out.println("Unicode value: " + (int) ch); // Outputs: 65535


                int unicodeValue = 65; // or 0xFFFF

                char ch2 = (char) unicodeValue;

                System.out.println("Character: " + ch2); // Not visible — it's a non-character
                System.out.println("Unicode Escape: \\u" + String.format("%04X", (int) ch2));
                System.out.println("Unicode : \\u"+(int)ch2);


        char ch3 = '\u03A9';     // Unicode for Greek Ω
        System.out.println(ch3);




    }
}
