/**
 * OTRS_TicketUpdateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OTRS_TicketUpdateResponse  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger ticketID;

    private java.lang.String ticketNumber;

    private org.apache.axis.types.PositiveInteger articleID;

    private routines.OTRS_Error error;

    public OTRS_TicketUpdateResponse() {
    }

    public OTRS_TicketUpdateResponse(
           org.apache.axis.types.PositiveInteger ticketID,
           java.lang.String ticketNumber,
           org.apache.axis.types.PositiveInteger articleID,
           routines.OTRS_Error error) {
           this.ticketID = ticketID;
           this.ticketNumber = ticketNumber;
           this.articleID = articleID;
           this.error = error;
    }


    /**
     * Gets the ticketID value for this OTRS_TicketUpdateResponse.
     * 
     * @return ticketID
     */
    public org.apache.axis.types.PositiveInteger getTicketID() {
        return ticketID;
    }


    /**
     * Sets the ticketID value for this OTRS_TicketUpdateResponse.
     * 
     * @param ticketID
     */
    public void setTicketID(org.apache.axis.types.PositiveInteger ticketID) {
        this.ticketID = ticketID;
    }


    /**
     * Gets the ticketNumber value for this OTRS_TicketUpdateResponse.
     * 
     * @return ticketNumber
     */
    public java.lang.String getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this OTRS_TicketUpdateResponse.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the articleID value for this OTRS_TicketUpdateResponse.
     * 
     * @return articleID
     */
    public org.apache.axis.types.PositiveInteger getArticleID() {
        return articleID;
    }


    /**
     * Sets the articleID value for this OTRS_TicketUpdateResponse.
     * 
     * @param articleID
     */
    public void setArticleID(org.apache.axis.types.PositiveInteger articleID) {
        this.articleID = articleID;
    }


    /**
     * Gets the error value for this OTRS_TicketUpdateResponse.
     * 
     * @return error
     */
    public routines.OTRS_Error getError() {
        return error;
    }


    /**
     * Sets the error value for this OTRS_TicketUpdateResponse.
     * 
     * @param error
     */
    public void setError(routines.OTRS_Error error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTRS_TicketUpdateResponse)) return false;
        OTRS_TicketUpdateResponse other = (OTRS_TicketUpdateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ticketID==null && other.getTicketID()==null) || 
             (this.ticketID!=null &&
              this.ticketID.equals(other.getTicketID()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.articleID==null && other.getArticleID()==null) || 
             (this.articleID!=null &&
              this.articleID.equals(other.getArticleID()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
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
        if (getTicketID() != null) {
            _hashCode += getTicketID().hashCode();
        }
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getArticleID() != null) {
            _hashCode += getArticleID().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTRS_TicketUpdateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketUpdateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_Error"));
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
