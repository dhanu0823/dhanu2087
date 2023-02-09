package JavaUtilities;
// Import statement for FileInputStrem class
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
// Class defination for Dataprovider01
public class Dataprovider01 {
	// Dataprovider annotation with name "signing"
  @DataProvider(name = "signing")
  //Method to get data from excel file
  public String[][] getexceldata() throws IOException {
	 // Initialize a 2D array with 1 row and 2 columns
	  // 2D array to store data from excel file
  String [][] data = new String[1][2];	
  // File path for excel file
  String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab.xlsx";
  // Creating object for FileInputStream class
  FileInputStream input1=new FileInputStream(excelpath);	 
  // Creating object for XSSFWorkbook class
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	// Getting a sheet from workbook by name "sheet1"
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	// Getting nember of rows in the sheet
	int rowcount=sheet.getPhysicalNumberOfRows();	
	// Loop to iterate through all the rows
		for(int i=0;i<rowcount;i++)   {	 
			// Getting cell values for column 0 and storing in data[i][0]
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);

	// Getting cell values for column 1 and storing in data[i][1]
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);  	}
		// Return 2D array data
		return data;   }
  
//Dataprovider annotation with name "signing1"
	@DataProvider(name = "signing1")
	//Method to get data from excel file
	public String[][] getexceldata1() throws IOException {
		// 2D array to store data from excel file
	String [][] data = new String[1][2];	
	// Store the path of the Excel file 
	String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab.xlsx";
	 // Creating object for FileInputStream class
	FileInputStream input1=new FileInputStream(excelpath);	
	// Creating object for XSSFWorkbook class
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	// Getting a sheet from workbook by name "sheet2"
	XSSFSheet sheet=workbook.getSheet("Sheet2");
	// Getting nember of rows in the sheet
	int rowcount=sheet.getPhysicalNumberOfRows();
	// Loop to iterate through all the rows
	for(int i=0;i<1;i++)   {
		// Getting cell values for column 0 and storing in data[i][0]
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);
	// Getting cell values for column 1 and storing in data[i][1]
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);  	}
	// Return 2D array data
	return data;    }
	
	//Dataprovider annotation with name "signing1"
	@DataProvider(name = "signing2")
	//Method to get data from excel file
	public String[][] getexceldata2() throws IOException {
		// 2D array to store data from excel file
	String [][] data = new String[1][2];	
	// Store the path of the Excel file 
	String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab.xlsx";
	// Creating object for FileInputStream class
	FileInputStream input1=new FileInputStream(excelpath);	 
	// Creating object for XSSFWorkbook class
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	// Getting a sheet from workbook by name "sheet3"
	XSSFSheet sheet=workbook.getSheet("Sheet3");
	// Getting nember of rows in the sheet
	int rowcount=sheet.getPhysicalNumberOfRows();
	// Loop to iterate through all the rows
		for(int i=0;i<1;i++)	{	 
		// Getting cell values for column 0 and storing in data[i][0]
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);
	// Getting cell values for column 1 and storing in data[i][1]
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);  }
		// Return 2D array data
	return data;  }
	
	//Dataprovider annotation with name "purchase"
	@DataProvider(name = "purchase")
	//Method to get data from excel file
	public String[][] getexceldata3() throws IOException {
		// 2D array to store data from excel file
	String [][] data = new String[1][5];
	// Store the path of the Excel file 
	String excelpath="C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab1.xlsx";
	// Creating object for FileInputStream class
	FileInputStream input1=new FileInputStream(excelpath);	
	// Creating object for XSSFWorkbook class
	XSSFWorkbook workbook=new XSSFWorkbook(input1);
	// Getting a sheet from workbook by name "sheet1"
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	// Getting nember of rows in the sheet
	int rowcount=sheet.getPhysicalNumberOfRows();
	// Loop to iterate through all the rows
	for(int i=0;i<1;i++)    {	 
		// Getting cell values for column 0 and storing in data[i][0]
	data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(data[i][0]);
	// Getting cell values for column 0 and storing in data[i][1]
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
   	System.out.println(data[i][1]);
 // Getting cell values for column 0 and storing in data[i][2]
	data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
	System.out.println(data[i][2]);
	// Getting cell values for column 0 and storing in data[i][3]
	data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
	System.out.println(data[i][3]);
	// Getting cell values for column 0 and storing in data[i][4]
	data[i][4]= String.valueOf(sheet.getRow(i).getCell(4).getRawValue());
	System.out.println(data[i][4]);   	}
	// Return 2D array data
		return data;   }
	
	//Method to get data from excel file
	@DataProvider(name = "purchase1")
	//Method to get data from excel file
	public String[][] getexceldata4() throws IOException {
		// 2D array to store data from excel file
	String [][] data = new String[1][5];
	// Store the path of the Excel file 
	String excelpath= "C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\SwaglabsAuto01\\Swaglab1.xlsx";
	// Creating object for FileInputStream class
	FileInputStream input1=new FileInputStream(excelpath);	
	// Creating object for XSSFWorkbook class
		XSSFWorkbook workbook=new XSSFWorkbook(input1);
		// Getting a sheet from workbook by name "sheet1"
		XSSFSheet sheet=workbook.getSheet("Sheet2");
		// Getting nember of rows in the sheet
		int rowcount=sheet.getPhysicalNumberOfRows();
		// Loop to iterate through all the rows
		for(int i=0;i<1;i++)	{	
		// Getting cell values for column 0 and storing in data[i][4]
		data[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data[i][0]);
		// Getting cell values for column 0 and storing in data[i][1]
	data[i][1]=sheet.getRow(i).getCell(1).getStringCellValue();
	System.out.println(data[i][1]);
	// Getting cell values for column 0 and storing in data[i][2]
	data[i][2]=sheet.getRow(i).getCell(2).getStringCellValue();
	System.out.println(data[i][2]);
	// Getting cell values for column 0 and storing in data[i][3]
	data[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
	System.out.println(data[i][3]);
	// Getting cell values for column 0 and storing in data[i][4]
	data[i][4]= String.valueOf(sheet.getRow(i).getCell(4).getRawValue());
    System.out.println(data[i][4]);  	}
		// Return 2D array data
		return data;	}       }

