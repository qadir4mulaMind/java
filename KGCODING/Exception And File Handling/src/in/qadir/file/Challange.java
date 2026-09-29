package in.qadir.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Challange
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your file name as you wish: ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName))
        {
            int read;
            while((read = reader.read()) != -1)
            {
                System.out.print((char)read);
            }


        }
        catch(FileNotFoundException ex)
        {
            System.out.printf("%s not found ", fileName);
        }
        catch (IOException e)
        {
            System.out.printf("Exception occured %s", e.getMessage());
        }
    }
}