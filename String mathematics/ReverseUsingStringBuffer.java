using stringbuffer()


import java.lang.*;
import java.io.*;
import java.util.*;
 
public class Test {
    public static void main(String[] args)
    {
        String str = "buffer";

        StringBuffer sbr = new StringBuffer(str);
 
        sbr.reverse();
        System.out.println(sbr);
    }
}

output:
reffub