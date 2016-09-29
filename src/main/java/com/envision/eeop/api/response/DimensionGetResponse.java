package com.envision.eeop.api.response;

import java.util.Map;

import com.envision.eeop.api.EnvisionResponse;
import com.google.gson.annotations.SerializedName;

/**
 * Domain schemas
 * @author jieyuan.shen
 */
public class DimensionGetResponse extends EnvisionResponse {

	private static final long serialVersionUID = 627716959003640263L;
	
	@SerializedName("data")
	private Map<String, Object>  dimensionMap;

	public Map<String, Object> getDimensionMap() {
		return dimensionMap;
	}

	public void setDimensionMap(Map<String, Object> dimensionMap) {
		this.dimensionMap = dimensionMap;
	}
}
