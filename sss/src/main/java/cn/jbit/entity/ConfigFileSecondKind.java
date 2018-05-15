package cn.jbit.entity;

/**
 * 二级机构设置
 * ConfigFileSecondKind entity. @author MyEclipse Persistence Tools
 */

public class ConfigFileSecondKind implements java.io.Serializable {

	// Fields

	private Integer fskId;
	private String firstKindId;//一级机构编号
	private String firstKindName;//一级机构名称
	private String secondKindId;//二级机构编号
	private String secondKindName;//二级机构名称
	private String secondSalaryId;//二级机构薪酬发放责任人编号
	private String secondSaleId;//二级机构销售责任人编号

	// Constructors

	/** default constructor */
	public ConfigFileSecondKind() {
	}

	/** full constructor */
	public ConfigFileSecondKind(String firstKindId, String firstKindName,
			String secondKindId, String secondKindName, String secondSalaryId,
			String secondSaleId) {
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.secondSalaryId = secondSalaryId;
		this.secondSaleId = secondSaleId;
	}

	// Property accessors

	public Integer getFskId() {
		return this.fskId;
	}

	public void setFskId(Integer fskId) {
		this.fskId = fskId;
	}

	public String getFirstKindId() {
		return this.firstKindId;
	}

	public void setFirstKindId(String firstKindId) {
		this.firstKindId = firstKindId;
	}

	public String getFirstKindName() {
		return this.firstKindName;
	}

	public void setFirstKindName(String firstKindName) {
		this.firstKindName = firstKindName;
	}

	public String getSecondKindId() {
		return this.secondKindId;
	}

	public void setSecondKindId(String secondKindId) {
		this.secondKindId = secondKindId;
	}

	public String getSecondKindName() {
		return this.secondKindName;
	}

	public void setSecondKindName(String secondKindName) {
		this.secondKindName = secondKindName;
	}

	public String getSecondSalaryId() {
		return this.secondSalaryId;
	}

	public void setSecondSalaryId(String secondSalaryId) {
		this.secondSalaryId = secondSalaryId;
	}

	public String getSecondSaleId() {
		return this.secondSaleId;
	}

	public void setSecondSaleId(String secondSaleId) {
		this.secondSaleId = secondSaleId;
	}

}