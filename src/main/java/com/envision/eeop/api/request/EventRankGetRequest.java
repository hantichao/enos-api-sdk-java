package com.envision.eeop.api.request;

import com.envision.eeop.api.EnvisionRequest;
import com.envision.eeop.api.exception.EnvisionRuleException;
import com.envision.eeop.api.response.EventRankGetResponse;
import com.envision.eeop.api.util.EnvisionHashMap;
import com.envision.eeop.api.util.RuleCheckUtils;

import java.util.Map;

public class EventRankGetRequest implements EnvisionRequest<EventRankGetResponse>{
    private static final String API_METHOD = "/eventService/getEventRank";

    private String categoryId;
    private String locale;           // optional

    public EventRankGetRequest(String categoryId, String locale){
        this.categoryId = categoryId;
        this.locale = locale;
    }

    public EventRankGetRequest(String categoryId){
        this.categoryId = categoryId;
        this.locale = "";
    }
    
    public String getApiMethodName(){
        return API_METHOD;
    }
    
    public Map<String, String> getTextParams(){
        EnvisionHashMap txtParams = new EnvisionHashMap();
        
        txtParams.put("categoryid", categoryId);
        txtParams.put("locale", locale);
        
        return txtParams;
    }
    
    public Class<EventRankGetResponse> getResponseClass(){
        return EventRankGetResponse.class;
    }
    
    public void check() throws EnvisionRuleException{
        RuleCheckUtils.checkNotEmpty(categoryId, "categoryId");
        // RuleCheckUtils.checkNotEmpty(token, "token");
    }
}