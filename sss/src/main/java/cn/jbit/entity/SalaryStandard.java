package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * SalaryStandard entity. @author MyEclipse Persistence Tools
 */

public class SalaryStandard implements java.io.Serializable {

	// Fields

	private Integer ssdId;
	private String standardId;
	private String standardName;
	private String designer;
	private String register;
	private String checker;
	private String changer;
	private Timestamp registTime;
	private Timestamp checkTime;
	private Timestamp changeTime;
	private Integer salarySum;
	private Integer checkStatus;
	private Integer changeStatus;
	private Integer checkComment;
	private String remark;

	// Constructors

	/** default constructor */
	public SalaryStandard() {
	}

	/** full constructor */
	public SalaryStandard(String standardId, String standardName,
			String designer, String register, String checker, String changer,
			Timestamp registTime, Timestamp checkTime, Timestamp changeTime,
			Integer salarySum, Integer checkStatus, Integer changeStatus,
			Integer checkComment, String remark) {
		this.standardId = standardId;
		this.standardName = standardName;
		this.designer = designer;
		this.register = register;
		this.checker = checker;
		this.changer = changer;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.changeTime = changeTime;
		this.salarySum = salarySum;
		this.checkStatus = checkStatus;
		this.changeStatus = changeStatus;
		this.checkComment = checkComment;
		this.remark = remark;
	}

	// Property accessors

	public Integer getSsdId() {
		return this.ssdId;
	}

	public void setSsdId(Integer ssdId) {
		this.ssdId = ssdId;
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

	public String getDesigner() {
		return this.designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
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

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
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

	public Timestamp getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}

	public Integer getSalarySum() {
		return this.salarySum;
	}

	public void setSalarySum(Integer salarySum) {
		this.salarySum = salarySum;
	}

	public Integer getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Integer getChangeStatus() {
		return this.changeStatus;
	}

	public void setChangeStatus(Integer changeStatus) {
		this.changeStatus = changeStatus;
	}

	public Integer getCheckComment() {
		return this.checkComment;
	}

	public void setCheckComment(Integer checkComment) {
		this.checkComment = checkComment;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}