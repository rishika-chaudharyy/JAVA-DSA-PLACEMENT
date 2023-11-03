//StringBuffer intern() insert()
public class string_buffer {
    public static String internExample(String s1) {
        String s2 = s1.intern();
        return s2;
    }

    public static String stringBufferExample(String initialContent) {
        StringBuffer stringBuffer = new StringBuffer(initialContent);
        stringBuffer.append(" World");
        stringBuffer.insert(0, "Hi, ");
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        // Example using intern() with String
        String s1 = new String("Hello");
        String s2 = "Hello";
        String s3 = internExample(s1);
        
        System.out.println("s1 == s2: " + (s1 == s2)); // false (different references)
        System.out.println("s2 == s3: " + (s2 == s3)); // true (same reference after interning)

        // Example using StringBuffer
        String result = stringBufferExample("Hello");
        System.out.println("Result: " + result); // "Hi, Hello World"
    }
}

