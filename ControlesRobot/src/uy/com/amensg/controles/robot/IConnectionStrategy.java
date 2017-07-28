package uy.com.amensg.controles.robot;

public interface IConnectionStrategy {

	public String getSiguienteMidParaControlar();

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
	);
}