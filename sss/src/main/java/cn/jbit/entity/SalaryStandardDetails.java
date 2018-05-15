package cn.jbit.entity;

/**
 * 薪酬标准单详细信息 SalaryStandardDetails entity. @author MyEclipse Persistence Tools
 */

public class SalaryStandardDetails implements java.io.Serializable {

	// Fields

	private Integer sdtId;
	private String standardId;//薪酬标准单编号
	private String standardName;//薪酬标准单名称
	private Short itemId;//薪酬项目序号
	private String itemName;//薪酬项目名称
	private Double salary;//薪酬金额

	// Constructors

	/** default constructor */
	public SalaryStandardDetails() {
	}

	/** full constructor */
	public SalaryStandardDetails(String standardId, String standardName,
			Short itemId, String itemName, Double salary) {
		this.standardId = standardId;
		this.standardName = standardName;
		this.itemId = itemId;
		this.itemName = itemName;
		this.salary = salary;
	}

	// Property accessors

	public Integer getSdtId() {
		return this.sdtId;
	}

	public void setSdtId(Integer sdtId) {
		this.sdtId = sdtId;
	}

	public String getStandardId() {
		return this.standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

	public String getStandardName() {
		return this.standardName;
	}

	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}

	public Short getItemId() {
		return this.itemId;
	}

	public void setItemId(Short itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

}