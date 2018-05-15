package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * 激励登记表 Bonus entity. @author MyEclipse Persistence Tools
 */

public class Bonus implements java.io.Serializable {

	// Fields

	private Integer bonId;
	private String majorKindId;// 职位分类编号
	private String majorKindName;// 职位分类名称
	private String majorId;// 职位编号
	private String majorName;// 职位名称
	private String humanId;// 人力资源档案编号
	private String humanName;// 姓名
	private String bonusItem;// 激励项目名称
	private Double bonusWorth;// 激励价值
	private String bonusDegree;// 激励等级
	private String remark;// 备注
	private String register;// 登记人
	private String checker;// 复核人
	private Timestamp registTime;// 登记时间
	private Timestamp checkTime;// 复核时间
	private Integer checkStatus;// 复核状态

	// Constructors

	/** default constructor */
	public Bonus() {
	}

	/** full constructor */
	public Bonus(String majorKindId, String majorKindName, String majorId,
			String majorName, String humanId, String humanName,
			String bonusItem, Double bonusWorth, String bonusDegree,
			String remark, String register, String checker,
			Timestamp registTime, Timestamp checkTime, Integer checkStatus) {
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.humanId = humanId;
		this.humanName = humanName;
		this.bonusItem = bonusItem;
		this.bonusWorth = bonusWorth;
		this.bonusDegree = bonusDegree;
		this.remark = remark;
		this.register = register;
		this.checker = checker;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.checkStatus = checkStatus;
	}

	// Property accessors

	public Integer getBonId() {
		return this.bonId;
	}

	public void setBonId(Integer bonId) {
		this.bonId = bonId;
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

	public String getHumanId() {
		return this.humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getBonusItem() {
		return this.bonusItem;
	}

	public void setBonusItem(String bonusItem) {
		this.bonusItem = bonusItem;
	}

	public Double getBonusWorth() {
		return this.bonusWorth;
	}

	public void setBonusWorth(Double bonusWorth) {
		this.bonusWorth = bonusWorth;
	}

	public String getBonusDegree() {
		return this.bonusDegree;
	}

	public void setBonusDegree(String bonusDegree) {
		this.bonusDegree = bonusDegree;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
	}

	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public Integer getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

}