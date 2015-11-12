/**
 * @author gsong
 */
package RDF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Read{
	 String filePath;
	 
	 public Read(String filePath){
		 this.filePath = filePath;
	}
         
    public static void main(String[] argv){
        streamReadTest();
    }

    private static void streamReadTest(){
        try {
            streamRead("http://localhost/randomtext.php");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    /**
     *
     * Function to read out a stream of data rather than just a file
     * @param is: the inputstream
     */
    public static void streamRead(String url) throws IOException{
        URL resource = new URL(url);
        InputStreamReader is = new InputStreamReader(resource.openStream());
        BufferedReader br = new BufferedReader( is );
        StringBuffer text = new StringBuffer();
        String line = br.readLine();
        while (  line != null ){
            text.append( line );
            line = br.readLine();
            System.out.println("got line");
        }     
        System.out.print(text);
    }
         
	 public static ArrayList<RDFTriple> Reader(String filePath){
			File file = new File(filePath);
			BufferedReader reader = null;
			ArrayList<RDFTriple> readList = new ArrayList<RDFTriple>();
			try{
				reader = new BufferedReader(new FileReader(file));
				String tempsString = null;
				while((tempsString = reader.readLine())!=null){
					String parts[] = tempsString.split(" +");
					String Subject = parts[0];				
					String Predicate = parts[1];
					String Object = parts[2];
					RDFTriple rdf = new RDFTriple(Subject, Predicate, Object);
					rdf.setSubject(Subject);
					rdf.setPredicate(Predicate);
					rdf.setObject(Object);
					readList.add(rdf);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				if(reader != null){
					try{
						reader.close();
					}catch(IOException e1){
						//Do nothing
					}
				}
			}
			return readList;
		}
         
}