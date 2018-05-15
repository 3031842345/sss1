package cn.jbit.entity;

/**
 * 三级机构设置
 * ConfigFileThirdKind entity. @author MyEclipse Persistence Tools
 */

public class ConfigFileThirdKind implements java.io.Serializable {

	// Fields

	private Integer ftkId;
	private String firstKindId;//一级机构编号
	private String firstKindName;//一级机构名称
	private String secondKindId;//二级机构编号
	private String secondKindName;//二级机构名称
	private String thirdKindId;//三级机构编号
	private String thirdKindName;//三级机构名称
	private String thirdKindSaleId;//三级机构销售责任人编号
	private String thirdKindIsRetail;//三级机构是否为零售店

	// Constructors

	/** default constructor */
	public ConfigFileThirdKind() {
	}

	/** full constructor */
	public ConfigFileThirdKind(String firstKindId, String firstKindName,
			String secondKindId, String secondKindName, String thirdKindId,
			String thirdKindName, String thirdKindSaleId,
			String thirdKindIsRetail) {
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.thirdKindSaleId = thirdKindSaleId;
		this.thirdKindIsRetail = thirdKindIsRetail;
	}

	// Property accessors

	public Integer getFtkId() {
		return this.ftkId;
	}

	public void setFtkId(Integer ftkId) {
		this.ftkId = ftkId;
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

	public String getThirdKindId() {
		return this.thirdKindId;
	}

	public void setThirdKindId(String thirdKindId) {
		this.thirdKindId = thirdKindId;
	}

	public String getThirdKindName() {
		return this.thirdKindName;
	}

	public void setThirdKindName(String thirdKindName) {
		this.thirdKindName = thirdKindName;
	}

	public String getThirdKindSaleId() {
		return this.thirdKindSaleId;
	}

	public void setThirdKindSaleId(String thirdKindSaleId) {
		this.thirdKindSaleId = thirdKindSaleId;
	}

	public String getThirdKindIsRetail() {
		return this.thirdKindIsRetail;
	}

	public void setThirdKindIsRetail(String thirdKindIsRetail) {
		this.thirdKindIsRetail = thirdKindIsRetail;
	}

}