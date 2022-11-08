package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class is consists all common action on excel
 * @author PAPPU YADAV
 *
 */
public class ExcelUtility 
{
	//accessSpecifier modifier returntype methodName(parameter) {}
	//accessSpecifier----->public,private,protected,default
	//modifier----> static, non-static
	//returntype----> primitive and class type
	//methodName----> follow camelCase---> give meaningfull name
	//parameter----->optional1----> basedon statement input1
	Workbook wb;

	/**
	 * This method is used to intiallize and open the excel workbook
	 * @param excelPath
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void openExcel(String excelPath) throws EncryptedDocumentException, IOException {
		FileInputStream fisExcel = new FileInputStream(excelPath);
		wb = WorkbookFactory.create(fisExcel);
	}
	/**
	 * This method is used to fetch the data from the excel
	 * @param excelPath
	 * @param sheetName
	 * @param rowNumber
	 * @param cellNumber
	 * @return 
	 * @return
	 * @throws IOException
	 * @throws EncryptedDocumentException
	 */
	public String getDataFromExcel(String sheetName, int rowNumber, int cellNumber)
	{
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet(sheetName);
		String data = new DataFormatter().formatCellValue(sheet.getRow(rowNumber).getCell(cellNumber));
		return data;
	}
	/**
	 * This method is used close the workbook
	 * @throws IOException
	 */
	public void closeExcelWorkBook() throws IOException {
		wb.close();
	}
	/**
	 * This method is used to set the data into excel
	 * @param shhetName
	 * @param rowNumber
	 * @param cellNumber
	 * @param text
	 */
	public void setDataIntoExcel(String sheetName, int rowNumber, int cellNumber, String text) {
		Sheet sheet = wb.getSheet(sheetName);
		sheet.getRow(rowNumber).createCell(cellNumber).setCellValue(text);
	}
	/**
	 * This method is used to save the Data into Excel
	 * @param output
	 * @param FileNotFoundException
	 * @throws IOException
	 */
	public void saveDataIntoExcel(String outputPath) throws FileNotFoundException,IOException {
		wb.write(new FileOutputStream(outputPath));
	}	
	/**
	 * This method is used to fetch the data from the excel based on key
	 * @param sheetName
	 * @param requiredKey
	 * @return
	 */
	public String getDataFromExcelInKey(String sheetName, String requiredKey) {
		Sheet sheet = wb.getSheet(sheetName);

		String value = null;
		for(int i=0; i<=sheet.getLastRowNum(); i++) {
			String actualKey = sheet.getRow(i).getCell(0).getStringCellValue();
			if(actualKey.equalsIgnoreCase(requiredKey)) {
				value = sheet.getRow(i).getCell(1).getStringCellValue();
				break;
			}
		}
		return value;
	}  
	/**
	 * This method is used to fetch the data from the excel and stored in map
	 * @param sheetName
	 * @return
	 */
	public Map<String, String> getDataFromExcelInMap(String sheetName){
		Sheet sheet = wb.getSheet(sheetName);
		Map<String, String> map = new HashMap<>();
		DataFormatter df = new DataFormatter();
		for(int i = 0; i<=sheet.getLastRowNum();i++) {
			map.put(df.formatCellValue(sheet.getRow(i).getCell(0)), df.formatCellValue(sheet.getRow(i).getCell(1)));
		}
		return map;
	}
	/**
	 * This method is used to fetch the data from excel and stored in List<Map>
	 * @param sheetName
	 * @return
	 */
	public List<Map<String, String>> getDataFromExcelInList(String sheetName) {
		Sheet sheet = wb.getSheet(sheetName);
		List<Map<String, String>>list = new ArrayList<>();
		DataFormatter df = new DataFormatter();
		for(int k=1;k<=sheet.getRow(0).getLastCellNum(); k++) {
			Map<String, String> map = new HashMap<>();
			for (int i= 0; i<=sheet.getLastRowNum(); i++) {
				map.put(df.formatCellValue(sheet.getRow(i).getCell(0)),df.formatCellValue(sheet.getRow(i).getCell(k)));
			}
			list.add(map);
		}
		return list;
	}
	// testng
public String getDataFromExcel(String sheetName, String requiredKey, String testcaseName)
{
	Sheet sheet = wb.getSheet(sheetName);
	String value = null;
	for(int i=0; i<=sheet.getLastRowNum(); i++) {
	String actualTestCaseName = sheet.getRow(i).getCell(0).getStringCellValue();
	if(actualTestCaseName.equalsIgnoreCase(testcaseName)) {
	for(int j= 1; j<sheet.getRow(i).getLastCellNum(); j++) {
	String actualKey = sheet.getRow(i).getCell(j).getStringCellValue();
	if(actualKey.equalsIgnoreCase(requiredKey)) 
		value = sheet.getRow(i+1).getCell(j).getStringCellValue();
	break;
	}
	break;
	}
return value;
	}
	return value;
	}

/**
 * This method is used to fetch multiple data from excel and return as 2 dimensional array
 * @param sheetName
 * @return
 */
public String[][]getMultipleData(String sheetName)
{
Sheet sheet = wb.getSheet(sheetName);
DataFormatter df = new DataFormatter();
String[][] arr = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
for(int i=1; i<=sheet.getLastRowNum(); i++) 
{
for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++) {
arr[i-1][j]= df.formatCellValue(sheet.getRow(i).getCell(j));
}
}
return arr;
}
}
