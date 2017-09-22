package xml.demo01;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jLearn {

	public static void main(String[] args) throws DocumentException {
		SAXReader reader = new SAXReader();
			Document doc = reader.read("../HelloWorld/xmlFile/Learn02.xml");
			Element ap = doc.getRootElement();
			List<Element> list = ap.elements();
			for(Element e : list) {
				System.out.println(e.getName());
			}
			System.out.println(ap.getName());
	}

}
