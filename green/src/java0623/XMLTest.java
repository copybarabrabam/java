package java0623;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLTest {
	public static void main(String[ ] args){
		try {
			URL url=new URL("http://openapi.seoul.go.kr:8088/646f4165557177733531516f7a7777/xml/SebcHeritageInfoEng/1/5/");
			InputStream stream =url.openStream();
			char ch=0;
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(stream);
			doc.getDocumentElement().normalize();
	 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("row");
			System.out.println("-----------------------");
	 
			for (int temp = 0; temp < nList.getLength(); temp++) {
			   Node nNode = nList.item(temp);
			   if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	 
			      Element eElement = (Element) nNode;
	 
			      System.out.println("문화재  번호: " + getTagValue("MNG_NO", eElement));
			      System.out.println("문화재 이름: " + getTagValue("NAME_ENG", eElement));
			      System.out.println("문화재 지정일 : " + getTagValue("DESIGNATION_DATE", eElement));	
			      System.out.println();
	 
			   }
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
 
  private static String getTagValue(String sTag, Element eElement) {
	NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
    Node nValue = (Node) nlList.item(0);
	return nValue.getNodeValue();
  }
 
}	
