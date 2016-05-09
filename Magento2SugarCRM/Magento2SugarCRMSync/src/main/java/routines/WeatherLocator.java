/**
 * WeatherLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class WeatherLocator extends org.apache.axis.client.Service implements routines.Weather {

/**
 * Provides weather forcasts for U.S. cities
 */

    public WeatherLocator() {
    }


    public WeatherLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WeatherLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WeatherSoap
    private java.lang.String WeatherSoap_address = "http://www.deeptraining.com/webservices/weather.asmx";

    public java.lang.String getWeatherSoapAddress() {
        return WeatherSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WeatherSoapWSDDServiceName = "WeatherSoap";

    public java.lang.String getWeatherSoapWSDDServiceName() {
        return WeatherSoapWSDDServiceName;
    }

    public void setWeatherSoapWSDDServiceName(java.lang.String name) {
        WeatherSoapWSDDServiceName = name;
    }

    public routines.WeatherSoap_PortType getWeatherSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WeatherSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeatherSoap(endpoint);
    }

    public routines.WeatherSoap_PortType getWeatherSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            routines.WeatherSoap_BindingStub _stub = new routines.WeatherSoap_BindingStub(portAddress, this);
            _stub.setPortName(getWeatherSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeatherSoapEndpointAddress(java.lang.String address) {
        WeatherSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (routines.WeatherSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                routines.WeatherSoap_BindingStub _stub = new routines.WeatherSoap_BindingStub(new java.net.URL(WeatherSoap_address), this);
                _stub.setPortName(getWeatherSoapWSDDServiceName());
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
        if ("WeatherSoap".equals(inputPortName)) {
            return getWeatherSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://litwinconsulting.com/webservices/", "Weather");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://litwinconsulting.com/webservices/", "WeatherSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WeatherSoap".equals(portName)) {
            setWeatherSoapEndpointAddress(address);
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
