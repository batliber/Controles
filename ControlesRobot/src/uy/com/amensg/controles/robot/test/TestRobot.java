package uy.com.amensg.controles.robot.test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import uy.com.amensg.controles.robot.util.Configuration;
import uy.com.amensg.controles.webservices.ControlesWebService;

public class TestRobot {

	public TestRobot() {
		try {
			Service service = Service.create(
				new URL(Configuration.getInstance().getProperty("ControlesWebServiceWSDLURL")), 
				new QName("http://webservices.logistica.amensg.com.uy/", "ControlesWebServiceService")
			);
				
			ControlesWebService webService = service.getPort(ControlesWebService.class);
				
			System.out.println(webService.getSiguienteMidParaControlar());
			
			webService.actualizarDatosControl(
				"empresaId",
				"tipoControlId",
				"mid", 
				"estadoControlId",
				"fechaActivacion",
				"fechaConexion",
				"fechaVencimiento",
				"cargaInicial",
				"montoCargar",
				"montoTotal"
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new TestRobot();
	}
}