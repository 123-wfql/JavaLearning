package exp3socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Input {
    private static final BufferedReader KEYBOARD_INPUT = new BufferedReader(new InputStreamReader(System.in)) ;
    private Input(){
    }
    public static String getString(String prompt) throws IOException {
        boolean flag = true ;
        String str = null ;
        while(flag) {
            System.out.print(prompt);
            str = KEYBOARD_INPUT.readLine() ;
            if(str == null||"".equals(str)){
                System.out.println("数据输入错误，请重新输入!");
            }else{
                flag = false ;
            }
        }
        return str ;
    }
}
