package cn.jbit.entity;

/**
 * 一级机构设置
 * ConfigFileFirstKind entity. @author MyEclipse Persistence Tools
 */
public class ConfigFileFirstKind implements java.io.Serializable {

	// Fields

	private Integer ffkId;//
	private String firstKindId;//一级机构编号
	private String firstKindName;//一级结构名称
	private String firstKindSalaryId;//一级机构薪酬发送责任
	private String firstKindSaleId;//一级机构销售责任人缴费

	// Constructors

	/** default constructor */
	public ConfigFileFirstKind() {
	}

	/** full constructor */
	public ConfigFileFirstKind(String firstKindId, String firstKindName,
			String firstKindSalaryId, String firstKindSaleId) {
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.firstKindSalaryId = firstKindSalaryId;
		this.firstKindSaleId = firstKindSaleId;
	}

	// Property accessors

	public Integer getFfkId() {
		return this.ffkId;
	}

	public void setFfkId(Integer ffkId) {
		this.ffkId = ffkId;
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

	public String getFirstKindSalaryId() {
		return this.firstKindSalaryId;
	}

	public void setFirstKindSalaryId(String firstKindSalaryId) {
		this.firstKindSalaryId = firstKindSalaryId;
	}

	public String getFirstKindSaleId() {
		return this.firstKindSaleId;
	}

	public void setFirstKindSaleId(String firstKindSaleId) {
		this.firstKindSaleId = firstKindSaleId;
	}

}