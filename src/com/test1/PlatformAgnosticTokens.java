package com.test1;

public class PlatformAgnosticTokens {
	private Integer tokenCode;
	private Integer baseAppId;
	private String platformName;
	private String algorithm;
	private String agitlity;
	private long errorCode;
	private String errorSeverity;
	private String versionProtocol;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PlatformAgnosticTokens() {

	}

	public PlatformAgnosticTokens(Integer tokenCode, Integer baseAppId, String platformName, String algorithm,
			String agitlity, long errorCode, String errorSeverity, String versionProtocol, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.tokenCode = tokenCode;
		this.baseAppId = baseAppId;
		this.platformName = platformName;
		this.algorithm = algorithm;
		this.agitlity = agitlity;
		this.errorCode = errorCode;
		this.errorSeverity = errorSeverity;
		this.versionProtocol = versionProtocol;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getTokenCode() {
		return tokenCode;
	}

	public void setTokenCode(Integer tokenCode) {
		this.tokenCode = tokenCode;
	}

	public Integer getBaseAppId() {
		return baseAppId;
	}

	public void setBaseAppId(Integer baseAppId) {
		this.baseAppId = baseAppId;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public String getAgitlity() {
		return agitlity;
	}

	public void setAgitlity(String agitlity) {
		this.agitlity = agitlity;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorSeverity() {
		return errorSeverity;
	}

	public void setErrorSeverity(String errorSeverity) {
		this.errorSeverity = errorSeverity;
	}

	public String getVersionProtocol() {
		return versionProtocol;
	}

	public void setVersionProtocol(String versionProtocol) {
		this.versionProtocol = versionProtocol;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
