import java.io.*;
import java.util.*;

public class UseOfStatic {
        public static int B;
        public static int H;
        public static boolean flag;
        
        static{
            Scanner sc = new Scanner(System.in);
            B = sc.nextInt();
            H = sc.nextInt();
            if(B>0 && H>0)
            {
              flag = true;
            }
            else{
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
        

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.     Your    class should be named Solution. */
        if(flag)
        {
            int area= B*H;
            System.out.println(area);
        }
        
    }
}