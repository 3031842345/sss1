package cn.jbit.entity;

/**
 * 公共字段
 * ConfigPublicChar entity. @author MyEclipse Persistence Tools
 */
public class ConfigPublicChar implements java.io.Serializable {

	// Fields

	private Integer pbcId;
	private String attributeKind;//属性的种类
	private String attributeName;//属性的名称

	// Constructors

	/** default constructor */
	public ConfigPublicChar() {
	}

	/** full constructor */
	public ConfigPublicChar(String attributeKind, String attributeName) {
		this.attributeKind = attributeKind;
		this.attributeName = attributeName;
	}

	// Property accessors

	public Integer getPbcId() {
		return this.pbcId;
	}

	public void setPbcId(Integer pbcId) {
		this.pbcId = pbcId;
	}

	public String getAttributeKind() {
		return this.attributeKind;
	}

	public void setAttributeKind(String attributeKind) {
		this.attributeKind = attributeKind;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

}