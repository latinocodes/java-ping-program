import java.io.*;
import java.util.*;

public class PingProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 // create the ping command as a list of strings
		PingAddress ping = new PingAddress();
		
	    List<String> cmd = new ArrayList<String>();
	    Scanner in = new Scanner(System.in);
	    
	    System.out.print("Please Enter Website name or IP Address to ping: ");
	    
	    String addressToPing = in.nextLine();
	    
	    cmd.add("ping");
	    cmd.add("-c");
	    cmd.add("10");
	    cmd.add(addressToPing);
	    ping.RunCommand(cmd, addressToPing);
	    
	    in.close();
		}

	}

