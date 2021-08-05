package CollatzPorblem;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Writer {
	
	private String storagePath;
	private File file;
	private FileWriter writer;
	
	public Writer(String speicherort) {
		this.storagePath = speicherort;
	}


	private void create(String storagePath) {
		  this.storagePath = storagePath;
	        try {
	  
	            // Get the file
	            file = new File(storagePath);
	  
	            // Create new file
	            // Check if it does not exist
	            if (file.createNewFile())
	                System.out.println("File created");
	            else
	                System.out.println("File already exists");
	        }
	        catch (Exception e) {
	            System.err.println(e);
	        }
	  }
	  
	  public void start() {
		  create(storagePath);
		  try {
			writer = new FileWriter(file);
			System.out.println("FileWriter wurde gestartet");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	
	  public void write(String text) {
		  try {
			writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

}
