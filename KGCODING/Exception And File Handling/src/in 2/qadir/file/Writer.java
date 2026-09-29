package in.qadir.file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer
{
    public static void main(String[] args)
    {
        String file = "Java-Course.txt";
        try(FileWriter writer =  new FileWriter(file))
        {
            writer.write("This is the best java course.\n");
            for(int i = 0; i < 10000; i++)
            {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File written sucessfully.");
        }
        catch (IOException e)
        {
            System.out.printf("Exception occured %s\n", e.getMessage());
        }
    }
}