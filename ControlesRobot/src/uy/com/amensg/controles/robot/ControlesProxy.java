package uy.com.amensg.controles.robot;

import uy.com.amensg.controles.robot.ConnectionStrategyWebService;

public class ControlesProxy {

private IConnectionStrategy iConnectionStrategy = new ConnectionStrategyWebService();
	
	public void getSiguienteMidParaControlar() {
		System.out.println(iConnectionStrategy.getSiguienteMidParaControlar());
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
		String montoTotal) {
		iConnectionStrategy.actualizarDatosControl(
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
	}
	
	public static void main(String[] args) {
		if (args[0].equals("getSiguienteMidParaControlar")) {
			new ControlesProxy().getSiguienteMidParaControlar();
		} else if (args[0].equals("actualizarDatosMid")) {
			new ControlesProxy().actualizarDatosControl(
				args[1],
				args[2],
				args[3],
				args[4],
				args[5],
				args[6],
				args[7],
				args[8],
				args[9],
				args[10]
			);
		}
	}
}