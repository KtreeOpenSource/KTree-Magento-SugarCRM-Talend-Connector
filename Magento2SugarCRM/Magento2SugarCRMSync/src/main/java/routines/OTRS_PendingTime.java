/**
 * OTRS_PendingTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OTRS_PendingTime  implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger year;

    private org.apache.axis.types.PositiveInteger month;

    private org.apache.axis.types.PositiveInteger day;

    private org.apache.axis.types.PositiveInteger hour;

    private org.apache.axis.types.PositiveInteger minute;

    public OTRS_PendingTime() {
    }

    public OTRS_PendingTime(
           org.apache.axis.types.PositiveInteger year,
           org.apache.axis.types.PositiveInteger month,
           org.apache.axis.types.PositiveInteger day,
           org.apache.axis.types.PositiveInteger hour,
           org.apache.axis.types.PositiveInteger minute) {
           this.year = year;
           this.month = month;
           this.day = day;
           this.hour = hour;
           this.minute = minute;
    }


    /**
     * Gets the year value for this OTRS_PendingTime.
     * 
     * @return year
     */
    public org.apache.axis.types.PositiveInteger getYear() {
        return year;
    }


    /**
     * Sets the year value for this OTRS_PendingTime.
     * 
     * @param year
     */
    public void setYear(org.apache.axis.types.PositiveInteger year) {
        this.year = year;
    }


    /**
     * Gets the month value for this OTRS_PendingTime.
     * 
     * @return month
     */
    public org.apache.axis.types.PositiveInteger getMonth() {
        return month;
    }


    /**
     * Sets the month value for this OTRS_PendingTime.
     * 
     * @param month
     */
    public void setMonth(org.apache.axis.types.PositiveInteger month) {
        this.month = month;
    }


    /**
     * Gets the day value for this OTRS_PendingTime.
     * 
     * @return day
     */
    public org.apache.axis.types.PositiveInteger getDay() {
        return day;
    }


    /**
     * Sets the day value for this OTRS_PendingTime.
     * 
     * @param day
     */
    public void setDay(org.apache.axis.types.PositiveInteger day) {
        this.day = day;
    }


    /**
     * Gets the hour value for this OTRS_PendingTime.
     * 
     * @return hour
     */
    public org.apache.axis.types.PositiveInteger getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this OTRS_PendingTime.
     * 
     * @param hour
     */
    public void setHour(org.apache.axis.types.PositiveInteger hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this OTRS_PendingTime.
     * 
     * @return minute
     */
    public org.apache.axis.types.PositiveInteger getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this OTRS_PendingTime.
     * 
     * @param minute
     */
    public void setMinute(org.apache.axis.types.PositiveInteger minute) {
        this.minute = minute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTRS_PendingTime)) return false;
        OTRS_PendingTime other = (OTRS_PendingTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear()))) &&
            ((this.month==null && other.getMonth()==null) || 
             (this.month!=null &&
              this.month.equals(other.getMonth()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute())));
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
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        if (getMonth() != null) {
            _hashCode += getMonth().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTRS_PendingTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_PendingTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
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
