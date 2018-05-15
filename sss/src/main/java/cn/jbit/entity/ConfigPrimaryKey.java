package cn.jbit.entity;

/**
 * 关键字设置 
 *ConfigPrimaryKey entity. @author MyEclipse Persistence Tools
 */
public class ConfigPrimaryKey implements java.io.Serializable {

	// Fields

	private Integer prkId;
	private String primaryKeyTable;//关键字所涉及的数据库表名
	private String primaryKey;//关键字
	private String keyName;//中文关键字
	private Boolean primaryKeyStatus;//是否为关键字

	// Constructors

	/** default constructor */
	public ConfigPrimaryKey() {
	}

	/** full constructor */
	public ConfigPrimaryKey(String primaryKeyTable, String primaryKey,
			String keyName, Boolean primaryKeyStatus) {
		this.primaryKeyTable = primaryKeyTable;
		this.primaryKey = primaryKey;
		this.keyName = keyName;
		this.primaryKeyStatus = primaryKeyStatus;
	}

	// Property accessors

	public Integer getPrkId() {
		return this.prkId;
	}

	public void setPrkId(Integer prkId) {
		this.prkId = prkId;
	}

	public String getPrimaryKeyTable() {
		return this.primaryKeyTable;
	}

	public void setPrimaryKeyTable(String primaryKeyTable) {
		this.primaryKeyTable = primaryKeyTable;
	}

	public String getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public Boolean getPrimaryKeyStatus() {
		return this.primaryKeyStatus;
	}

	public void setPrimaryKeyStatus(Boolean primaryKeyStatus) {
		this.primaryKeyStatus = primaryKeyStatus;
	}

}