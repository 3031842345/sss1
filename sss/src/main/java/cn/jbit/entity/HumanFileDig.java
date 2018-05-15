package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * 记录人力资源档案所做的更改信息 HumanFileDig entity. @author MyEclipse Persistence Tools
 */

public class HumanFileDig implements java.io.Serializable {

	// Fields

	private Integer hfdId;
	private String humanId;// 档案编号
	private String firstKindId;// 一级机构编号
	private String firstKindName;// 一级机构名称
	private String secondKindId;// 二级机构编号
	private String secondKindName;// 二级机构名称
	private String thirdKindId;// 三级机构编号
	private String thirdKindName;// 三级机构名称
	private String humanName;// 姓名
	private String humanAddress;// 地址
	private String humanPostcode;// 邮政编号
	private String humanProDesignation;// 职称
	private String humanMajorKindId;// 职位分类编号
	private String humanMajorKindName;// 职位分类名称
	private String humanMajorId;// 职位编号
	private String hunmaMajorName;// 职位名称
	private String humanTelephone;// 电话
	private String humanMobilephone;// 手机号码
	private String humanBank;// 开户银行
	private String humanAccount;// 银行账号
	private String humanQq;// QQ号码
	private String humanEmail;// 电子邮件
	private String humanHobby;// 爱好
	private String humanSpeciality;// 特长
	private String humanSex;// 性别
	private String humanReligion;// 宗教信仰
	private String humanParty;// 政治面貌
	private String humanNationality;// 国籍
	private String humanRace;// 民族
	private Timestamp humanBirthday;// 出生日期
	private String humanBirthplace;// 出生地
	private Short humanAge;// 年龄
	private String humanEducatedDegree;// 学历
	private Integer humanEducatedYears;// 教育年限
	private String humanEducatedMajor;// 学历专业
	private String humanSocietySecurityId;// 社会保障号
	private String humanIdCard;// 身份证号
	private String remark;// 备注
	private String salaryStandardId;// 薪酬标准编号
	private String salaryStandardName;// 薪酬标准名称
	private Double salarySum;// 基本薪酬总额
	private Double demandSalaraySum;// 应发薪酬总额
	private Double paidSalarySum;// 实发薪酬总额
	private Integer majorChangeAmount;// 调动次数
	private Integer bonusAmount;// 激励累计次数
	private Integer trainingAmount;// 培训累计次数
	private Integer fileChangAmount;// 档案变更累计次数
	private String humanHistroyRecords;// 简历
	private String humanFamilyMembership;// 家庭关系
	private String humanPicture;// 相片
	private String attachmentName;// 附件名称
	private Integer checkStatus;// 复核状态
	private String register;// 档案登记人
	private String checker;// 档案复核人
	private String changer;// 档案变更人
	private Timestamp registTime;// 档案登记时间
	private Timestamp checkTime;// 档案复核时间
	private Timestamp changeTime;// 档案变更时间
	private Timestamp lastlyChangeTime;// 档案最近更改时间
	private Timestamp deleteTime;// 档案删除时间
	private Timestamp recoveryTime;// 档案恢复时间
	private String humanFileStatus;// 档案状态

	// Constructors

	/** default constructor */
	public HumanFileDig() {
	}

	/** minimal constructor */
	public HumanFileDig(String humanIdCard) {
		this.humanIdCard = humanIdCard;
	}

	/** full constructor */
	public HumanFileDig(String humanId, String firstKindId,
			String firstKindName, String secondKindId, String secondKindName,
			String thirdKindId, String thirdKindName, String humanName,
			String humanAddress, String humanPostcode,
			String humanProDesignation, String humanMajorKindId,
			String humanMajorKindName, String humanMajorId,
			String hunmaMajorName, String humanTelephone,
			String humanMobilephone, String humanBank, String humanAccount,
			String humanQq, String humanEmail, String humanHobby,
			String humanSpeciality, String humanSex, String humanReligion,
			String humanParty, String humanNationality, String humanRace,
			Timestamp humanBirthday, String humanBirthplace, Short humanAge,
			String humanEducatedDegree, Integer humanEducatedYears,
			String humanEducatedMajor, String humanSocietySecurityId,
			String humanIdCard, String remark, String salaryStandardId,
			String salaryStandardName, Double salarySum,
			Double demandSalaraySum, Double paidSalarySum,
			Integer majorChangeAmount, Integer bonusAmount,
			Integer trainingAmount, Integer fileChangAmount,
			String humanHistroyRecords, String humanFamilyMembership,
			String humanPicture, String attachmentName, Integer checkStatus,
			String register, String checker, String changer,
			Timestamp registTime, Timestamp checkTime, Timestamp changeTime,
			Timestamp lastlyChangeTime, Timestamp deleteTime,
			Timestamp recoveryTime, String humanFileStatus) {
		this.humanId = humanId;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.thirdKindId = thirdKindId;
		this.thirdKindName = thirdKindName;
		this.humanName = humanName;
		this.humanAddress = humanAddress;
		this.humanPostcode = humanPostcode;
		this.humanProDesignation = humanProDesignation;
		this.humanMajorKindId = humanMajorKindId;
		this.humanMajorKindName = humanMajorKindName;
		this.humanMajorId = humanMajorId;
		this.hunmaMajorName = hunmaMajorName;
		this.humanTelephone = humanTelephone;
		this.humanMobilephone = humanMobilephone;
		this.humanBank = humanBank;
		this.humanAccount = humanAccount;
		this.humanQq = humanQq;
		this.humanEmail = humanEmail;
		this.humanHobby = humanHobby;
		this.humanSpeciality = humanSpeciality;
		this.humanSex = humanSex;
		this.humanReligion = humanReligion;
		this.humanParty = humanParty;
		this.humanNationality = humanNationality;
		this.humanRace = humanRace;
		this.humanBirthday = humanBirthday;
		this.humanBirthplace = humanBirthplace;
		this.humanAge = humanAge;
		this.humanEducatedDegree = humanEducatedDegree;
		this.humanEducatedYears = humanEducatedYears;
		this.humanEducatedMajor = humanEducatedMajor;
		this.humanSocietySecurityId = humanSocietySecurityId;
		this.humanIdCard = humanIdCard;
		this.remark = remark;
		this.salaryStandardId = salaryStandardId;
		this.salaryStandardName = salaryStandardName;
		this.salarySum = salarySum;
		this.demandSalaraySum = demandSalaraySum;
		this.paidSalarySum = paidSalarySum;
		this.majorChangeAmount = majorChangeAmount;
		this.bonusAmount = bonusAmount;
		this.trainingAmount = trainingAmount;
		this.fileChangAmount = fileChangAmount;
		this.humanHistroyRecords = humanHistroyRecords;
		this.humanFamilyMembership = humanFamilyMembership;
		this.humanPicture = humanPicture;
		this.attachmentName = attachmentName;
		this.checkStatus = checkStatus;
		this.register = register;
		this.checker = checker;
		this.changer = changer;
		this.registTime = registTime;
		this.checkTime = checkTime;
		this.changeTime = changeTime;
		this.lastlyChangeTime = lastlyChangeTime;
		this.deleteTime = deleteTime;
		this.recoveryTime = recoveryTime;
		this.humanFileStatus = humanFileStatus;
	}

	// Property accessors

	public Integer getHfdId() {
		return this.hfdId;
	}

	public void setHfdId(Integer hfdId) {
		this.hfdId = hfdId;
	}

	public String getHumanId() {
		return this.humanId;
	}

	public void setHumanId(String humanId) {
		this.humanId = humanId;
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

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getHumanAddress() {
		return this.humanAddress;
	}

	public void setHumanAddress(String humanAddress) {
		this.humanAddress = humanAddress;
	}

	public String getHumanPostcode() {
		return this.humanPostcode;
	}

	public void setHumanPostcode(String humanPostcode) {
		this.humanPostcode = humanPostcode;
	}

	public String getHumanProDesignation() {
		return this.humanProDesignation;
	}

	public void setHumanProDesignation(String humanProDesignation) {
		this.humanProDesignation = humanProDesignation;
	}

	public String getHumanMajorKindId() {
		return this.humanMajorKindId;
	}

	public void setHumanMajorKindId(String humanMajorKindId) {
		this.humanMajorKindId = humanMajorKindId;
	}

	public String getHumanMajorKindName() {
		return this.humanMajorKindName;
	}

	public void setHumanMajorKindName(String humanMajorKindName) {
		this.humanMajorKindName = humanMajorKindName;
	}

	public String getHumanMajorId() {
		return this.humanMajorId;
	}

	public void setHumanMajorId(String humanMajorId) {
		this.humanMajorId = humanMajorId;
	}

	public String getHunmaMajorName() {
		return this.hunmaMajorName;
	}

	public void setHunmaMajorName(String hunmaMajorName) {
		this.hunmaMajorName = hunmaMajorName;
	}

	public String getHumanTelephone() {
		return this.humanTelephone;
	}

	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}

	public String getHumanMobilephone() {
		return this.humanMobilephone;
	}

	public void setHumanMobilephone(String humanMobilephone) {
		this.humanMobilephone = humanMobilephone;
	}

	public String getHumanBank() {
		return this.humanBank;
	}

	public void setHumanBank(String humanBank) {
		this.humanBank = humanBank;
	}

	public String getHumanAccount() {
		return this.humanAccount;
	}

	public void setHumanAccount(String humanAccount) {
		this.humanAccount = humanAccount;
	}

	public String getHumanQq() {
		return this.humanQq;
	}

	public void setHumanQq(String humanQq) {
		this.humanQq = humanQq;
	}

	public String getHumanEmail() {
		return this.humanEmail;
	}

	public void setHumanEmail(String humanEmail) {
		this.humanEmail = humanEmail;
	}

	public String getHumanHobby() {
		return this.humanHobby;
	}

	public void setHumanHobby(String humanHobby) {
		this.humanHobby = humanHobby;
	}

	public String getHumanSpeciality() {
		return this.humanSpeciality;
	}

	public void setHumanSpeciality(String humanSpeciality) {
		this.humanSpeciality = humanSpeciality;
	}

	public String getHumanSex() {
		return this.humanSex;
	}

	public void setHumanSex(String humanSex) {
		this.humanSex = humanSex;
	}

	public String getHumanReligion() {
		return this.humanReligion;
	}

	public void setHumanReligion(String humanReligion) {
		this.humanReligion = humanReligion;
	}

	public String getHumanParty() {
		return this.humanParty;
	}

	public void setHumanParty(String humanParty) {
		this.humanParty = humanParty;
	}

	public String getHumanNationality() {
		return this.humanNationality;
	}

	public void setHumanNationality(String humanNationality) {
		this.humanNationality = humanNationality;
	}

	public String getHumanRace() {
		return this.humanRace;
	}

	public void setHumanRace(String humanRace) {
		this.humanRace = humanRace;
	}

	public Timestamp getHumanBirthday() {
		return this.humanBirthday;
	}

	public void setHumanBirthday(Timestamp humanBirthday) {
		this.humanBirthday = humanBirthday;
	}

	public String getHumanBirthplace() {
		return this.humanBirthplace;
	}

	public void setHumanBirthplace(String humanBirthplace) {
		this.humanBirthplace = humanBirthplace;
	}

	public Short getHumanAge() {
		return this.humanAge;
	}

	public void setHumanAge(Short humanAge) {
		this.humanAge = humanAge;
	}

	public String getHumanEducatedDegree() {
		return this.humanEducatedDegree;
	}

	public void setHumanEducatedDegree(String humanEducatedDegree) {
		this.humanEducatedDegree = humanEducatedDegree;
	}

	public Integer getHumanEducatedYears() {
		return this.humanEducatedYears;
	}

	public void setHumanEducatedYears(Integer humanEducatedYears) {
		this.humanEducatedYears = humanEducatedYears;
	}

	public String getHumanEducatedMajor() {
		return this.humanEducatedMajor;
	}

	public void setHumanEducatedMajor(String humanEducatedMajor) {
		this.humanEducatedMajor = humanEducatedMajor;
	}

	public String getHumanSocietySecurityId() {
		return this.humanSocietySecurityId;
	}

	public void setHumanSocietySecurityId(String humanSocietySecurityId) {
		this.humanSocietySecurityId = humanSocietySecurityId;
	}

	public String getHumanIdCard() {
		return this.humanIdCard;
	}

	public void setHumanIdCard(String humanIdCard) {
		this.humanIdCard = humanIdCard;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public Double getDemandSalaraySum() {
		return this.demandSalaraySum;
	}

	public void setDemandSalaraySum(Double demandSalaraySum) {
		this.demandSalaraySum = demandSalaraySum;
	}

	public Double getPaidSalarySum() {
		return this.paidSalarySum;
	}

	public void setPaidSalarySum(Double paidSalarySum) {
		this.paidSalarySum = paidSalarySum;
	}

	public Integer getMajorChangeAmount() {
		return this.majorChangeAmount;
	}

	public void setMajorChangeAmount(Integer majorChangeAmount) {
		this.majorChangeAmount = majorChangeAmount;
	}

	public Integer getBonusAmount() {
		return this.bonusAmount;
	}

	public void setBonusAmount(Integer bonusAmount) {
		this.bonusAmount = bonusAmount;
	}

	public Integer getTrainingAmount() {
		return this.trainingAmount;
	}

	public void setTrainingAmount(Integer trainingAmount) {
		this.trainingAmount = trainingAmount;
	}

	public Integer getFileChangAmount() {
		return this.fileChangAmount;
	}

	public void setFileChangAmount(Integer fileChangAmount) {
		this.fileChangAmount = fileChangAmount;
	}

	public String getHumanHistroyRecords() {
		return this.humanHistroyRecords;
	}

	public void setHumanHistroyRecords(String humanHistroyRecords) {
		this.humanHistroyRecords = humanHistroyRecords;
	}

	public String getHumanFamilyMembership() {
		return this.humanFamilyMembership;
	}

	public void setHumanFamilyMembership(String humanFamilyMembership) {
		this.humanFamilyMembership = humanFamilyMembership;
	}

	public String getHumanPicture() {
		return this.humanPicture;
	}

	public void setHumanPicture(String humanPicture) {
		this.humanPicture = humanPicture;
	}

	public String getAttachmentName() {
		return this.attachmentName;
	}

	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
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

	public Timestamp getLastlyChangeTime() {
		return this.lastlyChangeTime;
	}

	public void setLastlyChangeTime(Timestamp lastlyChangeTime) {
		this.lastlyChangeTime = lastlyChangeTime;
	}

	public Timestamp getDeleteTime() {
		return this.deleteTime;
	}

	public void setDeleteTime(Timestamp deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Timestamp getRecoveryTime() {
		return this.recoveryTime;
	}

	public void setRecoveryTime(Timestamp recoveryTime) {
		this.recoveryTime = recoveryTime;
	}

	public String getHumanFileStatus() {
		return this.humanFileStatus;
	}

	public void setHumanFileStatus(String humanFileStatus) {
		this.humanFileStatus = humanFileStatus;
	}

}