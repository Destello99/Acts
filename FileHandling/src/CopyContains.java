import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyContains {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fis = new FileInputStream("C:\\Users\\Varad\\IdeaProjects\\FileHandling\\src\\next.txt");
            FileOutputStream fos = new FileOutputStream("abc.txt")){
            int data;
            while((data=fis.read())!=-1){
                fos.write(data);
            }
            System.out.println("Copy done");
        }
    }
}
