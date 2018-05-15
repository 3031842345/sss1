package cn.jbit.entity;

/**
 * 职位设置
 * ConfigMajor entity. @author MyEclipse Persistence Tools
 */

public class ConfigMajor implements java.io.Serializable {

	// Fields

	private Integer makId;
	private String majorKindId;//职位分类编号
	private String majorKindName;//职位分类名称
	private String majorId;//职位编号
	private String majorName;//职位名称
	private Short testAmount;//题套数量(职位部门出的题目)

	// Constructors

	/** default constructor */
	public ConfigMajor() {
	}

	/** full constructor */
	public ConfigMajor(String majorKindId, String majorKindName,
			String majorId, String majorName, Short testAmount) {
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.testAmount = testAmount;
	}

	// Property accessors

	public Integer getMakId() {
		return this.makId;
	}

	public void setMakId(Integer makId) {
		this.makId = makId;
	}

	public String getMajorKindId() {
		return this.majorKindId;
	}

	public void setMajorKindId(String majorKindId) {
		this.majorKindId = majorKindId;
	}

	public String getMajorKindName() {
		return this.majorKindName;
	}

	public void setMajorKindName(String majorKindName) {
		this.majorKindName = majorKindName;
	}

	public String getMajorId() {
		return this.majorId;
	}

	public void setMajorId(String majorId) {
		this.majorId = majorId;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public Short getTestAmount() {
		return this.testAmount;
	}

	public void setTestAmount(Short testAmount) {
		this.testAmount = testAmount;
	}

}