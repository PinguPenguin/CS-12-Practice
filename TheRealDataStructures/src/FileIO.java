import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("res/test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
            br.close();

            FileWriter fw = new FileWriter("res/test.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("fuck you!");

        } catch (IOException e){
            System.out.println("no file");
        }
    }
}
