package com.test1;

public class RefernceAuthTokens {
	private Integer tokenCode;
	private Integer baseAppId;
	private String platformName;
	private String signature;
	private String installation;
	private String symmetricKey;
	private String asymmetricKey;
	private long benchMarks;
	private Integer decodedHash;
	private String modularData;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public RefernceAuthTokens() {

	}

	public RefernceAuthTokens(Integer tokenCode, Integer baseAppId, String platformName, String signature,
			String installation, String symmetricKey, String asymmetricKey, long benchMarks, Integer decodedHash,
			String modularData, String creationDate, String modifiedDate, String entityState) {
		super();
		this.tokenCode = tokenCode;
		this.baseAppId = baseAppId;
		this.platformName = platformName;
		this.signature = signature;
		this.installation = installation;
		this.symmetricKey = symmetricKey;
		this.asymmetricKey = asymmetricKey;
		this.benchMarks = benchMarks;
		this.decodedHash = decodedHash;
		this.modularData = modularData;
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

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getInstallation() {
		return installation;
	}

	public void setInstallation(String installation) {
		this.installation = installation;
	}

	public String getSymmetricKey() {
		return symmetricKey;
	}

	public void setSymmetricKey(String symmetricKey) {
		this.symmetricKey = symmetricKey;
	}

	public String getAsymmetricKey() {
		return asymmetricKey;
	}

	public void setAsymmetricKey(String asymmetricKey) {
		this.asymmetricKey = asymmetricKey;
	}

	public long getBenchMarks() {
		return benchMarks;
	}

	public void setBenchMarks(long benchMarks) {
		this.benchMarks = benchMarks;
	}

	public Integer getDecodedHash() {
		return decodedHash;
	}

	public void setDecodedHash(Integer decodedHash) {
		this.decodedHash = decodedHash;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
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
