import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Example1 {

        public static void main(String[] args){
            try{//https://thecareerlabs.com/
                URL url=new URL("https://www.javatpoint.com/URLConnection-class");
                URLConnection urlcon=url.openConnection();
                InputStream stream=urlcon.getInputStream();
                int i;
                while((i=stream.read())!=-1){
                    System.out.print((char)i);
                }
            }catch(Exception e){System.out.println(e);}
        }
    }

