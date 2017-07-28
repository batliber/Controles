package uy.com.amensg.controles.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarDatosControl_QNAME = new QName("http://webservices.logistica.amensg.com.uy/", "actualizarDatosControl");
    private final static QName _ActualizarDatosControlResponse_QNAME = new QName("http://webservices.logistica.amensg.com.uy/", "actualizarDatosControlResponse");
    private final static QName _GetSiguienteMidParaControlar_QNAME = new QName("http://webservices.logistica.amensg.com.uy/", "getSiguienteMidParaControlar");
    private final static QName _GetSiguienteMidParaControlarResponse_QNAME = new QName("http://webservices.logistica.amensg.com.uy/", "getSiguienteMidParaControlarResponse");

    public ObjectFactory() {
    	
    }

    public ActualizarDatosControl createActualizarDatosControl() {
        return new ActualizarDatosControl();
    }

    public ActualizarDatosControlResponse createActualizarDatosControlResponse() {
        return new ActualizarDatosControlResponse();
    }
    
    public GetSiguienteMidParaControlar createGetSiguienteMidParaControlar() {
        return new GetSiguienteMidParaControlar();
    }

    public GetSiguienteMidParaControlarResponse createGetSiguienteMidParaControlarResponse() {
        return new GetSiguienteMidParaControlarResponse();
    }

    @XmlElementDecl(namespace = "http://webservices.logistica.amensg.com.uy/", name = "actualizarDatosControl")
    public JAXBElement<ActualizarDatosControl> createActualizarDatosControl(ActualizarDatosControl value) {
        return new JAXBElement<ActualizarDatosControl>(_ActualizarDatosControl_QNAME, ActualizarDatosControl.class, null, value);
    }

    @XmlElementDecl(namespace = "http://webservices.logistica.amensg.com.uy/", name = "actualizarDatosControlResponse")
    public JAXBElement<ActualizarDatosControlResponse> createActualizarDatosControlResponse(ActualizarDatosControlResponse value) {
        return new JAXBElement<ActualizarDatosControlResponse>(_ActualizarDatosControlResponse_QNAME, ActualizarDatosControlResponse.class, null, value);
    }
    
    @XmlElementDecl(namespace = "http://webservices.logistica.amensg.com.uy/", name = "getSiguienteMidParaControlar")
    public JAXBElement<GetSiguienteMidParaControlar> createGetSiguienteMidParaControlar(GetSiguienteMidParaControlar value) {
        return new JAXBElement<GetSiguienteMidParaControlar>(_GetSiguienteMidParaControlar_QNAME, GetSiguienteMidParaControlar.class, null, value);
    }

    @XmlElementDecl(namespace = "http://webservices.logistica.amensg.com.uy/", name = "getSiguienteMidParaControlarResponse")
    public JAXBElement<GetSiguienteMidParaControlarResponse> createGetSiguienteMidParaControlarResponse(GetSiguienteMidParaControlarResponse value) {
        return new JAXBElement<GetSiguienteMidParaControlarResponse>(_GetSiguienteMidParaControlarResponse_QNAME, GetSiguienteMidParaControlarResponse.class, null, value);
    }
}