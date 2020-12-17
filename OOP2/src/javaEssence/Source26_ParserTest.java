package javaEssence;

interface Parserable {
	// 구문 분석작업을 수행한다.
	public abstract void parse(String fileName);
}

class ParserManager{
	// 리턴타입이 Parserable 인터페이스 이이다.
	public static Parserable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parserable p = new HTMLParser();
			return p;
//			return new HTMLParser();
		}
	}
	
}

class XMLParser implements Parserable{
	@Override
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "- XML parsing completed.");
	}
}

class HTMLParser implements Parserable{
	@Override
	public void parse(String fileName) {
		/* 구문 분석작업을 수행하는 코드를 적는다. */
		System.out.println(fileName + "- HTML parsing completed.");
	}
}

public class Source26_ParserTest {
	public static void main(String[] args) {
		Parserable p = ParserManager.getParser("XML");
		p.parse("file.xml");
		
		p = ParserManager.getParser("html");
		p.parse("file.html");
	}
}
