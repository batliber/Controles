package uy.com.amensg.controles.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://webservices.logistica.amensg.com.uy/", name = "ControlesWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface ControlesWebService {

    @WebMethod
    @RequestWrapper(
    	localName = "actualizarDatosControl", 
    	targetNamespace = "http://webservices.logistica.amensg.com.uy/", 
    	className = "uy.com.amensg.controles.webservices.ActualizarDatosControl"
    )
    @ResponseWrapper(
    	localName = "actualizarDatosControlResponse", 
    	targetNamespace = "http://webservices.logistica.amensg.com.uy/", 
    	className = "uy.com.amensg.controles.webservices.ActualizarDatosControlResponse"
    )
    public void actualizarDatosControl(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        java.lang.String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        java.lang.String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        java.lang.String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        java.lang.String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        java.lang.String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        java.lang.String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        java.lang.String arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        java.lang.String arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        java.lang.String arg9
    );
    
    @WebMethod
    @RequestWrapper(
    	localName = "getSiguienteMidParaControlar", 
    	targetNamespace = "http://webservices.logistica.amensg.com.uy/", 
    	className = "uy.com.amensg.controles.webservices.GetSiguienteMidParaControlar"
    )
    @ResponseWrapper(
    	localName = "getSiguienteMidParaControlarResponse", 
    	targetNamespace = "http://webservices.logistica.amensg.com.uy/", 
    	className = "uy.com.amensg.controles.webservices.GetSiguienteMidParaControlarResponse"
    )
    @WebResult(name = "return", targetNamespace = "")
    public String getSiguienteMidParaControlar();
}