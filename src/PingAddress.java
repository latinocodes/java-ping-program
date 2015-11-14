import java.util.*;
import java.io.*;

public class PingAddress {
	
    List<String> cmd = new ArrayList<String>();
 
    
    public void RunCommand(List<String> cmd, String addressToPing) throws IOException {
	    String str = "";

	    ProcessBuilder newProccess = new ProcessBuilder(cmd);
	    Process process = newProccess.start();

	    BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

	    // read the output from the command
	    System.out.println("\nPinging: " + addressToPing+ "\n");
	    while ((str = stdInput.readLine()) != null)
	    {
	      System.out.println(str);
	    }

	    // read any errors from the attempted command
	    System.out.println("There was an Error pinging (" + addressToPing + ") Please read below: \n");
	    while ((str = stdError.readLine()) != null)
	    {
	      System.out.println(str);
	    }
	  }

}
