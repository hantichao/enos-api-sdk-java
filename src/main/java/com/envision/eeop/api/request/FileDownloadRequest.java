package com.envision.eeop.api.request;

import com.envision.eeop.api.EnvisionRequest;
import com.envision.eeop.api.exception.EnvisionRuleException;
import com.envision.eeop.api.util.RuleCheckUtils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by changyi.yuan on 2016/10/18.
 */
public class FileDownloadRequest implements EnvisionRequest {
    private static final String API_METHOD = "/fileService/download";

    private String mdmId;

    private String timestamp;

    private File result;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMdmId() {
        return mdmId;
    }

    public void setMdmId(String mdmId) {
        this.mdmId = mdmId;
    }

    public File getResult() {
        return result;
    }

    public void setResult(File result) {
        this.result = result;
    }

    public FileDownloadRequest(String mdmId, String timestamp, File result) {
        this.mdmId = mdmId;
        this.timestamp = timestamp;
        this.result = result;
    }

    public String getApiMethodName() {
        return API_METHOD;
    }

    @Override
    public Map<String, String> getTextParams() {
        Map<String, String> txtParams = new HashMap<String, String>();

        txtParams.put("mdmid", mdmId);
        txtParams.put("timestamp", timestamp);

        return txtParams;
    }

    public Class<Object> getResponseClass() {
        return Object.class;
    }

    public void check() throws EnvisionRuleException {
        RuleCheckUtils.checkNotEmpty(mdmId, "mdmid");
        RuleCheckUtils.checkNotEmpty(timestamp, "timestamp");
        RuleCheckUtils.checkDateFormat(timestamp, "yyyyMMdd");
    }
}
