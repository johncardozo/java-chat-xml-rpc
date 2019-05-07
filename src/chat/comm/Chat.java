package chat.comm;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class Chat {
	
	private XmlRpcClient client;

	public Chat(int puertoServidoRemoto) {
		
        // Crea la configuración del cliente
 		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
 		try {
 			config.setServerURL(new URL("http://127.0.0.1:" + puertoServidoRemoto + "/xmlrpc"));
 		} catch (MalformedURLException e) {
 			e.printStackTrace();
 		}
 		// Crea el cliente y asigna la configuración
 		this.client = new XmlRpcClient();
 		this.client.setConfig(config);		
	}
	
	public void enviarMensaje(String texto) {
 		// Crea los parámetros del servicio remoto (clase Calculator)
 		Object[] params = new Object[] { texto };
 		try {
 			// Ejecuta el método add en la clase Calculator con sus respectivos parámetros
 			String result = (String) this.client.execute("chat.model.Mensajes.agregarMensaje", params);
 			// Imprime el resultado
 			System.out.println("CLIENTE: el mensaje enviado fue: " + result.toString());
 		} catch (XmlRpcException e) {
 			e.printStackTrace();
 		} 		
	}
}
