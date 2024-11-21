package com.test1;

public class PlatformTokens {
	private Integer tokenCode;
	private Integer baseAppId;
	private String platformName;
	private String osName;
	private String virtualEnvAvailable;
	private String virtualMachineType;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public PlatformTokens() {

	}

	public PlatformTokens(Integer tokenCode, Integer baseAppId, String platformName, String osName,
			String virtualEnvAvailable, String virtualMachineType, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.tokenCode = tokenCode;
		this.baseAppId = baseAppId;
		this.platformName = platformName;
		this.osName = osName;
		this.virtualEnvAvailable = virtualEnvAvailable;
		this.virtualMachineType = virtualMachineType;
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

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getVirtualEnvAvailable() {
		return virtualEnvAvailable;
	}

	public void setVirtualEnvAvailable(String virtualEnvAvailable) {
		this.virtualEnvAvailable = virtualEnvAvailable;
	}

	public String getVirtualMachineType() {
		return virtualMachineType;
	}

	public void setVirtualMachineType(String virtualMachineType) {
		this.virtualMachineType = virtualMachineType;
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
