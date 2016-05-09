/**
 * OTRS_TicketSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class OTRS_TicketSearch  implements java.io.Serializable {
    private java.lang.String userLogin;

    private java.lang.String customerUserLogin;

    private java.lang.String sessionID;

    private java.lang.String password;

    private org.apache.axis.types.PositiveInteger limit;

    private java.lang.String[] ticketNumber;

    private java.lang.String[] title;

    private java.lang.String[] queues;

    private org.apache.axis.types.PositiveInteger[] queueIDs;

    private org.apache.axis.types.PositiveInteger useSubQueues;

    private java.lang.String[] types;

    private org.apache.axis.types.PositiveInteger[] typeIDs;

    private java.lang.String[] states;

    private org.apache.axis.types.PositiveInteger[] stateIDs;

    private java.lang.String[] stateType;

    private org.apache.axis.types.PositiveInteger[] stateTypeIDs;

    private java.lang.String[] priorities;

    private org.apache.axis.types.PositiveInteger[] priorityIDs;

    private java.lang.String[] services;

    private org.apache.axis.types.PositiveInteger[] serviceIDs;

    private java.lang.String[] SLAs;

    private org.apache.axis.types.PositiveInteger[] SLAIDs;

    private java.lang.String[] locks;

    private org.apache.axis.types.PositiveInteger[] lockIDs;

    private org.apache.axis.types.PositiveInteger[] ownerIDs;

    private org.apache.axis.types.PositiveInteger[] responsibleIDs;

    private org.apache.axis.types.PositiveInteger[] watchUserIDs;

    private java.lang.String[] customerID;

    private java.lang.String[] customerUserLogin2;

    private org.apache.axis.types.PositiveInteger[] createdUserIDs;

    private java.lang.String[] createdTypes;

    private org.apache.axis.types.PositiveInteger[] createdTypeIDs;

    private java.lang.String[] createdPriorities;

    private org.apache.axis.types.PositiveInteger[] createdPriorityIDs;

    private java.lang.String[] createdStates;

    private org.apache.axis.types.PositiveInteger[] createdStateIDs;

    private org.apache.axis.types.PositiveInteger[] createdQueues;

    private org.apache.axis.types.PositiveInteger[] createdQueueIDs;

    private routines.OTRS_TicketSeach_DynamicField[] dynamicFields;

    private routines.OTRS_TicketSearch_TicketFlag ticketflag;

    private java.lang.String from;

    private java.lang.String to;

    private java.lang.String cc;

    private java.lang.String subject;

    private java.lang.String body;

    private org.apache.axis.types.PositiveInteger fullTextIndex;

    private java.lang.String contentSearch;

    private org.apache.axis.types.PositiveInteger conditionInline;

    private org.apache.axis.types.PositiveInteger articleCreateTimeOlderMinutes;

    private org.apache.axis.types.PositiveInteger articleCreateTimeNewerMinutes;

    private java.util.Calendar articleCreateTimeNewerDate;

    private java.util.Calendar articleCreateTimeOlderDate;

    private org.apache.axis.types.PositiveInteger ticketCreateTimeOlderMinutes;

    private org.apache.axis.types.PositiveInteger ATicketCreateTimeNewerMinutes;

    private java.util.Calendar ticketCreateTimeNewerDate;

    private java.util.Calendar ticketCreateTimeOlderDate;

    private org.apache.axis.types.PositiveInteger ticketChangeTimeOlderMinutes;

    private org.apache.axis.types.PositiveInteger ticketChangeTimeNewerMinutes;

    private java.util.Calendar ticketChangeTimeNewerDate;

    private java.util.Calendar ticketChangeTimeOlderDate;

    private org.apache.axis.types.PositiveInteger ticketCloseTimeOlderMinutes;

    private org.apache.axis.types.PositiveInteger ticketCloseTimeNewerMinutes;

    private java.util.Calendar ticketCloseTimeNewerDate;

    private java.util.Calendar ticketCloseTimeOlderDate;

    private org.apache.axis.types.PositiveInteger ticketPendingTimeOlderMinutes;

    private org.apache.axis.types.PositiveInteger ticketPendingTimeNewerMinutes;

    private java.util.Calendar ticketPendingTimeNewerDate;

    private java.util.Calendar ticketPendingTimeOlderDate;

    private org.apache.axis.types.PositiveInteger ticketEscalationTimeOlderMinutes;

    private org.apache.axis.types.PositiveInteger TTicketEscalationTimeNewerMinutes;

    private java.util.Calendar ticketEscalationTimeNewerDate;

    private java.util.Calendar ticketEscalationTimeOlderDate;

    private java.lang.String archiveFlags;

    private java.lang.String[] orderBy;

    private org.apache.axis.types.PositiveInteger[] sortBy;

    private java.lang.String[] customerUserID;

    public OTRS_TicketSearch() {
    }

    public OTRS_TicketSearch(
           java.lang.String userLogin,
           java.lang.String customerUserLogin,
           java.lang.String sessionID,
           java.lang.String password,
           org.apache.axis.types.PositiveInteger limit,
           java.lang.String[] ticketNumber,
           java.lang.String[] title,
           java.lang.String[] queues,
           org.apache.axis.types.PositiveInteger[] queueIDs,
           org.apache.axis.types.PositiveInteger useSubQueues,
           java.lang.String[] types,
           org.apache.axis.types.PositiveInteger[] typeIDs,
           java.lang.String[] states,
           org.apache.axis.types.PositiveInteger[] stateIDs,
           java.lang.String[] stateType,
           org.apache.axis.types.PositiveInteger[] stateTypeIDs,
           java.lang.String[] priorities,
           org.apache.axis.types.PositiveInteger[] priorityIDs,
           java.lang.String[] services,
           org.apache.axis.types.PositiveInteger[] serviceIDs,
           java.lang.String[] SLAs,
           org.apache.axis.types.PositiveInteger[] SLAIDs,
           java.lang.String[] locks,
           org.apache.axis.types.PositiveInteger[] lockIDs,
           org.apache.axis.types.PositiveInteger[] ownerIDs,
           org.apache.axis.types.PositiveInteger[] responsibleIDs,
           org.apache.axis.types.PositiveInteger[] watchUserIDs,
           java.lang.String[] customerID,
           java.lang.String[] customerUserLogin2,
           org.apache.axis.types.PositiveInteger[] createdUserIDs,
           java.lang.String[] createdTypes,
           org.apache.axis.types.PositiveInteger[] createdTypeIDs,
           java.lang.String[] createdPriorities,
           org.apache.axis.types.PositiveInteger[] createdPriorityIDs,
           java.lang.String[] createdStates,
           org.apache.axis.types.PositiveInteger[] createdStateIDs,
           org.apache.axis.types.PositiveInteger[] createdQueues,
           org.apache.axis.types.PositiveInteger[] createdQueueIDs,
           routines.OTRS_TicketSeach_DynamicField[] dynamicFields,
           routines.OTRS_TicketSearch_TicketFlag ticketflag,
           java.lang.String from,
           java.lang.String to,
           java.lang.String cc,
           java.lang.String subject,
           java.lang.String body,
           org.apache.axis.types.PositiveInteger fullTextIndex,
           java.lang.String contentSearch,
           org.apache.axis.types.PositiveInteger conditionInline,
           org.apache.axis.types.PositiveInteger articleCreateTimeOlderMinutes,
           org.apache.axis.types.PositiveInteger articleCreateTimeNewerMinutes,
           java.util.Calendar articleCreateTimeNewerDate,
           java.util.Calendar articleCreateTimeOlderDate,
           org.apache.axis.types.PositiveInteger ticketCreateTimeOlderMinutes,
           org.apache.axis.types.PositiveInteger ATicketCreateTimeNewerMinutes,
           java.util.Calendar ticketCreateTimeNewerDate,
           java.util.Calendar ticketCreateTimeOlderDate,
           org.apache.axis.types.PositiveInteger ticketChangeTimeOlderMinutes,
           org.apache.axis.types.PositiveInteger ticketChangeTimeNewerMinutes,
           java.util.Calendar ticketChangeTimeNewerDate,
           java.util.Calendar ticketChangeTimeOlderDate,
           org.apache.axis.types.PositiveInteger ticketCloseTimeOlderMinutes,
           org.apache.axis.types.PositiveInteger ticketCloseTimeNewerMinutes,
           java.util.Calendar ticketCloseTimeNewerDate,
           java.util.Calendar ticketCloseTimeOlderDate,
           org.apache.axis.types.PositiveInteger ticketPendingTimeOlderMinutes,
           org.apache.axis.types.PositiveInteger ticketPendingTimeNewerMinutes,
           java.util.Calendar ticketPendingTimeNewerDate,
           java.util.Calendar ticketPendingTimeOlderDate,
           org.apache.axis.types.PositiveInteger ticketEscalationTimeOlderMinutes,
           org.apache.axis.types.PositiveInteger TTicketEscalationTimeNewerMinutes,
           java.util.Calendar ticketEscalationTimeNewerDate,
           java.util.Calendar ticketEscalationTimeOlderDate,
           java.lang.String archiveFlags,
           java.lang.String[] orderBy,
           org.apache.axis.types.PositiveInteger[] sortBy,
           java.lang.String[] customerUserID) {
           this.userLogin = userLogin;
           this.customerUserLogin = customerUserLogin;
           this.sessionID = sessionID;
           this.password = password;
           this.limit = limit;
           this.ticketNumber = ticketNumber;
           this.title = title;
           this.queues = queues;
           this.queueIDs = queueIDs;
           this.useSubQueues = useSubQueues;
           this.types = types;
           this.typeIDs = typeIDs;
           this.states = states;
           this.stateIDs = stateIDs;
           this.stateType = stateType;
           this.stateTypeIDs = stateTypeIDs;
           this.priorities = priorities;
           this.priorityIDs = priorityIDs;
           this.services = services;
           this.serviceIDs = serviceIDs;
           this.SLAs = SLAs;
           this.SLAIDs = SLAIDs;
           this.locks = locks;
           this.lockIDs = lockIDs;
           this.ownerIDs = ownerIDs;
           this.responsibleIDs = responsibleIDs;
           this.watchUserIDs = watchUserIDs;
           this.customerID = customerID;
           this.customerUserLogin2 = customerUserLogin2;
           this.createdUserIDs = createdUserIDs;
           this.createdTypes = createdTypes;
           this.createdTypeIDs = createdTypeIDs;
           this.createdPriorities = createdPriorities;
           this.createdPriorityIDs = createdPriorityIDs;
           this.createdStates = createdStates;
           this.createdStateIDs = createdStateIDs;
           this.createdQueues = createdQueues;
           this.createdQueueIDs = createdQueueIDs;
           this.dynamicFields = dynamicFields;
           this.ticketflag = ticketflag;
           this.from = from;
           this.to = to;
           this.cc = cc;
           this.subject = subject;
           this.body = body;
           this.fullTextIndex = fullTextIndex;
           this.contentSearch = contentSearch;
           this.conditionInline = conditionInline;
           this.articleCreateTimeOlderMinutes = articleCreateTimeOlderMinutes;
           this.articleCreateTimeNewerMinutes = articleCreateTimeNewerMinutes;
           this.articleCreateTimeNewerDate = articleCreateTimeNewerDate;
           this.articleCreateTimeOlderDate = articleCreateTimeOlderDate;
           this.ticketCreateTimeOlderMinutes = ticketCreateTimeOlderMinutes;
           this.ATicketCreateTimeNewerMinutes = ATicketCreateTimeNewerMinutes;
           this.ticketCreateTimeNewerDate = ticketCreateTimeNewerDate;
           this.ticketCreateTimeOlderDate = ticketCreateTimeOlderDate;
           this.ticketChangeTimeOlderMinutes = ticketChangeTimeOlderMinutes;
           this.ticketChangeTimeNewerMinutes = ticketChangeTimeNewerMinutes;
           this.ticketChangeTimeNewerDate = ticketChangeTimeNewerDate;
           this.ticketChangeTimeOlderDate = ticketChangeTimeOlderDate;
           this.ticketCloseTimeOlderMinutes = ticketCloseTimeOlderMinutes;
           this.ticketCloseTimeNewerMinutes = ticketCloseTimeNewerMinutes;
           this.ticketCloseTimeNewerDate = ticketCloseTimeNewerDate;
           this.ticketCloseTimeOlderDate = ticketCloseTimeOlderDate;
           this.ticketPendingTimeOlderMinutes = ticketPendingTimeOlderMinutes;
           this.ticketPendingTimeNewerMinutes = ticketPendingTimeNewerMinutes;
           this.ticketPendingTimeNewerDate = ticketPendingTimeNewerDate;
           this.ticketPendingTimeOlderDate = ticketPendingTimeOlderDate;
           this.ticketEscalationTimeOlderMinutes = ticketEscalationTimeOlderMinutes;
           this.TTicketEscalationTimeNewerMinutes = TTicketEscalationTimeNewerMinutes;
           this.ticketEscalationTimeNewerDate = ticketEscalationTimeNewerDate;
           this.ticketEscalationTimeOlderDate = ticketEscalationTimeOlderDate;
           this.archiveFlags = archiveFlags;
           this.orderBy = orderBy;
           this.sortBy = sortBy;
           this.customerUserID = customerUserID;
    }


    /**
     * Gets the userLogin value for this OTRS_TicketSearch.
     * 
     * @return userLogin
     */
    public java.lang.String getUserLogin() {
        return userLogin;
    }


    /**
     * Sets the userLogin value for this OTRS_TicketSearch.
     * 
     * @param userLogin
     */
    public void setUserLogin(java.lang.String userLogin) {
        this.userLogin = userLogin;
    }


    /**
     * Gets the customerUserLogin value for this OTRS_TicketSearch.
     * 
     * @return customerUserLogin
     */
    public java.lang.String getCustomerUserLogin() {
        return customerUserLogin;
    }


    /**
     * Sets the customerUserLogin value for this OTRS_TicketSearch.
     * 
     * @param customerUserLogin
     */
    public void setCustomerUserLogin(java.lang.String customerUserLogin) {
        this.customerUserLogin = customerUserLogin;
    }


    /**
     * Gets the sessionID value for this OTRS_TicketSearch.
     * 
     * @return sessionID
     */
    public java.lang.String getSessionID() {
        return sessionID;
    }


    /**
     * Sets the sessionID value for this OTRS_TicketSearch.
     * 
     * @param sessionID
     */
    public void setSessionID(java.lang.String sessionID) {
        this.sessionID = sessionID;
    }


    /**
     * Gets the password value for this OTRS_TicketSearch.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this OTRS_TicketSearch.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the limit value for this OTRS_TicketSearch.
     * 
     * @return limit
     */
    public org.apache.axis.types.PositiveInteger getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this OTRS_TicketSearch.
     * 
     * @param limit
     */
    public void setLimit(org.apache.axis.types.PositiveInteger limit) {
        this.limit = limit;
    }


    /**
     * Gets the ticketNumber value for this OTRS_TicketSearch.
     * 
     * @return ticketNumber
     */
    public java.lang.String[] getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this OTRS_TicketSearch.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.String[] ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public java.lang.String getTicketNumber(int i) {
        return this.ticketNumber[i];
    }

    public void setTicketNumber(int i, java.lang.String _value) {
        this.ticketNumber[i] = _value;
    }


    /**
     * Gets the title value for this OTRS_TicketSearch.
     * 
     * @return title
     */
    public java.lang.String[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OTRS_TicketSearch.
     * 
     * @param title
     */
    public void setTitle(java.lang.String[] title) {
        this.title = title;
    }

    public java.lang.String getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, java.lang.String _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the queues value for this OTRS_TicketSearch.
     * 
     * @return queues
     */
    public java.lang.String[] getQueues() {
        return queues;
    }


    /**
     * Sets the queues value for this OTRS_TicketSearch.
     * 
     * @param queues
     */
    public void setQueues(java.lang.String[] queues) {
        this.queues = queues;
    }

    public java.lang.String getQueues(int i) {
        return this.queues[i];
    }

    public void setQueues(int i, java.lang.String _value) {
        this.queues[i] = _value;
    }


    /**
     * Gets the queueIDs value for this OTRS_TicketSearch.
     * 
     * @return queueIDs
     */
    public org.apache.axis.types.PositiveInteger[] getQueueIDs() {
        return queueIDs;
    }


    /**
     * Sets the queueIDs value for this OTRS_TicketSearch.
     * 
     * @param queueIDs
     */
    public void setQueueIDs(org.apache.axis.types.PositiveInteger[] queueIDs) {
        this.queueIDs = queueIDs;
    }

    public org.apache.axis.types.PositiveInteger getQueueIDs(int i) {
        return this.queueIDs[i];
    }

    public void setQueueIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.queueIDs[i] = _value;
    }


    /**
     * Gets the useSubQueues value for this OTRS_TicketSearch.
     * 
     * @return useSubQueues
     */
    public org.apache.axis.types.PositiveInteger getUseSubQueues() {
        return useSubQueues;
    }


    /**
     * Sets the useSubQueues value for this OTRS_TicketSearch.
     * 
     * @param useSubQueues
     */
    public void setUseSubQueues(org.apache.axis.types.PositiveInteger useSubQueues) {
        this.useSubQueues = useSubQueues;
    }


    /**
     * Gets the types value for this OTRS_TicketSearch.
     * 
     * @return types
     */
    public java.lang.String[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this OTRS_TicketSearch.
     * 
     * @param types
     */
    public void setTypes(java.lang.String[] types) {
        this.types = types;
    }

    public java.lang.String getTypes(int i) {
        return this.types[i];
    }

    public void setTypes(int i, java.lang.String _value) {
        this.types[i] = _value;
    }


    /**
     * Gets the typeIDs value for this OTRS_TicketSearch.
     * 
     * @return typeIDs
     */
    public org.apache.axis.types.PositiveInteger[] getTypeIDs() {
        return typeIDs;
    }


    /**
     * Sets the typeIDs value for this OTRS_TicketSearch.
     * 
     * @param typeIDs
     */
    public void setTypeIDs(org.apache.axis.types.PositiveInteger[] typeIDs) {
        this.typeIDs = typeIDs;
    }

    public org.apache.axis.types.PositiveInteger getTypeIDs(int i) {
        return this.typeIDs[i];
    }

    public void setTypeIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.typeIDs[i] = _value;
    }


    /**
     * Gets the states value for this OTRS_TicketSearch.
     * 
     * @return states
     */
    public java.lang.String[] getStates() {
        return states;
    }


    /**
     * Sets the states value for this OTRS_TicketSearch.
     * 
     * @param states
     */
    public void setStates(java.lang.String[] states) {
        this.states = states;
    }

    public java.lang.String getStates(int i) {
        return this.states[i];
    }

    public void setStates(int i, java.lang.String _value) {
        this.states[i] = _value;
    }


    /**
     * Gets the stateIDs value for this OTRS_TicketSearch.
     * 
     * @return stateIDs
     */
    public org.apache.axis.types.PositiveInteger[] getStateIDs() {
        return stateIDs;
    }


    /**
     * Sets the stateIDs value for this OTRS_TicketSearch.
     * 
     * @param stateIDs
     */
    public void setStateIDs(org.apache.axis.types.PositiveInteger[] stateIDs) {
        this.stateIDs = stateIDs;
    }

    public org.apache.axis.types.PositiveInteger getStateIDs(int i) {
        return this.stateIDs[i];
    }

    public void setStateIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.stateIDs[i] = _value;
    }


    /**
     * Gets the stateType value for this OTRS_TicketSearch.
     * 
     * @return stateType
     */
    public java.lang.String[] getStateType() {
        return stateType;
    }


    /**
     * Sets the stateType value for this OTRS_TicketSearch.
     * 
     * @param stateType
     */
    public void setStateType(java.lang.String[] stateType) {
        this.stateType = stateType;
    }

    public java.lang.String getStateType(int i) {
        return this.stateType[i];
    }

    public void setStateType(int i, java.lang.String _value) {
        this.stateType[i] = _value;
    }


    /**
     * Gets the stateTypeIDs value for this OTRS_TicketSearch.
     * 
     * @return stateTypeIDs
     */
    public org.apache.axis.types.PositiveInteger[] getStateTypeIDs() {
        return stateTypeIDs;
    }


    /**
     * Sets the stateTypeIDs value for this OTRS_TicketSearch.
     * 
     * @param stateTypeIDs
     */
    public void setStateTypeIDs(org.apache.axis.types.PositiveInteger[] stateTypeIDs) {
        this.stateTypeIDs = stateTypeIDs;
    }

    public org.apache.axis.types.PositiveInteger getStateTypeIDs(int i) {
        return this.stateTypeIDs[i];
    }

    public void setStateTypeIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.stateTypeIDs[i] = _value;
    }


    /**
     * Gets the priorities value for this OTRS_TicketSearch.
     * 
     * @return priorities
     */
    public java.lang.String[] getPriorities() {
        return priorities;
    }


    /**
     * Sets the priorities value for this OTRS_TicketSearch.
     * 
     * @param priorities
     */
    public void setPriorities(java.lang.String[] priorities) {
        this.priorities = priorities;
    }

    public java.lang.String getPriorities(int i) {
        return this.priorities[i];
    }

    public void setPriorities(int i, java.lang.String _value) {
        this.priorities[i] = _value;
    }


    /**
     * Gets the priorityIDs value for this OTRS_TicketSearch.
     * 
     * @return priorityIDs
     */
    public org.apache.axis.types.PositiveInteger[] getPriorityIDs() {
        return priorityIDs;
    }


    /**
     * Sets the priorityIDs value for this OTRS_TicketSearch.
     * 
     * @param priorityIDs
     */
    public void setPriorityIDs(org.apache.axis.types.PositiveInteger[] priorityIDs) {
        this.priorityIDs = priorityIDs;
    }

    public org.apache.axis.types.PositiveInteger getPriorityIDs(int i) {
        return this.priorityIDs[i];
    }

    public void setPriorityIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.priorityIDs[i] = _value;
    }


    /**
     * Gets the services value for this OTRS_TicketSearch.
     * 
     * @return services
     */
    public java.lang.String[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this OTRS_TicketSearch.
     * 
     * @param services
     */
    public void setServices(java.lang.String[] services) {
        this.services = services;
    }

    public java.lang.String getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, java.lang.String _value) {
        this.services[i] = _value;
    }


    /**
     * Gets the serviceIDs value for this OTRS_TicketSearch.
     * 
     * @return serviceIDs
     */
    public org.apache.axis.types.PositiveInteger[] getServiceIDs() {
        return serviceIDs;
    }


    /**
     * Sets the serviceIDs value for this OTRS_TicketSearch.
     * 
     * @param serviceIDs
     */
    public void setServiceIDs(org.apache.axis.types.PositiveInteger[] serviceIDs) {
        this.serviceIDs = serviceIDs;
    }

    public org.apache.axis.types.PositiveInteger getServiceIDs(int i) {
        return this.serviceIDs[i];
    }

    public void setServiceIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.serviceIDs[i] = _value;
    }


    /**
     * Gets the SLAs value for this OTRS_TicketSearch.
     * 
     * @return SLAs
     */
    public java.lang.String[] getSLAs() {
        return SLAs;
    }


    /**
     * Sets the SLAs value for this OTRS_TicketSearch.
     * 
     * @param SLAs
     */
    public void setSLAs(java.lang.String[] SLAs) {
        this.SLAs = SLAs;
    }

    public java.lang.String getSLAs(int i) {
        return this.SLAs[i];
    }

    public void setSLAs(int i, java.lang.String _value) {
        this.SLAs[i] = _value;
    }


    /**
     * Gets the SLAIDs value for this OTRS_TicketSearch.
     * 
     * @return SLAIDs
     */
    public org.apache.axis.types.PositiveInteger[] getSLAIDs() {
        return SLAIDs;
    }


    /**
     * Sets the SLAIDs value for this OTRS_TicketSearch.
     * 
     * @param SLAIDs
     */
    public void setSLAIDs(org.apache.axis.types.PositiveInteger[] SLAIDs) {
        this.SLAIDs = SLAIDs;
    }

    public org.apache.axis.types.PositiveInteger getSLAIDs(int i) {
        return this.SLAIDs[i];
    }

    public void setSLAIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.SLAIDs[i] = _value;
    }


    /**
     * Gets the locks value for this OTRS_TicketSearch.
     * 
     * @return locks
     */
    public java.lang.String[] getLocks() {
        return locks;
    }


    /**
     * Sets the locks value for this OTRS_TicketSearch.
     * 
     * @param locks
     */
    public void setLocks(java.lang.String[] locks) {
        this.locks = locks;
    }

    public java.lang.String getLocks(int i) {
        return this.locks[i];
    }

    public void setLocks(int i, java.lang.String _value) {
        this.locks[i] = _value;
    }


    /**
     * Gets the lockIDs value for this OTRS_TicketSearch.
     * 
     * @return lockIDs
     */
    public org.apache.axis.types.PositiveInteger[] getLockIDs() {
        return lockIDs;
    }


    /**
     * Sets the lockIDs value for this OTRS_TicketSearch.
     * 
     * @param lockIDs
     */
    public void setLockIDs(org.apache.axis.types.PositiveInteger[] lockIDs) {
        this.lockIDs = lockIDs;
    }

    public org.apache.axis.types.PositiveInteger getLockIDs(int i) {
        return this.lockIDs[i];
    }

    public void setLockIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.lockIDs[i] = _value;
    }


    /**
     * Gets the ownerIDs value for this OTRS_TicketSearch.
     * 
     * @return ownerIDs
     */
    public org.apache.axis.types.PositiveInteger[] getOwnerIDs() {
        return ownerIDs;
    }


    /**
     * Sets the ownerIDs value for this OTRS_TicketSearch.
     * 
     * @param ownerIDs
     */
    public void setOwnerIDs(org.apache.axis.types.PositiveInteger[] ownerIDs) {
        this.ownerIDs = ownerIDs;
    }

    public org.apache.axis.types.PositiveInteger getOwnerIDs(int i) {
        return this.ownerIDs[i];
    }

    public void setOwnerIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.ownerIDs[i] = _value;
    }


    /**
     * Gets the responsibleIDs value for this OTRS_TicketSearch.
     * 
     * @return responsibleIDs
     */
    public org.apache.axis.types.PositiveInteger[] getResponsibleIDs() {
        return responsibleIDs;
    }


    /**
     * Sets the responsibleIDs value for this OTRS_TicketSearch.
     * 
     * @param responsibleIDs
     */
    public void setResponsibleIDs(org.apache.axis.types.PositiveInteger[] responsibleIDs) {
        this.responsibleIDs = responsibleIDs;
    }

    public org.apache.axis.types.PositiveInteger getResponsibleIDs(int i) {
        return this.responsibleIDs[i];
    }

    public void setResponsibleIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.responsibleIDs[i] = _value;
    }


    /**
     * Gets the watchUserIDs value for this OTRS_TicketSearch.
     * 
     * @return watchUserIDs
     */
    public org.apache.axis.types.PositiveInteger[] getWatchUserIDs() {
        return watchUserIDs;
    }


    /**
     * Sets the watchUserIDs value for this OTRS_TicketSearch.
     * 
     * @param watchUserIDs
     */
    public void setWatchUserIDs(org.apache.axis.types.PositiveInteger[] watchUserIDs) {
        this.watchUserIDs = watchUserIDs;
    }

    public org.apache.axis.types.PositiveInteger getWatchUserIDs(int i) {
        return this.watchUserIDs[i];
    }

    public void setWatchUserIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.watchUserIDs[i] = _value;
    }


    /**
     * Gets the customerID value for this OTRS_TicketSearch.
     * 
     * @return customerID
     */
    public java.lang.String[] getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this OTRS_TicketSearch.
     * 
     * @param customerID
     */
    public void setCustomerID(java.lang.String[] customerID) {
        this.customerID = customerID;
    }

    public java.lang.String getCustomerID(int i) {
        return this.customerID[i];
    }

    public void setCustomerID(int i, java.lang.String _value) {
        this.customerID[i] = _value;
    }


    /**
     * Gets the customerUserLogin2 value for this OTRS_TicketSearch.
     * 
     * @return customerUserLogin2
     */
    public java.lang.String[] getCustomerUserLogin2() {
        return customerUserLogin2;
    }


    /**
     * Sets the customerUserLogin2 value for this OTRS_TicketSearch.
     * 
     * @param customerUserLogin2
     */
    public void setCustomerUserLogin2(java.lang.String[] customerUserLogin2) {
        this.customerUserLogin2 = customerUserLogin2;
    }

    public java.lang.String getCustomerUserLogin2(int i) {
        return this.customerUserLogin2[i];
    }

    public void setCustomerUserLogin2(int i, java.lang.String _value) {
        this.customerUserLogin2[i] = _value;
    }


    /**
     * Gets the createdUserIDs value for this OTRS_TicketSearch.
     * 
     * @return createdUserIDs
     */
    public org.apache.axis.types.PositiveInteger[] getCreatedUserIDs() {
        return createdUserIDs;
    }


    /**
     * Sets the createdUserIDs value for this OTRS_TicketSearch.
     * 
     * @param createdUserIDs
     */
    public void setCreatedUserIDs(org.apache.axis.types.PositiveInteger[] createdUserIDs) {
        this.createdUserIDs = createdUserIDs;
    }

    public org.apache.axis.types.PositiveInteger getCreatedUserIDs(int i) {
        return this.createdUserIDs[i];
    }

    public void setCreatedUserIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.createdUserIDs[i] = _value;
    }


    /**
     * Gets the createdTypes value for this OTRS_TicketSearch.
     * 
     * @return createdTypes
     */
    public java.lang.String[] getCreatedTypes() {
        return createdTypes;
    }


    /**
     * Sets the createdTypes value for this OTRS_TicketSearch.
     * 
     * @param createdTypes
     */
    public void setCreatedTypes(java.lang.String[] createdTypes) {
        this.createdTypes = createdTypes;
    }

    public java.lang.String getCreatedTypes(int i) {
        return this.createdTypes[i];
    }

    public void setCreatedTypes(int i, java.lang.String _value) {
        this.createdTypes[i] = _value;
    }


    /**
     * Gets the createdTypeIDs value for this OTRS_TicketSearch.
     * 
     * @return createdTypeIDs
     */
    public org.apache.axis.types.PositiveInteger[] getCreatedTypeIDs() {
        return createdTypeIDs;
    }


    /**
     * Sets the createdTypeIDs value for this OTRS_TicketSearch.
     * 
     * @param createdTypeIDs
     */
    public void setCreatedTypeIDs(org.apache.axis.types.PositiveInteger[] createdTypeIDs) {
        this.createdTypeIDs = createdTypeIDs;
    }

    public org.apache.axis.types.PositiveInteger getCreatedTypeIDs(int i) {
        return this.createdTypeIDs[i];
    }

    public void setCreatedTypeIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.createdTypeIDs[i] = _value;
    }


    /**
     * Gets the createdPriorities value for this OTRS_TicketSearch.
     * 
     * @return createdPriorities
     */
    public java.lang.String[] getCreatedPriorities() {
        return createdPriorities;
    }


    /**
     * Sets the createdPriorities value for this OTRS_TicketSearch.
     * 
     * @param createdPriorities
     */
    public void setCreatedPriorities(java.lang.String[] createdPriorities) {
        this.createdPriorities = createdPriorities;
    }

    public java.lang.String getCreatedPriorities(int i) {
        return this.createdPriorities[i];
    }

    public void setCreatedPriorities(int i, java.lang.String _value) {
        this.createdPriorities[i] = _value;
    }


    /**
     * Gets the createdPriorityIDs value for this OTRS_TicketSearch.
     * 
     * @return createdPriorityIDs
     */
    public org.apache.axis.types.PositiveInteger[] getCreatedPriorityIDs() {
        return createdPriorityIDs;
    }


    /**
     * Sets the createdPriorityIDs value for this OTRS_TicketSearch.
     * 
     * @param createdPriorityIDs
     */
    public void setCreatedPriorityIDs(org.apache.axis.types.PositiveInteger[] createdPriorityIDs) {
        this.createdPriorityIDs = createdPriorityIDs;
    }

    public org.apache.axis.types.PositiveInteger getCreatedPriorityIDs(int i) {
        return this.createdPriorityIDs[i];
    }

    public void setCreatedPriorityIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.createdPriorityIDs[i] = _value;
    }


    /**
     * Gets the createdStates value for this OTRS_TicketSearch.
     * 
     * @return createdStates
     */
    public java.lang.String[] getCreatedStates() {
        return createdStates;
    }


    /**
     * Sets the createdStates value for this OTRS_TicketSearch.
     * 
     * @param createdStates
     */
    public void setCreatedStates(java.lang.String[] createdStates) {
        this.createdStates = createdStates;
    }

    public java.lang.String getCreatedStates(int i) {
        return this.createdStates[i];
    }

    public void setCreatedStates(int i, java.lang.String _value) {
        this.createdStates[i] = _value;
    }


    /**
     * Gets the createdStateIDs value for this OTRS_TicketSearch.
     * 
     * @return createdStateIDs
     */
    public org.apache.axis.types.PositiveInteger[] getCreatedStateIDs() {
        return createdStateIDs;
    }


    /**
     * Sets the createdStateIDs value for this OTRS_TicketSearch.
     * 
     * @param createdStateIDs
     */
    public void setCreatedStateIDs(org.apache.axis.types.PositiveInteger[] createdStateIDs) {
        this.createdStateIDs = createdStateIDs;
    }

    public org.apache.axis.types.PositiveInteger getCreatedStateIDs(int i) {
        return this.createdStateIDs[i];
    }

    public void setCreatedStateIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.createdStateIDs[i] = _value;
    }


    /**
     * Gets the createdQueues value for this OTRS_TicketSearch.
     * 
     * @return createdQueues
     */
    public org.apache.axis.types.PositiveInteger[] getCreatedQueues() {
        return createdQueues;
    }


    /**
     * Sets the createdQueues value for this OTRS_TicketSearch.
     * 
     * @param createdQueues
     */
    public void setCreatedQueues(org.apache.axis.types.PositiveInteger[] createdQueues) {
        this.createdQueues = createdQueues;
    }

    public org.apache.axis.types.PositiveInteger getCreatedQueues(int i) {
        return this.createdQueues[i];
    }

    public void setCreatedQueues(int i, org.apache.axis.types.PositiveInteger _value) {
        this.createdQueues[i] = _value;
    }


    /**
     * Gets the createdQueueIDs value for this OTRS_TicketSearch.
     * 
     * @return createdQueueIDs
     */
    public org.apache.axis.types.PositiveInteger[] getCreatedQueueIDs() {
        return createdQueueIDs;
    }


    /**
     * Sets the createdQueueIDs value for this OTRS_TicketSearch.
     * 
     * @param createdQueueIDs
     */
    public void setCreatedQueueIDs(org.apache.axis.types.PositiveInteger[] createdQueueIDs) {
        this.createdQueueIDs = createdQueueIDs;
    }

    public org.apache.axis.types.PositiveInteger getCreatedQueueIDs(int i) {
        return this.createdQueueIDs[i];
    }

    public void setCreatedQueueIDs(int i, org.apache.axis.types.PositiveInteger _value) {
        this.createdQueueIDs[i] = _value;
    }


    /**
     * Gets the dynamicFields value for this OTRS_TicketSearch.
     * 
     * @return dynamicFields
     */
    public routines.OTRS_TicketSeach_DynamicField[] getDynamicFields() {
        return dynamicFields;
    }


    /**
     * Sets the dynamicFields value for this OTRS_TicketSearch.
     * 
     * @param dynamicFields
     */
    public void setDynamicFields(routines.OTRS_TicketSeach_DynamicField[] dynamicFields) {
        this.dynamicFields = dynamicFields;
    }

    public routines.OTRS_TicketSeach_DynamicField getDynamicFields(int i) {
        return this.dynamicFields[i];
    }

    public void setDynamicFields(int i, routines.OTRS_TicketSeach_DynamicField _value) {
        this.dynamicFields[i] = _value;
    }


    /**
     * Gets the ticketflag value for this OTRS_TicketSearch.
     * 
     * @return ticketflag
     */
    public routines.OTRS_TicketSearch_TicketFlag getTicketflag() {
        return ticketflag;
    }


    /**
     * Sets the ticketflag value for this OTRS_TicketSearch.
     * 
     * @param ticketflag
     */
    public void setTicketflag(routines.OTRS_TicketSearch_TicketFlag ticketflag) {
        this.ticketflag = ticketflag;
    }


    /**
     * Gets the from value for this OTRS_TicketSearch.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this OTRS_TicketSearch.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this OTRS_TicketSearch.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this OTRS_TicketSearch.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the cc value for this OTRS_TicketSearch.
     * 
     * @return cc
     */
    public java.lang.String getCc() {
        return cc;
    }


    /**
     * Sets the cc value for this OTRS_TicketSearch.
     * 
     * @param cc
     */
    public void setCc(java.lang.String cc) {
        this.cc = cc;
    }


    /**
     * Gets the subject value for this OTRS_TicketSearch.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this OTRS_TicketSearch.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the body value for this OTRS_TicketSearch.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this OTRS_TicketSearch.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the fullTextIndex value for this OTRS_TicketSearch.
     * 
     * @return fullTextIndex
     */
    public org.apache.axis.types.PositiveInteger getFullTextIndex() {
        return fullTextIndex;
    }


    /**
     * Sets the fullTextIndex value for this OTRS_TicketSearch.
     * 
     * @param fullTextIndex
     */
    public void setFullTextIndex(org.apache.axis.types.PositiveInteger fullTextIndex) {
        this.fullTextIndex = fullTextIndex;
    }


    /**
     * Gets the contentSearch value for this OTRS_TicketSearch.
     * 
     * @return contentSearch
     */
    public java.lang.String getContentSearch() {
        return contentSearch;
    }


    /**
     * Sets the contentSearch value for this OTRS_TicketSearch.
     * 
     * @param contentSearch
     */
    public void setContentSearch(java.lang.String contentSearch) {
        this.contentSearch = contentSearch;
    }


    /**
     * Gets the conditionInline value for this OTRS_TicketSearch.
     * 
     * @return conditionInline
     */
    public org.apache.axis.types.PositiveInteger getConditionInline() {
        return conditionInline;
    }


    /**
     * Sets the conditionInline value for this OTRS_TicketSearch.
     * 
     * @param conditionInline
     */
    public void setConditionInline(org.apache.axis.types.PositiveInteger conditionInline) {
        this.conditionInline = conditionInline;
    }


    /**
     * Gets the articleCreateTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @return articleCreateTimeOlderMinutes
     */
    public org.apache.axis.types.PositiveInteger getArticleCreateTimeOlderMinutes() {
        return articleCreateTimeOlderMinutes;
    }


    /**
     * Sets the articleCreateTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @param articleCreateTimeOlderMinutes
     */
    public void setArticleCreateTimeOlderMinutes(org.apache.axis.types.PositiveInteger articleCreateTimeOlderMinutes) {
        this.articleCreateTimeOlderMinutes = articleCreateTimeOlderMinutes;
    }


    /**
     * Gets the articleCreateTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @return articleCreateTimeNewerMinutes
     */
    public org.apache.axis.types.PositiveInteger getArticleCreateTimeNewerMinutes() {
        return articleCreateTimeNewerMinutes;
    }


    /**
     * Sets the articleCreateTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @param articleCreateTimeNewerMinutes
     */
    public void setArticleCreateTimeNewerMinutes(org.apache.axis.types.PositiveInteger articleCreateTimeNewerMinutes) {
        this.articleCreateTimeNewerMinutes = articleCreateTimeNewerMinutes;
    }


    /**
     * Gets the articleCreateTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @return articleCreateTimeNewerDate
     */
    public java.util.Calendar getArticleCreateTimeNewerDate() {
        return articleCreateTimeNewerDate;
    }


    /**
     * Sets the articleCreateTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @param articleCreateTimeNewerDate
     */
    public void setArticleCreateTimeNewerDate(java.util.Calendar articleCreateTimeNewerDate) {
        this.articleCreateTimeNewerDate = articleCreateTimeNewerDate;
    }


    /**
     * Gets the articleCreateTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @return articleCreateTimeOlderDate
     */
    public java.util.Calendar getArticleCreateTimeOlderDate() {
        return articleCreateTimeOlderDate;
    }


    /**
     * Sets the articleCreateTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @param articleCreateTimeOlderDate
     */
    public void setArticleCreateTimeOlderDate(java.util.Calendar articleCreateTimeOlderDate) {
        this.articleCreateTimeOlderDate = articleCreateTimeOlderDate;
    }


    /**
     * Gets the ticketCreateTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketCreateTimeOlderMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketCreateTimeOlderMinutes() {
        return ticketCreateTimeOlderMinutes;
    }


    /**
     * Sets the ticketCreateTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketCreateTimeOlderMinutes
     */
    public void setTicketCreateTimeOlderMinutes(org.apache.axis.types.PositiveInteger ticketCreateTimeOlderMinutes) {
        this.ticketCreateTimeOlderMinutes = ticketCreateTimeOlderMinutes;
    }


    /**
     * Gets the ATicketCreateTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @return ATicketCreateTimeNewerMinutes
     */
    public org.apache.axis.types.PositiveInteger getATicketCreateTimeNewerMinutes() {
        return ATicketCreateTimeNewerMinutes;
    }


    /**
     * Sets the ATicketCreateTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @param ATicketCreateTimeNewerMinutes
     */
    public void setATicketCreateTimeNewerMinutes(org.apache.axis.types.PositiveInteger ATicketCreateTimeNewerMinutes) {
        this.ATicketCreateTimeNewerMinutes = ATicketCreateTimeNewerMinutes;
    }


    /**
     * Gets the ticketCreateTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @return ticketCreateTimeNewerDate
     */
    public java.util.Calendar getTicketCreateTimeNewerDate() {
        return ticketCreateTimeNewerDate;
    }


    /**
     * Sets the ticketCreateTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @param ticketCreateTimeNewerDate
     */
    public void setTicketCreateTimeNewerDate(java.util.Calendar ticketCreateTimeNewerDate) {
        this.ticketCreateTimeNewerDate = ticketCreateTimeNewerDate;
    }


    /**
     * Gets the ticketCreateTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @return ticketCreateTimeOlderDate
     */
    public java.util.Calendar getTicketCreateTimeOlderDate() {
        return ticketCreateTimeOlderDate;
    }


    /**
     * Sets the ticketCreateTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @param ticketCreateTimeOlderDate
     */
    public void setTicketCreateTimeOlderDate(java.util.Calendar ticketCreateTimeOlderDate) {
        this.ticketCreateTimeOlderDate = ticketCreateTimeOlderDate;
    }


    /**
     * Gets the ticketChangeTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketChangeTimeOlderMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketChangeTimeOlderMinutes() {
        return ticketChangeTimeOlderMinutes;
    }


    /**
     * Sets the ticketChangeTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketChangeTimeOlderMinutes
     */
    public void setTicketChangeTimeOlderMinutes(org.apache.axis.types.PositiveInteger ticketChangeTimeOlderMinutes) {
        this.ticketChangeTimeOlderMinutes = ticketChangeTimeOlderMinutes;
    }


    /**
     * Gets the ticketChangeTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketChangeTimeNewerMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketChangeTimeNewerMinutes() {
        return ticketChangeTimeNewerMinutes;
    }


    /**
     * Sets the ticketChangeTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketChangeTimeNewerMinutes
     */
    public void setTicketChangeTimeNewerMinutes(org.apache.axis.types.PositiveInteger ticketChangeTimeNewerMinutes) {
        this.ticketChangeTimeNewerMinutes = ticketChangeTimeNewerMinutes;
    }


    /**
     * Gets the ticketChangeTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @return ticketChangeTimeNewerDate
     */
    public java.util.Calendar getTicketChangeTimeNewerDate() {
        return ticketChangeTimeNewerDate;
    }


    /**
     * Sets the ticketChangeTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @param ticketChangeTimeNewerDate
     */
    public void setTicketChangeTimeNewerDate(java.util.Calendar ticketChangeTimeNewerDate) {
        this.ticketChangeTimeNewerDate = ticketChangeTimeNewerDate;
    }


    /**
     * Gets the ticketChangeTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @return ticketChangeTimeOlderDate
     */
    public java.util.Calendar getTicketChangeTimeOlderDate() {
        return ticketChangeTimeOlderDate;
    }


    /**
     * Sets the ticketChangeTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @param ticketChangeTimeOlderDate
     */
    public void setTicketChangeTimeOlderDate(java.util.Calendar ticketChangeTimeOlderDate) {
        this.ticketChangeTimeOlderDate = ticketChangeTimeOlderDate;
    }


    /**
     * Gets the ticketCloseTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketCloseTimeOlderMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketCloseTimeOlderMinutes() {
        return ticketCloseTimeOlderMinutes;
    }


    /**
     * Sets the ticketCloseTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketCloseTimeOlderMinutes
     */
    public void setTicketCloseTimeOlderMinutes(org.apache.axis.types.PositiveInteger ticketCloseTimeOlderMinutes) {
        this.ticketCloseTimeOlderMinutes = ticketCloseTimeOlderMinutes;
    }


    /**
     * Gets the ticketCloseTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketCloseTimeNewerMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketCloseTimeNewerMinutes() {
        return ticketCloseTimeNewerMinutes;
    }


    /**
     * Sets the ticketCloseTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketCloseTimeNewerMinutes
     */
    public void setTicketCloseTimeNewerMinutes(org.apache.axis.types.PositiveInteger ticketCloseTimeNewerMinutes) {
        this.ticketCloseTimeNewerMinutes = ticketCloseTimeNewerMinutes;
    }


    /**
     * Gets the ticketCloseTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @return ticketCloseTimeNewerDate
     */
    public java.util.Calendar getTicketCloseTimeNewerDate() {
        return ticketCloseTimeNewerDate;
    }


    /**
     * Sets the ticketCloseTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @param ticketCloseTimeNewerDate
     */
    public void setTicketCloseTimeNewerDate(java.util.Calendar ticketCloseTimeNewerDate) {
        this.ticketCloseTimeNewerDate = ticketCloseTimeNewerDate;
    }


    /**
     * Gets the ticketCloseTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @return ticketCloseTimeOlderDate
     */
    public java.util.Calendar getTicketCloseTimeOlderDate() {
        return ticketCloseTimeOlderDate;
    }


    /**
     * Sets the ticketCloseTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @param ticketCloseTimeOlderDate
     */
    public void setTicketCloseTimeOlderDate(java.util.Calendar ticketCloseTimeOlderDate) {
        this.ticketCloseTimeOlderDate = ticketCloseTimeOlderDate;
    }


    /**
     * Gets the ticketPendingTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketPendingTimeOlderMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketPendingTimeOlderMinutes() {
        return ticketPendingTimeOlderMinutes;
    }


    /**
     * Sets the ticketPendingTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketPendingTimeOlderMinutes
     */
    public void setTicketPendingTimeOlderMinutes(org.apache.axis.types.PositiveInteger ticketPendingTimeOlderMinutes) {
        this.ticketPendingTimeOlderMinutes = ticketPendingTimeOlderMinutes;
    }


    /**
     * Gets the ticketPendingTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketPendingTimeNewerMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketPendingTimeNewerMinutes() {
        return ticketPendingTimeNewerMinutes;
    }


    /**
     * Sets the ticketPendingTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketPendingTimeNewerMinutes
     */
    public void setTicketPendingTimeNewerMinutes(org.apache.axis.types.PositiveInteger ticketPendingTimeNewerMinutes) {
        this.ticketPendingTimeNewerMinutes = ticketPendingTimeNewerMinutes;
    }


    /**
     * Gets the ticketPendingTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @return ticketPendingTimeNewerDate
     */
    public java.util.Calendar getTicketPendingTimeNewerDate() {
        return ticketPendingTimeNewerDate;
    }


    /**
     * Sets the ticketPendingTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @param ticketPendingTimeNewerDate
     */
    public void setTicketPendingTimeNewerDate(java.util.Calendar ticketPendingTimeNewerDate) {
        this.ticketPendingTimeNewerDate = ticketPendingTimeNewerDate;
    }


    /**
     * Gets the ticketPendingTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @return ticketPendingTimeOlderDate
     */
    public java.util.Calendar getTicketPendingTimeOlderDate() {
        return ticketPendingTimeOlderDate;
    }


    /**
     * Sets the ticketPendingTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @param ticketPendingTimeOlderDate
     */
    public void setTicketPendingTimeOlderDate(java.util.Calendar ticketPendingTimeOlderDate) {
        this.ticketPendingTimeOlderDate = ticketPendingTimeOlderDate;
    }


    /**
     * Gets the ticketEscalationTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @return ticketEscalationTimeOlderMinutes
     */
    public org.apache.axis.types.PositiveInteger getTicketEscalationTimeOlderMinutes() {
        return ticketEscalationTimeOlderMinutes;
    }


    /**
     * Sets the ticketEscalationTimeOlderMinutes value for this OTRS_TicketSearch.
     * 
     * @param ticketEscalationTimeOlderMinutes
     */
    public void setTicketEscalationTimeOlderMinutes(org.apache.axis.types.PositiveInteger ticketEscalationTimeOlderMinutes) {
        this.ticketEscalationTimeOlderMinutes = ticketEscalationTimeOlderMinutes;
    }


    /**
     * Gets the TTicketEscalationTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @return TTicketEscalationTimeNewerMinutes
     */
    public org.apache.axis.types.PositiveInteger getTTicketEscalationTimeNewerMinutes() {
        return TTicketEscalationTimeNewerMinutes;
    }


    /**
     * Sets the TTicketEscalationTimeNewerMinutes value for this OTRS_TicketSearch.
     * 
     * @param TTicketEscalationTimeNewerMinutes
     */
    public void setTTicketEscalationTimeNewerMinutes(org.apache.axis.types.PositiveInteger TTicketEscalationTimeNewerMinutes) {
        this.TTicketEscalationTimeNewerMinutes = TTicketEscalationTimeNewerMinutes;
    }


    /**
     * Gets the ticketEscalationTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @return ticketEscalationTimeNewerDate
     */
    public java.util.Calendar getTicketEscalationTimeNewerDate() {
        return ticketEscalationTimeNewerDate;
    }


    /**
     * Sets the ticketEscalationTimeNewerDate value for this OTRS_TicketSearch.
     * 
     * @param ticketEscalationTimeNewerDate
     */
    public void setTicketEscalationTimeNewerDate(java.util.Calendar ticketEscalationTimeNewerDate) {
        this.ticketEscalationTimeNewerDate = ticketEscalationTimeNewerDate;
    }


    /**
     * Gets the ticketEscalationTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @return ticketEscalationTimeOlderDate
     */
    public java.util.Calendar getTicketEscalationTimeOlderDate() {
        return ticketEscalationTimeOlderDate;
    }


    /**
     * Sets the ticketEscalationTimeOlderDate value for this OTRS_TicketSearch.
     * 
     * @param ticketEscalationTimeOlderDate
     */
    public void setTicketEscalationTimeOlderDate(java.util.Calendar ticketEscalationTimeOlderDate) {
        this.ticketEscalationTimeOlderDate = ticketEscalationTimeOlderDate;
    }


    /**
     * Gets the archiveFlags value for this OTRS_TicketSearch.
     * 
     * @return archiveFlags
     */
    public java.lang.String getArchiveFlags() {
        return archiveFlags;
    }


    /**
     * Sets the archiveFlags value for this OTRS_TicketSearch.
     * 
     * @param archiveFlags
     */
    public void setArchiveFlags(java.lang.String archiveFlags) {
        this.archiveFlags = archiveFlags;
    }


    /**
     * Gets the orderBy value for this OTRS_TicketSearch.
     * 
     * @return orderBy
     */
    public java.lang.String[] getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this OTRS_TicketSearch.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.String[] orderBy) {
        this.orderBy = orderBy;
    }

    public java.lang.String getOrderBy(int i) {
        return this.orderBy[i];
    }

    public void setOrderBy(int i, java.lang.String _value) {
        this.orderBy[i] = _value;
    }


    /**
     * Gets the sortBy value for this OTRS_TicketSearch.
     * 
     * @return sortBy
     */
    public org.apache.axis.types.PositiveInteger[] getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this OTRS_TicketSearch.
     * 
     * @param sortBy
     */
    public void setSortBy(org.apache.axis.types.PositiveInteger[] sortBy) {
        this.sortBy = sortBy;
    }

    public org.apache.axis.types.PositiveInteger getSortBy(int i) {
        return this.sortBy[i];
    }

    public void setSortBy(int i, org.apache.axis.types.PositiveInteger _value) {
        this.sortBy[i] = _value;
    }


    /**
     * Gets the customerUserID value for this OTRS_TicketSearch.
     * 
     * @return customerUserID
     */
    public java.lang.String[] getCustomerUserID() {
        return customerUserID;
    }


    /**
     * Sets the customerUserID value for this OTRS_TicketSearch.
     * 
     * @param customerUserID
     */
    public void setCustomerUserID(java.lang.String[] customerUserID) {
        this.customerUserID = customerUserID;
    }

    public java.lang.String getCustomerUserID(int i) {
        return this.customerUserID[i];
    }

    public void setCustomerUserID(int i, java.lang.String _value) {
        this.customerUserID[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OTRS_TicketSearch)) return false;
        OTRS_TicketSearch other = (OTRS_TicketSearch) obj;
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
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              java.util.Arrays.equals(this.ticketNumber, other.getTicketNumber()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.queues==null && other.getQueues()==null) || 
             (this.queues!=null &&
              java.util.Arrays.equals(this.queues, other.getQueues()))) &&
            ((this.queueIDs==null && other.getQueueIDs()==null) || 
             (this.queueIDs!=null &&
              java.util.Arrays.equals(this.queueIDs, other.getQueueIDs()))) &&
            ((this.useSubQueues==null && other.getUseSubQueues()==null) || 
             (this.useSubQueues!=null &&
              this.useSubQueues.equals(other.getUseSubQueues()))) &&
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes()))) &&
            ((this.typeIDs==null && other.getTypeIDs()==null) || 
             (this.typeIDs!=null &&
              java.util.Arrays.equals(this.typeIDs, other.getTypeIDs()))) &&
            ((this.states==null && other.getStates()==null) || 
             (this.states!=null &&
              java.util.Arrays.equals(this.states, other.getStates()))) &&
            ((this.stateIDs==null && other.getStateIDs()==null) || 
             (this.stateIDs!=null &&
              java.util.Arrays.equals(this.stateIDs, other.getStateIDs()))) &&
            ((this.stateType==null && other.getStateType()==null) || 
             (this.stateType!=null &&
              java.util.Arrays.equals(this.stateType, other.getStateType()))) &&
            ((this.stateTypeIDs==null && other.getStateTypeIDs()==null) || 
             (this.stateTypeIDs!=null &&
              java.util.Arrays.equals(this.stateTypeIDs, other.getStateTypeIDs()))) &&
            ((this.priorities==null && other.getPriorities()==null) || 
             (this.priorities!=null &&
              java.util.Arrays.equals(this.priorities, other.getPriorities()))) &&
            ((this.priorityIDs==null && other.getPriorityIDs()==null) || 
             (this.priorityIDs!=null &&
              java.util.Arrays.equals(this.priorityIDs, other.getPriorityIDs()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices()))) &&
            ((this.serviceIDs==null && other.getServiceIDs()==null) || 
             (this.serviceIDs!=null &&
              java.util.Arrays.equals(this.serviceIDs, other.getServiceIDs()))) &&
            ((this.SLAs==null && other.getSLAs()==null) || 
             (this.SLAs!=null &&
              java.util.Arrays.equals(this.SLAs, other.getSLAs()))) &&
            ((this.SLAIDs==null && other.getSLAIDs()==null) || 
             (this.SLAIDs!=null &&
              java.util.Arrays.equals(this.SLAIDs, other.getSLAIDs()))) &&
            ((this.locks==null && other.getLocks()==null) || 
             (this.locks!=null &&
              java.util.Arrays.equals(this.locks, other.getLocks()))) &&
            ((this.lockIDs==null && other.getLockIDs()==null) || 
             (this.lockIDs!=null &&
              java.util.Arrays.equals(this.lockIDs, other.getLockIDs()))) &&
            ((this.ownerIDs==null && other.getOwnerIDs()==null) || 
             (this.ownerIDs!=null &&
              java.util.Arrays.equals(this.ownerIDs, other.getOwnerIDs()))) &&
            ((this.responsibleIDs==null && other.getResponsibleIDs()==null) || 
             (this.responsibleIDs!=null &&
              java.util.Arrays.equals(this.responsibleIDs, other.getResponsibleIDs()))) &&
            ((this.watchUserIDs==null && other.getWatchUserIDs()==null) || 
             (this.watchUserIDs!=null &&
              java.util.Arrays.equals(this.watchUserIDs, other.getWatchUserIDs()))) &&
            ((this.customerID==null && other.getCustomerID()==null) || 
             (this.customerID!=null &&
              java.util.Arrays.equals(this.customerID, other.getCustomerID()))) &&
            ((this.customerUserLogin2==null && other.getCustomerUserLogin2()==null) || 
             (this.customerUserLogin2!=null &&
              java.util.Arrays.equals(this.customerUserLogin2, other.getCustomerUserLogin2()))) &&
            ((this.createdUserIDs==null && other.getCreatedUserIDs()==null) || 
             (this.createdUserIDs!=null &&
              java.util.Arrays.equals(this.createdUserIDs, other.getCreatedUserIDs()))) &&
            ((this.createdTypes==null && other.getCreatedTypes()==null) || 
             (this.createdTypes!=null &&
              java.util.Arrays.equals(this.createdTypes, other.getCreatedTypes()))) &&
            ((this.createdTypeIDs==null && other.getCreatedTypeIDs()==null) || 
             (this.createdTypeIDs!=null &&
              java.util.Arrays.equals(this.createdTypeIDs, other.getCreatedTypeIDs()))) &&
            ((this.createdPriorities==null && other.getCreatedPriorities()==null) || 
             (this.createdPriorities!=null &&
              java.util.Arrays.equals(this.createdPriorities, other.getCreatedPriorities()))) &&
            ((this.createdPriorityIDs==null && other.getCreatedPriorityIDs()==null) || 
             (this.createdPriorityIDs!=null &&
              java.util.Arrays.equals(this.createdPriorityIDs, other.getCreatedPriorityIDs()))) &&
            ((this.createdStates==null && other.getCreatedStates()==null) || 
             (this.createdStates!=null &&
              java.util.Arrays.equals(this.createdStates, other.getCreatedStates()))) &&
            ((this.createdStateIDs==null && other.getCreatedStateIDs()==null) || 
             (this.createdStateIDs!=null &&
              java.util.Arrays.equals(this.createdStateIDs, other.getCreatedStateIDs()))) &&
            ((this.createdQueues==null && other.getCreatedQueues()==null) || 
             (this.createdQueues!=null &&
              java.util.Arrays.equals(this.createdQueues, other.getCreatedQueues()))) &&
            ((this.createdQueueIDs==null && other.getCreatedQueueIDs()==null) || 
             (this.createdQueueIDs!=null &&
              java.util.Arrays.equals(this.createdQueueIDs, other.getCreatedQueueIDs()))) &&
            ((this.dynamicFields==null && other.getDynamicFields()==null) || 
             (this.dynamicFields!=null &&
              java.util.Arrays.equals(this.dynamicFields, other.getDynamicFields()))) &&
            ((this.ticketflag==null && other.getTicketflag()==null) || 
             (this.ticketflag!=null &&
              this.ticketflag.equals(other.getTicketflag()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.cc==null && other.getCc()==null) || 
             (this.cc!=null &&
              this.cc.equals(other.getCc()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.fullTextIndex==null && other.getFullTextIndex()==null) || 
             (this.fullTextIndex!=null &&
              this.fullTextIndex.equals(other.getFullTextIndex()))) &&
            ((this.contentSearch==null && other.getContentSearch()==null) || 
             (this.contentSearch!=null &&
              this.contentSearch.equals(other.getContentSearch()))) &&
            ((this.conditionInline==null && other.getConditionInline()==null) || 
             (this.conditionInline!=null &&
              this.conditionInline.equals(other.getConditionInline()))) &&
            ((this.articleCreateTimeOlderMinutes==null && other.getArticleCreateTimeOlderMinutes()==null) || 
             (this.articleCreateTimeOlderMinutes!=null &&
              this.articleCreateTimeOlderMinutes.equals(other.getArticleCreateTimeOlderMinutes()))) &&
            ((this.articleCreateTimeNewerMinutes==null && other.getArticleCreateTimeNewerMinutes()==null) || 
             (this.articleCreateTimeNewerMinutes!=null &&
              this.articleCreateTimeNewerMinutes.equals(other.getArticleCreateTimeNewerMinutes()))) &&
            ((this.articleCreateTimeNewerDate==null && other.getArticleCreateTimeNewerDate()==null) || 
             (this.articleCreateTimeNewerDate!=null &&
              this.articleCreateTimeNewerDate.equals(other.getArticleCreateTimeNewerDate()))) &&
            ((this.articleCreateTimeOlderDate==null && other.getArticleCreateTimeOlderDate()==null) || 
             (this.articleCreateTimeOlderDate!=null &&
              this.articleCreateTimeOlderDate.equals(other.getArticleCreateTimeOlderDate()))) &&
            ((this.ticketCreateTimeOlderMinutes==null && other.getTicketCreateTimeOlderMinutes()==null) || 
             (this.ticketCreateTimeOlderMinutes!=null &&
              this.ticketCreateTimeOlderMinutes.equals(other.getTicketCreateTimeOlderMinutes()))) &&
            ((this.ATicketCreateTimeNewerMinutes==null && other.getATicketCreateTimeNewerMinutes()==null) || 
             (this.ATicketCreateTimeNewerMinutes!=null &&
              this.ATicketCreateTimeNewerMinutes.equals(other.getATicketCreateTimeNewerMinutes()))) &&
            ((this.ticketCreateTimeNewerDate==null && other.getTicketCreateTimeNewerDate()==null) || 
             (this.ticketCreateTimeNewerDate!=null &&
              this.ticketCreateTimeNewerDate.equals(other.getTicketCreateTimeNewerDate()))) &&
            ((this.ticketCreateTimeOlderDate==null && other.getTicketCreateTimeOlderDate()==null) || 
             (this.ticketCreateTimeOlderDate!=null &&
              this.ticketCreateTimeOlderDate.equals(other.getTicketCreateTimeOlderDate()))) &&
            ((this.ticketChangeTimeOlderMinutes==null && other.getTicketChangeTimeOlderMinutes()==null) || 
             (this.ticketChangeTimeOlderMinutes!=null &&
              this.ticketChangeTimeOlderMinutes.equals(other.getTicketChangeTimeOlderMinutes()))) &&
            ((this.ticketChangeTimeNewerMinutes==null && other.getTicketChangeTimeNewerMinutes()==null) || 
             (this.ticketChangeTimeNewerMinutes!=null &&
              this.ticketChangeTimeNewerMinutes.equals(other.getTicketChangeTimeNewerMinutes()))) &&
            ((this.ticketChangeTimeNewerDate==null && other.getTicketChangeTimeNewerDate()==null) || 
             (this.ticketChangeTimeNewerDate!=null &&
              this.ticketChangeTimeNewerDate.equals(other.getTicketChangeTimeNewerDate()))) &&
            ((this.ticketChangeTimeOlderDate==null && other.getTicketChangeTimeOlderDate()==null) || 
             (this.ticketChangeTimeOlderDate!=null &&
              this.ticketChangeTimeOlderDate.equals(other.getTicketChangeTimeOlderDate()))) &&
            ((this.ticketCloseTimeOlderMinutes==null && other.getTicketCloseTimeOlderMinutes()==null) || 
             (this.ticketCloseTimeOlderMinutes!=null &&
              this.ticketCloseTimeOlderMinutes.equals(other.getTicketCloseTimeOlderMinutes()))) &&
            ((this.ticketCloseTimeNewerMinutes==null && other.getTicketCloseTimeNewerMinutes()==null) || 
             (this.ticketCloseTimeNewerMinutes!=null &&
              this.ticketCloseTimeNewerMinutes.equals(other.getTicketCloseTimeNewerMinutes()))) &&
            ((this.ticketCloseTimeNewerDate==null && other.getTicketCloseTimeNewerDate()==null) || 
             (this.ticketCloseTimeNewerDate!=null &&
              this.ticketCloseTimeNewerDate.equals(other.getTicketCloseTimeNewerDate()))) &&
            ((this.ticketCloseTimeOlderDate==null && other.getTicketCloseTimeOlderDate()==null) || 
             (this.ticketCloseTimeOlderDate!=null &&
              this.ticketCloseTimeOlderDate.equals(other.getTicketCloseTimeOlderDate()))) &&
            ((this.ticketPendingTimeOlderMinutes==null && other.getTicketPendingTimeOlderMinutes()==null) || 
             (this.ticketPendingTimeOlderMinutes!=null &&
              this.ticketPendingTimeOlderMinutes.equals(other.getTicketPendingTimeOlderMinutes()))) &&
            ((this.ticketPendingTimeNewerMinutes==null && other.getTicketPendingTimeNewerMinutes()==null) || 
             (this.ticketPendingTimeNewerMinutes!=null &&
              this.ticketPendingTimeNewerMinutes.equals(other.getTicketPendingTimeNewerMinutes()))) &&
            ((this.ticketPendingTimeNewerDate==null && other.getTicketPendingTimeNewerDate()==null) || 
             (this.ticketPendingTimeNewerDate!=null &&
              this.ticketPendingTimeNewerDate.equals(other.getTicketPendingTimeNewerDate()))) &&
            ((this.ticketPendingTimeOlderDate==null && other.getTicketPendingTimeOlderDate()==null) || 
             (this.ticketPendingTimeOlderDate!=null &&
              this.ticketPendingTimeOlderDate.equals(other.getTicketPendingTimeOlderDate()))) &&
            ((this.ticketEscalationTimeOlderMinutes==null && other.getTicketEscalationTimeOlderMinutes()==null) || 
             (this.ticketEscalationTimeOlderMinutes!=null &&
              this.ticketEscalationTimeOlderMinutes.equals(other.getTicketEscalationTimeOlderMinutes()))) &&
            ((this.TTicketEscalationTimeNewerMinutes==null && other.getTTicketEscalationTimeNewerMinutes()==null) || 
             (this.TTicketEscalationTimeNewerMinutes!=null &&
              this.TTicketEscalationTimeNewerMinutes.equals(other.getTTicketEscalationTimeNewerMinutes()))) &&
            ((this.ticketEscalationTimeNewerDate==null && other.getTicketEscalationTimeNewerDate()==null) || 
             (this.ticketEscalationTimeNewerDate!=null &&
              this.ticketEscalationTimeNewerDate.equals(other.getTicketEscalationTimeNewerDate()))) &&
            ((this.ticketEscalationTimeOlderDate==null && other.getTicketEscalationTimeOlderDate()==null) || 
             (this.ticketEscalationTimeOlderDate!=null &&
              this.ticketEscalationTimeOlderDate.equals(other.getTicketEscalationTimeOlderDate()))) &&
            ((this.archiveFlags==null && other.getArchiveFlags()==null) || 
             (this.archiveFlags!=null &&
              this.archiveFlags.equals(other.getArchiveFlags()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              java.util.Arrays.equals(this.orderBy, other.getOrderBy()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              java.util.Arrays.equals(this.sortBy, other.getSortBy()))) &&
            ((this.customerUserID==null && other.getCustomerUserID()==null) || 
             (this.customerUserID!=null &&
              java.util.Arrays.equals(this.customerUserID, other.getCustomerUserID())));
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
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getTicketNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTicketNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTicketNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueueIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueueIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueueIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseSubQueues() != null) {
            _hashCode += getUseSubQueues().hashCode();
        }
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTypeIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypeIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypeIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStateIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStateTypeIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStateTypeIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStateTypeIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriorities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriorities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriorities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriorityIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriorityIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriorityIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSLAs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSLAs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSLAs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSLAIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSLAIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSLAIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLockIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLockIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLockIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOwnerIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwnerIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwnerIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponsibleIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponsibleIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponsibleIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWatchUserIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWatchUserIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWatchUserIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerID(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerUserLogin2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerUserLogin2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerUserLogin2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedUserIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedUserIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedUserIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedTypeIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedTypeIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedTypeIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedPriorities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedPriorities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedPriorities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedPriorityIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedPriorityIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedPriorityIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedStates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedStates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedStates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedStateIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedStateIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedStateIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedQueues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedQueues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedQueues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedQueueIDs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedQueueIDs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedQueueIDs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDynamicFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTicketflag() != null) {
            _hashCode += getTicketflag().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getCc() != null) {
            _hashCode += getCc().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getFullTextIndex() != null) {
            _hashCode += getFullTextIndex().hashCode();
        }
        if (getContentSearch() != null) {
            _hashCode += getContentSearch().hashCode();
        }
        if (getConditionInline() != null) {
            _hashCode += getConditionInline().hashCode();
        }
        if (getArticleCreateTimeOlderMinutes() != null) {
            _hashCode += getArticleCreateTimeOlderMinutes().hashCode();
        }
        if (getArticleCreateTimeNewerMinutes() != null) {
            _hashCode += getArticleCreateTimeNewerMinutes().hashCode();
        }
        if (getArticleCreateTimeNewerDate() != null) {
            _hashCode += getArticleCreateTimeNewerDate().hashCode();
        }
        if (getArticleCreateTimeOlderDate() != null) {
            _hashCode += getArticleCreateTimeOlderDate().hashCode();
        }
        if (getTicketCreateTimeOlderMinutes() != null) {
            _hashCode += getTicketCreateTimeOlderMinutes().hashCode();
        }
        if (getATicketCreateTimeNewerMinutes() != null) {
            _hashCode += getATicketCreateTimeNewerMinutes().hashCode();
        }
        if (getTicketCreateTimeNewerDate() != null) {
            _hashCode += getTicketCreateTimeNewerDate().hashCode();
        }
        if (getTicketCreateTimeOlderDate() != null) {
            _hashCode += getTicketCreateTimeOlderDate().hashCode();
        }
        if (getTicketChangeTimeOlderMinutes() != null) {
            _hashCode += getTicketChangeTimeOlderMinutes().hashCode();
        }
        if (getTicketChangeTimeNewerMinutes() != null) {
            _hashCode += getTicketChangeTimeNewerMinutes().hashCode();
        }
        if (getTicketChangeTimeNewerDate() != null) {
            _hashCode += getTicketChangeTimeNewerDate().hashCode();
        }
        if (getTicketChangeTimeOlderDate() != null) {
            _hashCode += getTicketChangeTimeOlderDate().hashCode();
        }
        if (getTicketCloseTimeOlderMinutes() != null) {
            _hashCode += getTicketCloseTimeOlderMinutes().hashCode();
        }
        if (getTicketCloseTimeNewerMinutes() != null) {
            _hashCode += getTicketCloseTimeNewerMinutes().hashCode();
        }
        if (getTicketCloseTimeNewerDate() != null) {
            _hashCode += getTicketCloseTimeNewerDate().hashCode();
        }
        if (getTicketCloseTimeOlderDate() != null) {
            _hashCode += getTicketCloseTimeOlderDate().hashCode();
        }
        if (getTicketPendingTimeOlderMinutes() != null) {
            _hashCode += getTicketPendingTimeOlderMinutes().hashCode();
        }
        if (getTicketPendingTimeNewerMinutes() != null) {
            _hashCode += getTicketPendingTimeNewerMinutes().hashCode();
        }
        if (getTicketPendingTimeNewerDate() != null) {
            _hashCode += getTicketPendingTimeNewerDate().hashCode();
        }
        if (getTicketPendingTimeOlderDate() != null) {
            _hashCode += getTicketPendingTimeOlderDate().hashCode();
        }
        if (getTicketEscalationTimeOlderMinutes() != null) {
            _hashCode += getTicketEscalationTimeOlderMinutes().hashCode();
        }
        if (getTTicketEscalationTimeNewerMinutes() != null) {
            _hashCode += getTTicketEscalationTimeNewerMinutes().hashCode();
        }
        if (getTicketEscalationTimeNewerDate() != null) {
            _hashCode += getTicketEscalationTimeNewerDate().hashCode();
        }
        if (getTicketEscalationTimeOlderDate() != null) {
            _hashCode += getTicketEscalationTimeOlderDate().hashCode();
        }
        if (getArchiveFlags() != null) {
            _hashCode += getArchiveFlags().hashCode();
        }
        if (getOrderBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSortBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSortBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerUserID() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerUserID());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerUserID(), i);
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
        new org.apache.axis.description.TypeDesc(OTRS_TicketSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearch"));
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
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Queues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "QueueIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSubQueues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UseSubQueues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TypeIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("states");
        elemField.setXmlName(new javax.xml.namespace.QName("", "States"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateTypeIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StateTypeIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Priorities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PriorityIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ServiceIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLAs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLAIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SLAIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Locks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LockIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OwnerIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsibleIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ResponsibleIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("watchUserIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "WatchUserIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUserLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerUserLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdUserIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedUserIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdTypeIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedTypeIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdPriorities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedPriorities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdPriorityIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedPriorityIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdStates");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedStates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdStateIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedStateIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdQueues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedQueues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdQueueIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CreatedQueueIDs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicFields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DynamicFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSeach_DynamicField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Ticketflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearch_TicketFlag"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "From"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "To"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Cc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullTextIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FullTextIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ContentSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionInline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConditionInline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleCreateTimeOlderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleCreateTimeOlderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleCreateTimeNewerMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleCreateTimeNewerMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleCreateTimeNewerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleCreateTimeNewerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("articleCreateTimeOlderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArticleCreateTimeOlderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCreateTimeOlderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketCreateTimeOlderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ATicketCreateTimeNewerMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ATicketCreateTimeNewerMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCreateTimeNewerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketCreateTimeNewerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCreateTimeOlderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketCreateTimeOlderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketChangeTimeOlderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketChangeTimeOlderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketChangeTimeNewerMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketChangeTimeNewerMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketChangeTimeNewerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketChangeTimeNewerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketChangeTimeOlderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketChangeTimeOlderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCloseTimeOlderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketCloseTimeOlderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCloseTimeNewerMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketCloseTimeNewerMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCloseTimeNewerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketCloseTimeNewerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCloseTimeOlderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketCloseTimeOlderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketPendingTimeOlderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketPendingTimeOlderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketPendingTimeNewerMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketPendingTimeNewerMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketPendingTimeNewerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketPendingTimeNewerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketPendingTimeOlderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketPendingTimeOlderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketEscalationTimeOlderMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketEscalationTimeOlderMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TTicketEscalationTimeNewerMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TTicketEscalationTimeNewerMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketEscalationTimeNewerDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketEscalationTimeNewerDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketEscalationTimeOlderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TicketEscalationTimeOlderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archiveFlags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ArchiveFlags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OrderBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SortBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CustomerUserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
