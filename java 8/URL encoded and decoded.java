URL encoding and decoding

import java.util.Base64;  
public class Base64BasicEncryptionExample {  
    public static void main(String[] args) {  

        Base64.Encoder encoder = Base64.getUrlEncoder();  
 
        String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());  
        System.out.println("Encoded URL: "+eStr);  
 
        Base64.Decoder decoder = Base64.getUrlDecoder();  

        String dStr = new String(decoder.decode(eStr));  
        System.out.println("Decoded URL: "+dStr);  
    }  
} 

output:
Encoded URL: aHR0cDovL3d3dy5qYXZhdHBvaW50LmNvbS9qYXZhLXR1dG9yaWFsLw==
Decoded URL: http://www.javatpoint.com/java-tutorial/