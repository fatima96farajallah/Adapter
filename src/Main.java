import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {

        final String fileName = "input.xml";

        File xmlFile = new File(fileName);

        try {

            byte[] b = Files.readAllBytes(xmlFile.toPath());

            String xml = new String(b);

            JSONObject obj = converter.convert(xml);

            System.out.println(obj);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}
