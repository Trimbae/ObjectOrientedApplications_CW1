import java.io.*;
import java.util.*;

public class GetInput {
    // Standard class for getting userinput to be used across program
    public static String getUserInput() throws Exception {
        // The BufferedReader used throughout
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
}