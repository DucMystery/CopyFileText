import java.io.*;
import java.nio.file.Files;

public class CoppyExample {

    public static void main(String[] args) throws IOException {

        final String copy = "Copy.txt";
        final String paste = "Past.txt";

        File source = new File(copy);
        File dest = new File(paste);
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
             inputStream = new FileInputStream(source);
             outputStream = new FileOutputStream(paste);

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inputStream.read(buffer))>0){
                outputStream.write(buffer,0,length);
            }
            System.out.println("File is copied successful !");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }


    }
}
