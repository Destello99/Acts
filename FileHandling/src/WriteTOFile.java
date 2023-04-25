import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTOFile {
    public static void main(String[] args) throws IOException {
        try(FileOutputStream fio = new FileOutputStream("abc.txt")){
            fio.write(123456);
                FileInputStream fis = new FileInputStream("abc.txt");
                int data;
                while((fis.read())!=-1){
                    data = fis.read();
                    System.out.println(data);
                }
                fis.close();
            }
        }
    }
