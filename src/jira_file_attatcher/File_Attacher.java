/**
 * 
 */
package jira_file_attatcher;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

/**
 * @author cash
 *
 */
public class File_Attacher {
	
	static Scanner inputSerialNumber;
	static String unitSerialNumber, fromPath1, fromPath2, toPath; 
	static File unit, newDirectory, fromDir1, fromDir2;

	
	
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static String getFiles(File File)
	{
		for (File file : File.listFiles()){
			String filePath = file.getPath();
			if (file.isFile() && filePath.contains(unitSerialNumber)){
				return filePath;
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Please input a serial number to search for: ");
		inputSerialNumber = new Scanner (System.in);
		unitSerialNumber = inputSerialNumber.nextLine();
		fromDir1 = new File("//mri-fileserver/SMW Shipping/5500-000-DW-000-XX");
		fromPath1 = getFiles(fromDir1).toString();
		fromDir2 = new File("//mri-pultt/Production Test Results/" + unitSerialNumber);
		//fromDir2 = new File("//mri-pultt/Production Test Results/~FinalResults/Budweiser Coolers #1");
		fromPath2 = getFiles(fromDir2).toString();
		toPath = "C:/Users/cash/Documents/Test/";
		
		
		
		unit = new File(unitSerialNumber);
		newDirectory = new File(toPath + "/" + unitSerialNumber);
		
		
		if (!newDirectory.exists()){
			System.out.println("Creating New Directory for " + unitSerialNumber);
			boolean result = false;
			
			try {
				newDirectory.mkdir();
				result = true;
			} catch (SecurityException se){
				//handle it
			}
			if (result){
				System.out.println("Directory Created");
			}
		}
		System.out.println(unit);
		
		
		FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File fromDir1, String name) {
				// TODO Auto-generated method stub
				return name.contains(unitSerialNumber);
			}
		};
		
		String[] children = fromDir1.list(filter);
		if (children == null){
			System.out.println("Either dir does not exist or is not a directory");
		}
		else {
			
			Path FROM = Paths.get(fromPath1);
			Path TO = Paths.get(newDirectory + "/" + unitSerialNumber + ".pdf");
			Files.copy(FROM, TO, StandardCopyOption.COPY_ATTRIBUTES);
		}
		
		
		FilenameFilter filter2 = new FilenameFilter() {
			
			@Override
			public boolean accept(File fromDir2, String name) {
				// TODO Auto-generated method stub
				
				return name.contains("FullSystemTest");
				
			}
		};
		
		String[] children2 = fromDir2.list(filter2);
		if (children2 == null){
			System.out.println("Either dir does not exist or is not a directory");
		}
		else {
			
			Path FROM = Paths.get(fromPath2);
			Path TO = Paths.get(newDirectory +"/" + unitSerialNumber + ".rtf");
			Files.copy(FROM, TO, StandardCopyOption.COPY_ATTRIBUTES);
		}
		

	}

}
