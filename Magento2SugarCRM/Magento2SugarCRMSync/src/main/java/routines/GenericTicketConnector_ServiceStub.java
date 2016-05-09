/**
 * GenericTicketConnector_ServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package routines;

public class GenericTicketConnector_ServiceStub extends org.apache.axis.client.Stub implements routines.GenericTicketConnector_Interface {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TicketCreate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketCreate"), routines.OTRS_TicketCreate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketCreateResponse"));
        oper.setReturnClass(routines.OTRS_TicketCreateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "TicketCreateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TicketUpdate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketUpdate"), routines.OTRS_TicketUpdate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketUpdateResponse"));
        oper.setReturnClass(routines.OTRS_TicketUpdateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "TicketUpdateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TicketGet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGet"), routines.OTRS_TicketGet.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGetResponse"));
        oper.setReturnClass(routines.OTRS_TicketGetResponse_Ticket[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "TicketGetResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "Ticket"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TicketSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TicketSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearch"), routines.OTRS_TicketSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearchResponse"));
        oper.setReturnClass(org.apache.axis.types.PositiveInteger[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "TicketSearchResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "TicketID"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SessionCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SessionCreate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_SessionCreate"), routines.OTRS_SessionCreate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_SessionCreateResponse"));
        oper.setReturnClass(routines.OTRS_SessionCreateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "SessionCreateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public GenericTicketConnector_ServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GenericTicketConnector_ServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GenericTicketConnector_ServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_Article");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_Article.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_Attachment");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_DynamicField");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_DynamicField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_Error");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_PendingTime");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_PendingTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_SessionCreate");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_SessionCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_SessionCreateResponse");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_SessionCreateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketCreate");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketCreate_Ticket");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketCreate_Ticket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketCreateResponse");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketCreateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGet");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketGet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGet_Attachment");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketGet_Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGetResponse");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketGetResponse_Ticket[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGetResponse_Ticket");
            qName2 = new javax.xml.namespace.QName("", "Ticket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGetResponse_Article");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketGetResponse_Article.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketGetResponse_Ticket");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketGetResponse_Ticket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSeach_DynamicField");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketSeach_DynamicField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearch");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearch_TicketFlag");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketSearch_TicketFlag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketSearchResponse");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.PositiveInteger[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "positiveInteger");
            qName2 = new javax.xml.namespace.QName("", "TicketID");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketUpdate");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketUpdate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketUpdate_Ticket");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketUpdate_Ticket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.otrs.org/TicketConnector/", "OTRS_TicketUpdateResponse");
            cachedSerQNames.add(qName);
            cls = routines.OTRS_TicketUpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public routines.OTRS_TicketCreateResponse ticketCreate(routines.OTRS_TicketCreate ticketCreate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.otrs.org/TicketConnector/TicketCreate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TicketCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ticketCreate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (routines.OTRS_TicketCreateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (routines.OTRS_TicketCreateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, routines.OTRS_TicketCreateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public routines.OTRS_TicketUpdateResponse ticketUpdate(routines.OTRS_TicketUpdate ticketUpdate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.otrs.org/TicketConnector/TicketUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TicketUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ticketUpdate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (routines.OTRS_TicketUpdateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (routines.OTRS_TicketUpdateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, routines.OTRS_TicketUpdateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public routines.OTRS_TicketGetResponse_Ticket[] ticketGet(routines.OTRS_TicketGet ticketGet) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.otrs.org/TicketConnector/TicketGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TicketGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ticketGet});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (routines.OTRS_TicketGetResponse_Ticket[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (routines.OTRS_TicketGetResponse_Ticket[]) org.apache.axis.utils.JavaUtils.convert(_resp, routines.OTRS_TicketGetResponse_Ticket[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.apache.axis.types.PositiveInteger[] ticketSearch(routines.OTRS_TicketSearch ticketSearch) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.otrs.org/TicketConnector/TicketSearch");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TicketSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ticketSearch});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.apache.axis.types.PositiveInteger[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.apache.axis.types.PositiveInteger[]) org.apache.axis.utils.JavaUtils.convert(_resp, org.apache.axis.types.PositiveInteger[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public routines.OTRS_SessionCreateResponse sessionCreate(routines.OTRS_SessionCreate sessionCreate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.otrs.org/TicketConnector/SessionCreate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SessionCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionCreate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (routines.OTRS_SessionCreateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (routines.OTRS_SessionCreateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, routines.OTRS_SessionCreateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
