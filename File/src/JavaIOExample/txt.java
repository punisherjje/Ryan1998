    package JavaIOExample;
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.util.Scanner;
    
    public class txt {
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Enter the File path");
    		String filePath = scanner.next();
    		
    		File file = new File(filePath);
    		Scanner scannerFile = null;
    		try {
    			
    			scannerFile = new Scanner(file);
    			
    			while (scannerFile.hasNext())
    				System.out.println(scannerFile.next());
    		} catch (FileNotFoundException e) {
    			e.printStackTrace();
    		} finally {
    			scanner.close();
    		}
    	}
    }