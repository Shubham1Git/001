package staticTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Oct12Part3 {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
        String path = "C://path.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        int e = 10/0;
        System.out.println("EOP");
    }
}
