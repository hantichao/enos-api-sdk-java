package com.envisioniot.enos.enosapi.api.request.connectservice;

import com.envisioniot.enos.enosapi.common.response.EnOSResponse;
import com.envisioniot.enos.enosapi.api.resource.connectservice.ServiceInvokeInfo;
import java.lang.Long;
import java.util.Map;
import java.lang.Object;
import java.lang.String;
import com.envisioniot.enos.enosapi.common.annotation.*;
import com.envisioniot.enos.enosapi.common.enumeration.*;
import com.envisioniot.enos.enosapi.common.request.*;
import com.envisioniot.enos.enosapi.common.exception.*;

import java.util.*;

public class InvokeServiceByAssetIdRequest extends EnOSRequest<EnOSResponse<ServiceInvokeInfo>> {
    private static final String API_METHOD = "/connectService/devices/{assetId}/services/{serviceId}/invoke";
    private static final String REQUEST_METHOD = "PUT";
    
    private String orgId;
    @EnOSPathVariable(name = "assetId")
    private String assetId;
    @EnOSPathVariable(name = "serviceId")
    private String serviceId;
    
    private String requestId;
    
    private String callbackUrl;
    
    private Long timeout;
    @EnOSRequestBody
    private Map<String, Object> args;

    public InvokeServiceByAssetIdRequest(String orgId, String assetId, String serviceId, String requestId, String callbackUrl, Long timeout, Map<String, Object> args) {
        this.orgId = orgId;
        this.assetId = assetId;
        this.serviceId = serviceId;
        this.requestId = requestId;
        this.callbackUrl = callbackUrl;
        this.timeout = timeout;
        this.args = args;
    }

    @Override
    public String getApiMethodName() {
        return API_METHOD;
    }

    @Override
    public String getRequestMethod() {
        return REQUEST_METHOD;
    }

    @Override
    public void check() throws EnOSRuleException {
        // super.check();
    }
}