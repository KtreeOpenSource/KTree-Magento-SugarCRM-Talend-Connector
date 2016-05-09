/**
 * GenericTicketConnectorLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class GenericTicketConnectorLocator extends org.apache.axis.client.Service implements routines.GenericTicketConnector {

    public GenericTicketConnectorLocator() {
    }


    public GenericTicketConnectorLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GenericTicketConnectorLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GenericTicketConnector_endPoint
    private java.lang.String GenericTicketConnector_endPoint_address = "http://localhost/otrs/nph-genericinterface.pl/Webservice/GenericTicketConnector";

    public java.lang.String getGenericTicketConnector_endPointAddress() {
        return GenericTicketConnector_endPoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GenericTicketConnector_endPointWSDDServiceName = "GenericTicketConnector_endPoint";

    public java.lang.String getGenericTicketConnector_endPointWSDDServiceName() {
        return GenericTicketConnector_endPointWSDDServiceName;
    }

    public void setGenericTicketConnector_endPointWSDDServiceName(java.lang.String name) {
        GenericTicketConnector_endPointWSDDServiceName = name;
    }

    public routines.GenericTicketConnector_Interface getGenericTicketConnector_endPoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GenericTicketConnector_endPoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGenericTicketConnector_endPoint(endpoint);
    }

    public routines.GenericTicketConnector_Interface getGenericTicketConnector_endPoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            routines.GenericTicketConnector_ServiceStub _stub = new routines.GenericTicketConnector_ServiceStub(portAddress, this);
            _stub.setPortName(getGenericTicketConnector_endPointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGenericTicketConnector_endPointEndpointAddress(java.lang.String address) {
        GenericTicketConnector_endPoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (routines.GenericTicketConnector_Interface.class.isAssignableFrom(serviceEndpointInterface)) {
                routines.GenericTicketConnector_ServiceStub _stub = new routines.GenericTicketConnector_ServiceStub(new java.net.URL(GenericTicketConnector_endPoint_address), this);
                _stub.setPortName(getGenericTicketConnector_endPointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GenericTicketConnector_endPoint".equals(inputPortName)) {
            return getGenericTicketConnector_endPoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "GenericTicketConnector");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "GenericTicketConnector_endPoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GenericTicketConnector_endPoint".equals(portName)) {
            setGenericTicketConnector_endPointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
