

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class currentBuffer {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    String[] r = s.split("(?=[A-Z])");
    int size = Array.getLength(r);
    System.out.println(size);
    }
}
