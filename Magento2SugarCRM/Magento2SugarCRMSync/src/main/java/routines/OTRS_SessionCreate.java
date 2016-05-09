/**
 * OTRS_SessionCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OTRS_SessionCreate  implements java.io.Serializable {
    private java.lang.String userLogin;

    private java.lang.String customerUserLogin;

    private java.lang.String password;

    public OTRS_SessionCreate() {
    }

    public OTRS_SessionCreate(
           java.lang.String userLogin,
           java.lang.String customerUserLogin,
           java.lang.String password) {
           this.userLogin = userLogin;
           this.customerUserLogin = customerUserLogin;
           this.password = password;
    }


    /**
     * Gets the userLogin value for this OTRS_SessionCreate.
     * 
     * @return userLogin
     */
    public java.lang.String getUserLogin() {
        return userLogin;
    }


    /**
     * Sets the userLogin value for this OTRS_SessionCreate.
     * 
     * @param userLogin
     */
    public void setUserLogin(java.lang.String userLogin) {
        this.userLogin = userLogin;
    }


    /**
     * Gets the customerUserLogin value for this OTRS_SessionCreate.
     * 
     * @return customerUserLogin
     */
    public java.lang.String getCustomerUserLogin() {
        return customerUserLogin;
    }


    /**
     * Sets the customerUserLogin value for this OTRS_SessionCreate.
     * 
     * @param customerUserLogin
     */
    public void setCustomerUserLogin(java.lang.String customerUserLogin) {
        this.customerUserLogin = customerUserLogin;
    }


    /**
     * Gets the password value for this OTRS_SessionCreate.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this OTRS_SessionCreate.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTRS_SessionCreate)) return false;
        OTRS_SessionCreate other = (OTRS_SessionCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userLogin==null && other.getUserLogin()==null) || 
             (this.userLogin!=null &&
              this.userLogin.equals(other.getUserLogin()))) &&
            ((this.customerUserLogin==null && other.getCustomerUserLogin()==null) || 
             (this.customerUserLogin!=null &&
              this.customerUserLogin.equals(other.getCustomerUserLogin()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getUserLogin() != null) {
            _hashCode += getUserLogin().hashCode();
        }
        if (getCustomerUserLogin() != null) {
            _hashCode += getCustomerUserLogin().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTRS_SessionCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_SessionCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerUserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
