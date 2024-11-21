package com.test1;

public class SecurityTokens {
	private Integer tokenCode;
	private String tokenType;
	private String tokenName;
	private String tokenDescription;
	private long authorizerId;
	private String owner;
	private String tokenDefinition;
	private long secureScore;
	private String creationDate;
	private String modifiedDate;

	public SecurityTokens() {

	}

	public SecurityTokens(Integer tokenCode, String tokenType, String tokenName, String tokenDescription,
			long authorizerId, String owner, String tokenDefinition, long secureScore, String creationDate,
			String modifiedDate) {
		super();
		this.tokenCode = tokenCode;
		this.tokenType = tokenType;
		this.tokenName = tokenName;
		this.tokenDescription = tokenDescription;
		this.authorizerId = authorizerId;
		this.owner = owner;
		this.tokenDefinition = tokenDefinition;
		this.secureScore = secureScore;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	public Integer getTokenCode() {
		return tokenCode;
	}

	public void setTokenCode(Integer tokenCode) {
		this.tokenCode = tokenCode;
	}

	public String getTokenType() {
		return tokenType;
	}

	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}

	public String getTokenName() {
		return tokenName;
	}

	public void setTokenName(String tokenName) {
		this.tokenName = tokenName;
	}

	public String getTokenDescription() {
		return tokenDescription;
	}

	public void setTokenDescription(String tokenDescription) {
		this.tokenDescription = tokenDescription;
	}

	public long getAuthorizerId() {
		return authorizerId;
	}

	public void setAuthorizerId(long authorizerId) {
		this.authorizerId = authorizerId;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getTokenDefinition() {
		return tokenDefinition;
	}

	public void setTokenDefinition(String tokenDefinition) {
		this.tokenDefinition = tokenDefinition;
	}

	public long getSecureScore() {
		return secureScore;
	}

	public void setSecureScore(long secureScore) {
		this.secureScore = secureScore;
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

}
