
public class ExcelReportGenerator extends ReportAbstractClass {


	public static void main(String[]args){
		
		ExcelReportGenerator excel = new ExcelReportGenerator();  ;
		
		
		excel.drawHeader();
		excel.putLogo();
		excel.fillReportContents();
		excel.drawFooter();
		
		
		
	}
	
		
	@Override
	public void fillReportContents() {
		System.out.println("Generate Report for Excel");
	
	}

	
}
