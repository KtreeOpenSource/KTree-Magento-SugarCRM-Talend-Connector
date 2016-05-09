/**
 * OTRS_TicketUpdate_Ticket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OTRS_TicketUpdate_Ticket  implements java.io.Serializable {
    private java.lang.String title;

    private org.apache.axis.types.PositiveInteger queueID;

    private java.lang.String queue;

    private org.apache.axis.types.PositiveInteger typeID;

    private java.lang.String type;

    private org.apache.axis.types.PositiveInteger serviceID;

    private java.lang.String service;

    private org.apache.axis.types.PositiveInteger SLAID;

    private java.lang.String SLA;

    private org.apache.axis.types.PositiveInteger stateID;

    private java.lang.String state;

    private org.apache.axis.types.PositiveInteger priorityID;

    private java.lang.String priority;

    private org.apache.axis.types.PositiveInteger ownerID;

    private java.lang.String owner;

    private org.apache.axis.types.PositiveInteger responsibleID;

    private java.lang.String responsible;

    private java.lang.String customerUser;

    private routines.OTRS_PendingTime pendingTime;

    public OTRS_TicketUpdate_Ticket() {
    }

    public OTRS_TicketUpdate_Ticket(
           java.lang.String title,
           org.apache.axis.types.PositiveInteger queueID,
           java.lang.String queue,
           org.apache.axis.types.PositiveInteger typeID,
           java.lang.String type,
           org.apache.axis.types.PositiveInteger serviceID,
           java.lang.String service,
           org.apache.axis.types.PositiveInteger SLAID,
           java.lang.String SLA,
           org.apache.axis.types.PositiveInteger stateID,
           java.lang.String state,
           org.apache.axis.types.PositiveInteger priorityID,
           java.lang.String priority,
           org.apache.axis.types.PositiveInteger ownerID,
           java.lang.String owner,
           org.apache.axis.types.PositiveInteger responsibleID,
           java.lang.String responsible,
           java.lang.String customerUser,
           routines.OTRS_PendingTime pendingTime) {
           this.title = title;
           this.queueID = queueID;
           this.queue = queue;
           this.typeID = typeID;
           this.type = type;
           this.serviceID = serviceID;
           this.service = service;
           this.SLAID = SLAID;
           this.SLA = SLA;
           this.stateID = stateID;
           this.state = state;
           this.priorityID = priorityID;
           this.priority = priority;
           this.ownerID = ownerID;
           this.owner = owner;
           this.responsibleID = responsibleID;
           this.responsible = responsible;
           this.customerUser = customerUser;
           this.pendingTime = pendingTime;
    }


    /**
     * Gets the title value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the queueID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return queueID
     */
    public org.apache.axis.types.PositiveInteger getQueueID() {
        return queueID;
    }


    /**
     * Sets the queueID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param queueID
     */
    public void setQueueID(org.apache.axis.types.PositiveInteger queueID) {
        this.queueID = queueID;
    }


    /**
     * Gets the queue value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return queue
     */
    public java.lang.String getQueue() {
        return queue;
    }


    /**
     * Sets the queue value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param queue
     */
    public void setQueue(java.lang.String queue) {
        this.queue = queue;
    }


    /**
     * Gets the typeID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return typeID
     */
    public org.apache.axis.types.PositiveInteger getTypeID() {
        return typeID;
    }


    /**
     * Sets the typeID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param typeID
     */
    public void setTypeID(org.apache.axis.types.PositiveInteger typeID) {
        this.typeID = typeID;
    }


    /**
     * Gets the type value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the serviceID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return serviceID
     */
    public org.apache.axis.types.PositiveInteger getServiceID() {
        return serviceID;
    }


    /**
     * Sets the serviceID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param serviceID
     */
    public void setServiceID(org.apache.axis.types.PositiveInteger serviceID) {
        this.serviceID = serviceID;
    }


    /**
     * Gets the service value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the SLAID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return SLAID
     */
    public org.apache.axis.types.PositiveInteger getSLAID() {
        return SLAID;
    }


    /**
     * Sets the SLAID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param SLAID
     */
    public void setSLAID(org.apache.axis.types.PositiveInteger SLAID) {
        this.SLAID = SLAID;
    }


    /**
     * Gets the SLA value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return SLA
     */
    public java.lang.String getSLA() {
        return SLA;
    }


    /**
     * Sets the SLA value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param SLA
     */
    public void setSLA(java.lang.String SLA) {
        this.SLA = SLA;
    }


    /**
     * Gets the stateID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return stateID
     */
    public org.apache.axis.types.PositiveInteger getStateID() {
        return stateID;
    }


    /**
     * Sets the stateID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param stateID
     */
    public void setStateID(org.apache.axis.types.PositiveInteger stateID) {
        this.stateID = stateID;
    }


    /**
     * Gets the state value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the priorityID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return priorityID
     */
    public org.apache.axis.types.PositiveInteger getPriorityID() {
        return priorityID;
    }


    /**
     * Sets the priorityID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param priorityID
     */
    public void setPriorityID(org.apache.axis.types.PositiveInteger priorityID) {
        this.priorityID = priorityID;
    }


    /**
     * Gets the priority value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the ownerID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return ownerID
     */
    public org.apache.axis.types.PositiveInteger getOwnerID() {
        return ownerID;
    }


    /**
     * Sets the ownerID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param ownerID
     */
    public void setOwnerID(org.apache.axis.types.PositiveInteger ownerID) {
        this.ownerID = ownerID;
    }


    /**
     * Gets the owner value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the responsibleID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return responsibleID
     */
    public org.apache.axis.types.PositiveInteger getResponsibleID() {
        return responsibleID;
    }


    /**
     * Sets the responsibleID value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param responsibleID
     */
    public void setResponsibleID(org.apache.axis.types.PositiveInteger responsibleID) {
        this.responsibleID = responsibleID;
    }


    /**
     * Gets the responsible value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return responsible
     */
    public java.lang.String getResponsible() {
        return responsible;
    }


    /**
     * Sets the responsible value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param responsible
     */
    public void setResponsible(java.lang.String responsible) {
        this.responsible = responsible;
    }


    /**
     * Gets the customerUser value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return customerUser
     */
    public java.lang.String getCustomerUser() {
        return customerUser;
    }


    /**
     * Sets the customerUser value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param customerUser
     */
    public void setCustomerUser(java.lang.String customerUser) {
        this.customerUser = customerUser;
    }


    /**
     * Gets the pendingTime value for this OTRS_TicketUpdate_Ticket.
     * 
     * @return pendingTime
     */
    public routines.OTRS_PendingTime getPendingTime() {
        return pendingTime;
    }


    /**
     * Sets the pendingTime value for this OTRS_TicketUpdate_Ticket.
     * 
     * @param pendingTime
     */
    public void setPendingTime(routines.OTRS_PendingTime pendingTime) {
        this.pendingTime = pendingTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTRS_TicketUpdate_Ticket)) return false;
        OTRS_TicketUpdate_Ticket other = (OTRS_TicketUpdate_Ticket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.queueID==null && other.getQueueID()==null) || 
             (this.queueID!=null &&
              this.queueID.equals(other.getQueueID()))) &&
            ((this.queue==null && other.getQueue()==null) || 
             (this.queue!=null &&
              this.queue.equals(other.getQueue()))) &&
            ((this.typeID==null && other.getTypeID()==null) || 
             (this.typeID!=null &&
              this.typeID.equals(other.getTypeID()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.serviceID==null && other.getServiceID()==null) || 
             (this.serviceID!=null &&
              this.serviceID.equals(other.getServiceID()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.SLAID==null && other.getSLAID()==null) || 
             (this.SLAID!=null &&
              this.SLAID.equals(other.getSLAID()))) &&
            ((this.SLA==null && other.getSLA()==null) || 
             (this.SLA!=null &&
              this.SLA.equals(other.getSLA()))) &&
            ((this.stateID==null && other.getStateID()==null) || 
             (this.stateID!=null &&
              this.stateID.equals(other.getStateID()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.priorityID==null && other.getPriorityID()==null) || 
             (this.priorityID!=null &&
              this.priorityID.equals(other.getPriorityID()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.ownerID==null && other.getOwnerID()==null) || 
             (this.ownerID!=null &&
              this.ownerID.equals(other.getOwnerID()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.responsibleID==null && other.getResponsibleID()==null) || 
             (this.responsibleID!=null &&
              this.responsibleID.equals(other.getResponsibleID()))) &&
            ((this.responsible==null && other.getResponsible()==null) || 
             (this.responsible!=null &&
              this.responsible.equals(other.getResponsible()))) &&
            ((this.customerUser==null && other.getCustomerUser()==null) || 
             (this.customerUser!=null &&
              this.customerUser.equals(other.getCustomerUser()))) &&
            ((this.pendingTime==null && other.getPendingTime()==null) || 
             (this.pendingTime!=null &&
              this.pendingTime.equals(other.getPendingTime())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getQueueID() != null) {
            _hashCode += getQueueID().hashCode();
        }
        if (getQueue() != null) {
            _hashCode += getQueue().hashCode();
        }
        if (getTypeID() != null) {
            _hashCode += getTypeID().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getServiceID() != null) {
            _hashCode += getServiceID().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getSLAID() != null) {
            _hashCode += getSLAID().hashCode();
        }
        if (getSLA() != null) {
            _hashCode += getSLA().hashCode();
        }
        if (getStateID() != null) {
            _hashCode += getStateID().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getPriorityID() != null) {
            _hashCode += getPriorityID().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getOwnerID() != null) {
            _hashCode += getOwnerID().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getResponsibleID() != null) {
            _hashCode += getResponsibleID().hashCode();
        }
        if (getResponsible() != null) {
            _hashCode += getResponsible().hashCode();
        }
        if (getCustomerUser() != null) {
            _hashCode += getCustomerUser().hashCode();
        }
        if (getPendingTime() != null) {
            _hashCode += getPendingTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OTRS_TicketUpdate_Ticket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketUpdate_Ticket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueueID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Queue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLAID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLAID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriorityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OwnerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponsibleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Responsible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PendingTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_PendingTime"));
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
