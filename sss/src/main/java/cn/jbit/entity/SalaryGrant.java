package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * 薪酬发放登记表 SalaryGrant entity. @author MyEclipse Persistence Tools
 */

public class SalaryGrant implements java.io.Serializable {

	// Fields

	private Integer sgrId;
	private String salaryGrantId;// 薪酬发放编号
	private String salaryStandardId;// 薪酬标准单编号
	private String firstKindId;// 一级机构编号
	private String firstKindName;// 一级机构名称
	private String secondKindId;// 二级机构编号
	private String secondKindName;// 二级机构名称
	private String thirdKindId;// 三级机构编号
	private String thirdKindName;// 三级机构名称
	private Integer humanAmount;// 总人数
	private Double salaryStandardSum;// 标准薪酬总金额
	private Double salaryPaidSum;// 实发总金额
	private String register;// 登记人
	private Timestamp registTime;// 登记时间
	private String checker;// 复核人
	private Timestamp checkTime;// 复核时间
	private Integer checkStatus;// 复核状态

	// Constructors

	/** default constructor */
	public SalaryGrant() {
	}

	/** full constructor */
	public SalaryGrant(String salaryGrantId, String salaryStandardId,
			String firstKindId, String firstKindName, String secondKindId,
			String secondKindName, String thirdKindId, String thirdKindName,
			Integer humanAmount, Double salaryStandardSum,
			Double salaryPaidSum, String register, Timestamp registTime,
			String checker, Timestamp checkTime, Integer checkStatus) {
		this.salaryGrantId = salaryGrantId;
		this.salaryStandardId = salaryStandardId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.humanAmount = humanAmount;
		this.salaryStandardSum = salaryStandardSum;
		this.salaryPaidSum = salaryPaidSum;
		this.register = register;
		this.registTime = registTime;
		this.checker = checker;
		this.checkTime = checkTime;
		this.checkStatus = checkStatus;
	}

	// Property accessors

	public Integer getSgrId() {
		return this.sgrId;
	}

	public void setSgrId(Integer sgrId) {
		this.sgrId = sgrId;
	}

	public String getSalaryGrantId() {
		return this.salaryGrantId;
	}

	public void setSalaryGrantId(String salaryGrantId) {
		this.salaryGrantId = salaryGrantId;
	}

	public String getSalaryStandardId() {
		return this.salaryStandardId;
	}

	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
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

	public Integer getHumanAmount() {
		return this.humanAmount;
	}

	public void setHumanAmount(Integer humanAmount) {
		this.humanAmount = humanAmount;
	}

	public Double getSalaryStandardSum() {
		return this.salaryStandardSum;
	}

	public void setSalaryStandardSum(Double salaryStandardSum) {
		this.salaryStandardSum = salaryStandardSum;
	}

	public Double getSalaryPaidSum() {
		return this.salaryPaidSum;
	}

	public void setSalaryPaidSum(Double salaryPaidSum) {
		this.salaryPaidSum = salaryPaidSum;
	}

	public String getRegister() {
		return this.register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public Timestamp getRegistTime() {
		return this.registTime;
	}

	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}

	public String getChecker() {
		return this.checker;
	}

	public void setChecker(String checker) {
		this.checker = checker;
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