package Input_Output;
import java.io.*;

public class Buffer_Reader {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        double b = Double.parseDouble(br.readLine());
        byte c = Byte.parseByte(br.readLine());
        boolean d = Boolean.parseBoolean(br.readLine());
        String name = br.readLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(name);
    }
}
