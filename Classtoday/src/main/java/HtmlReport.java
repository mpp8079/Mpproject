
public class HtmlReport extends ReportAbstractClass {
	
	
	public static void main(String[]args){
		
		HtmlReport html = new HtmlReport();
		
		html.drawHeader();
		html.putLogo();
		html.fillReportContents();
		html.drawFooter();
		
		
	}

	@Override
	public void fillReportContents() {
		System.out.println("Generate Repot Html");
	}
	
	

}
