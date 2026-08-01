import java.io.*;
public class Demo3{
    public static void main(String[] args) throws IOException {
        // InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name =  br.readLine();

        System.out.println(name);
    }
}

/*
1. Vishal -> i/p
2. OS Buffer (86, 105, 115,104, 97, 108)
3. System.in (InputStream) recieves bytes from OS Buffer.
4. InputStreamReader --> stream of bytes into stream of characters.
    ('V','i','s','h','a','l','\n')
5. BufferReader --> readLine --> Vishal --> name
6. Vishal -> o/p
*/