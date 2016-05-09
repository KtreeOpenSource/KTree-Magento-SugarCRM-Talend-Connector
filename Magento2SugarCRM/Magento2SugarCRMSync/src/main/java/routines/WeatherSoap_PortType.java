/**
 * WeatherSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public interface WeatherSoap_PortType extends java.rmi.Remote {

    /**
     * Returns the weather for a given city
     */
    public java.lang.String getWeather(java.lang.String city) throws java.rmi.RemoteException;
}
