/**
 * OTRS_TicketSearch_TicketFlag.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OTRS_TicketSearch_TicketFlag  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger seen;

    public OTRS_TicketSearch_TicketFlag() {
    }

    public OTRS_TicketSearch_TicketFlag(
           org.apache.axis.types.PositiveInteger seen) {
           this.seen = seen;
    }


    /**
     * Gets the seen value for this OTRS_TicketSearch_TicketFlag.
     * 
     * @return seen
     */
    public org.apache.axis.types.PositiveInteger getSeen() {
        return seen;
    }


    /**
     * Sets the seen value for this OTRS_TicketSearch_TicketFlag.
     * 
     * @param seen
     */
    public void setSeen(org.apache.axis.types.PositiveInteger seen) {
        this.seen = seen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTRS_TicketSearch_TicketFlag)) return false;
        OTRS_TicketSearch_TicketFlag other = (OTRS_TicketSearch_TicketFlag) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seen==null && other.getSeen()==null) || 
             (this.seen!=null &&
              this.seen.equals(other.getSeen())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSeen() != null) {
            _hashCode += getSeen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTRS_TicketSearch_TicketFlag.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearch_TicketFlag"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Seen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
