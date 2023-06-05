import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Main {

    // bad code
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://ssl.pstatic.net/imgmovie/mdi/mit250/0754/75470_P55_153307.jpg");

        InputStream fin = url.openStream();

        // 1. 빨대 준비
//        FileInputStream fin =
//                new FileInputStream("C:\\zzz\\test.jpg");

        FileOutputStream fos =
                new FileOutputStream("C:\\zzz\\copy.jpg");

        System.out.println(fin);

        // 2. 읽고 쓰기
        while(true){
            int data = fin.read();
            if(data == -1){
                break;
            }
            fos.write(data);
        } // end while




    }
}