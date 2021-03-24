package es.sd.holamundo;

import com.google.common.base.Joiner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Joiner commaCharJoiner = Joiner.on(";");    	
        System.out.println(commaCharJoiner.join("hola","qué tal?"));
        
    }
}
