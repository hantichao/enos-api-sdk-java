package com.envision.eeop.api.request;

import com.envision.eeop.api.EnvisionRequest;
import com.envision.eeop.api.exception.EnvisionRuleException;
import com.envision.eeop.api.response.EventTypeGetResponse;
import com.envision.eeop.api.util.EnvisionHashMap;
import com.envision.eeop.api.util.RuleCheckUtils;

import java.util.Map;

public class EventTypeGetRequest implements EnvisionRequest<EventTypeGetResponse>{
    private static final String API_METHOD = "/eventService/getEventType";

    private String categoryId;
    private String locale;           // optional
    private String mdmId;

    public EventTypeGetRequest(String categoryId, String mdmId){
        this.categoryId = categoryId;
        this.mdmId = mdmId;
        this.locale = "";
    }

    public EventTypeGetRequest(String categoryId, String mdmId, String locale){
        this.categoryId = categoryId;
        this.mdmId = mdmId;
        this.locale = locale;
    }

    public EventTypeGetRequest(String categoryId){
        this.categoryId = categoryId;
        this.mdmId = "";
        this.locale = "";
    }
    
    public String getApiMethodName(){
        return API_METHOD;
    }
    
    public Map<String, String> getTextParams(){
        EnvisionHashMap txtParams = new EnvisionHashMap();

        txtParams.put("categoryid", categoryId);
        txtParams.put("locale", locale);
        txtParams.put("mdmid", mdmId);
        
        return txtParams;
    }
    
    public Class<EventTypeGetResponse> getResponseClass(){
        return EventTypeGetResponse.class;
    }
    
    public void check() throws EnvisionRuleException{
        RuleCheckUtils.checkNotEmpty(categoryId, "categoryId");
        // RuleCheckUtils.checkNotEmpty(token, "token");
    }
}
