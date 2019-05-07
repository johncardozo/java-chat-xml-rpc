package chat.server;

import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.server.XmlRpcServer;
import org.apache.xmlrpc.server.XmlRpcServerConfigImpl;
import org.apache.xmlrpc.webserver.WebServer;

public class Server {

    public static void main(String[] args) throws Exception {
    	// Create a web server
        WebServer webServer = new WebServer(8080);
      
        // Create a xmlRpc server using the web server
        XmlRpcServer xmlRpcServer = webServer.getXmlRpcServer();
      
        // Create classes manager and add the classes which offer services (methods)
        PropertyHandlerMapping phm = new PropertyHandlerMapping();
        phm.addHandler("Test", chat.server.Test.class);
        
        // Add classes manager to xmlRpc server 
        xmlRpcServer.setHandlerMapping(phm);
      
        // Setup xmlRpc server
        XmlRpcServerConfigImpl serverConfig = (XmlRpcServerConfigImpl) xmlRpcServer.getConfig();
        serverConfig.setEnabledForExtensions(true);
        serverConfig.setContentLengthOptional(false);

        // Start web server
        webServer.start(); 
    }	
}
