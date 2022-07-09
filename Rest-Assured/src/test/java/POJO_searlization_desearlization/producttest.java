package POJO_searlization_desearlization;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class producttest {

	public static void main(String[] args) throws Throwable {
		//Serilization
		//pojo to json readable
		
		JsonSerializer json= JsonSerializer.DEFAULT_READABLE;
		
		String sellarnames[]= {"vijay enterprise","ABC software solutions"};
		
		Product pro = new Product("Hp laptop", "50k", "black", sellarnames);
	
		//pojo to json readable
	String js=	json.serialize(pro);
	System.out.println(js);
	
	
	//pojo to xml readable
	XmlSerializer xml=	XmlSerializer.DEFAULT_NS_SQ_READABLE;
	String XML = xml.serialize(pro);
	 System.out.println(XML);
	 
	//pojo to HTML
	 HtmlSerializer html=	 HtmlSerializer.DEFAULT_SQ_READABLE; 
	String ht = html.serialize(pro);
	System.out.println(ht);
	
	
	//Deserilization
	JsonParser parser=	JsonParser.DEFAULT;
	
	String parse = "{\r\n"
			+ "	\"color\": \"black\",\r\n"
			+ "	\"name\": \"Hp laptop\",\r\n"
			+ "	\"price\": \"50k\",\r\n"
			+ "	\"sellarnames\": [\r\n"
			+ "		\"vijay enterprise\",\r\n"
			+ "		\"ABC software solutions\"\r\n"
			+ "	]\r\n"
			+ "}";
	
Product product =	parser.parse(parse, Product.class);
System.out.println(product.getColor());


//same way have to written for both xml and html for deserlization
	

	}

}
