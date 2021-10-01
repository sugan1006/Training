Nashorn

import javax.script.*;
import java.io.*;
  
public class NashornExample {
    public static void main(String[] args)
        throws Exception
    {

        ScriptEngine ee = new ScriptEngineManager()
                              .getEngineByName("Nashorn");

        ee.eval("print('Welcome !!!"
                + " Executing JavaScript code with the"
                + " help of Nashorn engine');");
    }
}

output:
Welcome !!! Executing JavaScript code with the help of Nashorn engine