package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * 职位调动表 MajorChange entity. @author MyEclipse Persistence Tools
 */

public class MajorChange implements java.io.Serializable {

	// Fields

	private Integer mchId;
	private String firstKindId;// 一级机构编号
	private String firstKindName;// 一级机构名称
	private String secondKindId;// 二级机构编号
	private String secondKindName;// 二级机构名称
	private String thirdKindId;// 三级机构编号
	private String thirdKindName;// 三级机构名称
	private String majorKindId;// 职位分类编号
	private String majorKindName;// 职位分类名称
	private String majorId;// 职位编号
	private String majorName;// 职位名称
	private String newFirstKindId;// 新一级机构编号
	private String newFirstKindName;// 新一级机构名称
	private String newSecondKindId;// 新二级机构编号
	private String newSecondKindName;// 新二级机构名称
	private String newThirdKindId;// 新三级机构编号
	private String newThirdKindName;// 新三级机构名称
	private String newMajorKindId;// 新职位分类编号
	private String newMajorKindName;// 新职位分类名称
	private String newMajorId;// 新职位编号
	private String newMajorName;// 新职位编号名称
	private String humanId;// 人力资源档案编号
	private String humanName;// 姓名
	private String salaryStandardId;// 薪酬标准编号
	private String salaryStandardName;// 薪酬标准名称
	private Double salarySum;// 薪酬总额
	private String newSalaryStandardId;// 新薪酬标准编号
	private String newSalaryStandardName;// 新薪酬标准名称
	private Double newSalarySum;// 新薪酬总额
	private String changeReason;// 调动原因
	private String checkReason;// 审核通过意见
	private Integer checkStatus;// 复核通过状态
	private String register;// 登记人
	private String checker;// 复核人
	private Timestamp registTime;// 登记时间
	private Timestamp checkTime;// 复核时间

	// Constructors

	/** default constructor */
	public MajorChange() {
	}

	/** full constructor */
	public MajorChange(String firstKindId, String firstKindName,
			String secondKindId, String secondKindName, String thirdKindId,
			String thirdKindName, String majorKindId, String majorKindName,
			String majorId, String majorName, String newFirstKindId,
			String newFirstKindName, String newSecondKindId,
			String newSecondKindName, String newThirdKindId,
			String newThirdKindName, String newMajorKindId,
			String newMajorKindName, String newMajorId, String newMajorName,
			String humanId, String humanName, String salaryStandardId,
			String salaryStandardName, Double salarySum,
			String newSalaryStandardId, String newSalaryStandardName,
			Double newSalarySum, String changeReason, String checkReason,
			Integer checkStatus, String register, String checker,
			Timestamp registTime, Timestamp checkTime) {
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.newFirstKindId = newFirstKindId;
		this.newFirstKindName = newFirstKindName;
		this.newSecondKindId = newSecondKindId;
		this.newSecondKindName = newSecondKindName;
		this.newThirdKindId = newThirdKindId;
		this.newThirdKindName = newThirdKindName;
		this.newMajorKindId = newMajorKindId;
		this.newMajorKindName = newMajorKindName;
		this.newMajorId = newMajorId;
		this.newMajorName = newMajorName;
		this.humanId = humanId;
		this.humanName = humanName;
		this.salaryStandardId = salaryStandardId;
		this.salaryStandardName = salaryStandardName;
		this.salarySum = salarySum;
		this.newSalaryStandardId = newSalaryStandardId;
		this.newSalaryStandardName = newSalaryStandardName;
		this.newSalarySum = newSalarySum;
		this.changeReason = changeReason;
		this.checkReason = checkReason;
		this.checkStatus = checkStatus;
		this.register = register;
		this.checker = checker;
		this.registTime = registTime;
		this.checkTime = checkTime;
	}

	// Property accessors

	public Integer getMchId() {
		return this.mchId;
	}

	public void setMchId(Integer mchId) {
		this.mchId = mchId;
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

	public String getNewFirstKindId() {
		return this.newFirstKindId;
	}

	public void setNewFirstKindId(String newFirstKindId) {
		this.newFirstKindId = newFirstKindId;
	}

	public String getNewFirstKindName() {
		return this.newFirstKindName;
	}

	public void setNewFirstKindName(String newFirstKindName) {
		this.newFirstKindName = newFirstKindName;
	}

	public String getNewSecondKindId() {
		return this.newSecondKindId;
	}

	public void setNewSecondKindId(String newSecondKindId) {
		this.newSecondKindId = newSecondKindId;
	}

	public String getNewSecondKindName() {
		return this.newSecondKindName;
	}

	public void setNewSecondKindName(String newSecondKindName) {
		this.newSecondKindName = newSecondKindName;
	}

	public String getNewThirdKindId() {
		return this.newThirdKindId;
	}

	public void setNewThirdKindId(String newThirdKindId) {
		this.newThirdKindId = newThirdKindId;
	}

	public String getNewThirdKindName() {
		return this.newThirdKindName;
	}

	public void setNewThirdKindName(String newThirdKindName) {
		this.newThirdKindName = newThirdKindName;
	}

	public String getNewMajorKindId() {
		return this.newMajorKindId;
	}

	public void setNewMajorKindId(String newMajorKindId) {
		this.newMajorKindId = newMajorKindId;
	}

	public String getNewMajorKindName() {
		return this.newMajorKindName;
	}

	public void setNewMajorKindName(String newMajorKindName) {
		this.newMajorKindName = newMajorKindName;
	}

	public String getNewMajorId() {
		return this.newMajorId;
	}

	public void setNewMajorId(String newMajorId) {
		this.newMajorId = newMajorId;
	}

	public String getNewMajorName() {
		return this.newMajorName;
	}

	public void setNewMajorName(String newMajorName) {
		this.newMajorName = newMajorName;
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

	public String getSalaryStandardId() {
		return this.salaryStandardId;
	}

	public void setSalaryStandardId(String salaryStandardId) {
		this.salaryStandardId = salaryStandardId;
	}

	public String getSalaryStandardName() {
		return this.salaryStandardName;
	}

	public void setSalaryStandardName(String salaryStandardName) {
		this.salaryStandardName = salaryStandardName;
	}

	public Double getSalarySum() {
		return this.salarySum;
	}

	public void setSalarySum(Double salarySum) {
		this.salarySum = salarySum;
	}

	public String getNewSalaryStandardId() {
		return this.newSalaryStandardId;
	}

	public void setNewSalaryStandardId(String newSalaryStandardId) {
		this.newSalaryStandardId = newSalaryStandardId;
	}

	public String getNewSalaryStandardName() {
		return this.newSalaryStandardName;
	}

	public void setNewSalaryStandardName(String newSalaryStandardName) {
		this.newSalaryStandardName = newSalaryStandardName;
	}

	public Double getNewSalarySum() {
		return this.newSalarySum;
	}

	public void setNewSalarySum(Double newSalarySum) {
		this.newSalarySum = newSalarySum;
	}

	public String getChangeReason() {
		return this.changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getCheckReason() {
		return this.checkReason;
	}

	public void setCheckReason(String checkReason) {
		this.checkReason = checkReason;
	}

	public Integer getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
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

}