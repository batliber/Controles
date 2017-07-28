package uy.com.amensg.controles.robot;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import uy.com.amensg.controles.robot.util.Configuration;
import uy.com.amensg.controles.webservices.ControlesWebService;

public class ConnectionStrategyWebService implements IConnectionStrategy {

	public String getSiguienteMidParaControlar() {
		String result = "";
		
		try {
			Service service = Service.create(
				new URL(Configuration.getInstance().getProperty("ControlesWebServiceWSDLURL")), 
				new QName("http://webservices.logistica.amensg.com.uy/", "ControlesWebServiceService")
			);
			
			ControlesWebService webService = service.getPort(ControlesWebService.class);
			
			result = webService.getSiguienteMidParaControlar();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	public void actualizarDatosControl(
		String empresaId,
		String tipoControlId,
		String mid, 
		String estadoControlId,
		String fechaActivacion,
		String fechaConexion,
		String fechaVencimiento,
		String cargaInicial,
		String montoCargar,
		String montoTotal
	) {
		try {
			Service service = Service.create(
				new URL(Configuration.getInstance().getProperty("ControlesWebServiceWSDLURL")), 
				new QName("http://webservices.logistica.amensg.com.uy/", "ControlesWebServiceService")
			);
			
			ControlesWebService webService = service.getPort(ControlesWebService.class);
			
			webService.actualizarDatosControl(
				empresaId,
				tipoControlId,
				mid, 
				estadoControlId,
				fechaActivacion,
				fechaConexion,
				fechaVencimiento,
				cargaInicial,
				montoCargar,
				montoTotal
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}