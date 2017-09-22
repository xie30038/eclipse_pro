package xml.demo01;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class XMLTest01 {

	public static void main(String[] args) throws IOException, SAXException {
		//获取xml文档实例
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			//创建documentBuilder对象
			DocumentBuilder db = dbf.newDocumentBuilder();
			//获取文件
			Document doc =  db.parse("../HelloWorld/xmlFile/Learn02.xml");
			Element e = doc.getDocumentElement();
			System.out.println(e.getNodeName());
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		
	}

}
