/**
 * OTRS_TicketCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OTRS_TicketCreate  implements java.io.Serializable {
    private java.lang.String userLogin;

    private java.lang.String customerUserLogin;

    private java.lang.String sessionID;

    private java.lang.String password;

    private routines.OTRS_TicketCreate_Ticket ticket;

    private routines.OTRS_Article article;

    private routines.OTRS_DynamicField[] dynamicField;

    private routines.OTRS_Attachment[] attachment;

    public OTRS_TicketCreate() {
    }

    public OTRS_TicketCreate(
           java.lang.String userLogin,
           java.lang.String customerUserLogin,
           java.lang.String sessionID,
           java.lang.String password,
           routines.OTRS_TicketCreate_Ticket ticket,
           routines.OTRS_Article article,
           routines.OTRS_DynamicField[] dynamicField,
           routines.OTRS_Attachment[] attachment) {
           this.userLogin = userLogin;
           this.customerUserLogin = customerUserLogin;
           this.sessionID = sessionID;
           this.password = password;
           this.ticket = ticket;
           this.article = article;
           this.dynamicField = dynamicField;
           this.attachment = attachment;
    }


    /**
     * Gets the userLogin value for this OTRS_TicketCreate.
     * 
     * @return userLogin
     */
    public java.lang.String getUserLogin() {
        return userLogin;
    }


    /**
     * Sets the userLogin value for this OTRS_TicketCreate.
     * 
     * @param userLogin
     */
    public void setUserLogin(java.lang.String userLogin) {
        this.userLogin = userLogin;
    }


    /**
     * Gets the customerUserLogin value for this OTRS_TicketCreate.
     * 
     * @return customerUserLogin
     */
    public java.lang.String getCustomerUserLogin() {
        return customerUserLogin;
    }


    /**
     * Sets the customerUserLogin value for this OTRS_TicketCreate.
     * 
     * @param customerUserLogin
     */
    public void setCustomerUserLogin(java.lang.String customerUserLogin) {
        this.customerUserLogin = customerUserLogin;
    }


    /**
     * Gets the sessionID value for this OTRS_TicketCreate.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this OTRS_TicketCreate.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the password value for this OTRS_TicketCreate.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this OTRS_TicketCreate.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the ticket value for this OTRS_TicketCreate.
     * 
     * @return ticket
     */
    public routines.OTRS_TicketCreate_Ticket getTicket() {
        return ticket;
    }


    /**
     * Sets the ticket value for this OTRS_TicketCreate.
     * 
     * @param ticket
     */
    public void setTicket(routines.OTRS_TicketCreate_Ticket ticket) {
        this.ticket = ticket;
    }


    /**
     * Gets the article value for this OTRS_TicketCreate.
     * 
     * @return article
     */
    public routines.OTRS_Article getArticle() {
        return article;
    }


    /**
     * Sets the article value for this OTRS_TicketCreate.
     * 
     * @param article
     */
    public void setArticle(routines.OTRS_Article article) {
        this.article = article;
    }


    /**
     * Gets the dynamicField value for this OTRS_TicketCreate.
     * 
     * @return dynamicField
     */
    public routines.OTRS_DynamicField[] getDynamicField() {
        return dynamicField;
    }


    /**
     * Sets the dynamicField value for this OTRS_TicketCreate.
     * 
     * @param dynamicField
     */
    public void setDynamicField(routines.OTRS_DynamicField[] dynamicField) {
        this.dynamicField = dynamicField;
    }

    public routines.OTRS_DynamicField getDynamicField(int i) {
        return this.dynamicField[i];
    }

    public void setDynamicField(int i, routines.OTRS_DynamicField _value) {
        this.dynamicField[i] = _value;
    }


    /**
     * Gets the attachment value for this OTRS_TicketCreate.
     * 
     * @return attachment
     */
    public routines.OTRS_Attachment[] getAttachment() {
        return attachment;
    }


    /**
     * Sets the attachment value for this OTRS_TicketCreate.
     * 
     * @param attachment
     */
    public void setAttachment(routines.OTRS_Attachment[] attachment) {
        this.attachment = attachment;
    }

    public routines.OTRS_Attachment getAttachment(int i) {
        return this.attachment[i];
    }

    public void setAttachment(int i, routines.OTRS_Attachment _value) {
        this.attachment[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTRS_TicketCreate)) return false;
        OTRS_TicketCreate other = (OTRS_TicketCreate) obj;
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
            ((this.sessionID==null && other.getSessionID()==null) || 
             (this.sessionID!=null &&
              this.sessionID.equals(other.getSessionID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.ticket==null && other.getTicket()==null) || 
             (this.ticket!=null &&
              this.ticket.equals(other.getTicket()))) &&
            ((this.article==null && other.getArticle()==null) || 
             (this.article!=null &&
              this.article.equals(other.getArticle()))) &&
            ((this.dynamicField==null && other.getDynamicField()==null) || 
             (this.dynamicField!=null &&
              java.util.Arrays.equals(this.dynamicField, other.getDynamicField()))) &&
            ((this.attachment==null && other.getAttachment()==null) || 
             (this.attachment!=null &&
              java.util.Arrays.equals(this.attachment, other.getAttachment())));
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
        if (getSessionID() != null) {
            _hashCode += getSessionID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTicket() != null) {
            _hashCode += getTicket().hashCode();
        }
        if (getArticle() != null) {
            _hashCode += getArticle().hashCode();
        }
        if (getDynamicField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttachment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttachment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttachment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTRS_TicketCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketCreate"));
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
        elemField.setFieldName("sessionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SessionID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketCreate_Ticket"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("article");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Article"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_Article"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicField");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DynamicField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_DynamicField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Attachment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_Attachment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
