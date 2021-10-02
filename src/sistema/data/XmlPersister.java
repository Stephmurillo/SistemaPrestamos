package sistema.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlPersister {
   private String path;
    private static XmlPersister theInstance;
    
    public static XmlPersister instance(){
        if (theInstance == null){ 
            theInstance = new XmlPersister();
        }
        return theInstance;
    }
    
    public Data load(String path) throws Exception{
        this.path = path;
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);  
        FileInputStream is = new FileInputStream(this.path);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();  
        Data result = (Data) unmarshaller.unmarshal(is);
        is.close();
        return result;        
    }
    
    public void store(Data d, String path)throws Exception{
        this.path = path;
        JAXBContext jaxbContext = JAXBContext.newInstance(Data.class);  
        FileOutputStream os = new FileOutputStream(this.path);
        Marshaller marshaller = jaxbContext.createMarshaller();  
        marshaller.marshal(d, os);
        os.flush();
        os.close();     
    } 
}
