import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Minify {
    String minify=new String();
    File file;
    Scanner sc;
    Minify(String s) throws FileNotFoundException {
        this.minify=s;
         file =new File(this.minify);
         sc=new Scanner(file);
    }
    public String toMinify()
    {
        String x=new String("");
        String y=new String("");
        while (sc.hasNextLine()) {
            String sent = sc.nextLine();
            x+=sent;

        }

        for(int i=0;i<x.length();i++){
            if(x.charAt(i)!=' '){
                y+=x.charAt(i);
            }
        }
        return y;
    }


}
