
public class XmlAddisionReport extends XmlReport{
	
	public static void main(String[]args){
		
		XmlAddisionReport xml = new XmlAddisionReport();
		
		
		xml.drawHeader();
		xml.putLogo();
		xml.xmlExtraReport();
		xml.fillReportContents();
	}
	

	@Override
	public void fillReportContents() {
		System.out.println("Generate Final Xml Report");
	}

}
