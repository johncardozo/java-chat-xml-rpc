package chat.client;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class Client {

    public static void main(String[] args) throws Exception {
    	
		// Setup the client
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
		try {
			config.setServerURL(new URL("http://127.0.0.1:8080/xmlrpc"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		// Create the client
		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(config);

		/*
		 * ---------------- EXAMPLE 1 ---------------- 
		 */		
		
		// Create parameteres to remote service
		Object[] params = new Object[] { Integer.valueOf(33), Integer.valueOf(7) };
		try {
			// Execute add methond in Test class sending its parameters
			Integer result = (Integer) client.execute("Test.add", params);
			// Print the result
			System.out.println("The result is " + result.toString());
		} catch (XmlRpcException e) {
			e.printStackTrace();
		}    	  
        
        
    }
}
