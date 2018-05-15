package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * 简历管理 EngageResume entity. @author MyEclipse Persistence Tools
 */

public class EngageResume implements java.io.Serializable {

	// Fields

	private Integer resId;
	private String humanName;//姓名
	private String engageType;//招聘类型
	private String humanAddress;//地址
	private String humanPostcode;//邮编
	private String humanMajorKindId;//职位分类编号
	private String humanMajorKindName;//职位分类名称
	private String humanMajorId;//职位编号
	private String humanMajorName;//职位名称
	private String humanTelephone;//电话号码
	private String humanHomephone;//家庭电话
	private String humanMobilephone;//手机
	private String humanEmail;//Email
	private String humanHobby;//兴趣爱好
	private String humanSpecility;//特长
	private String humanSex;//性别
	private String humanReligion;//宗教信仰
	private String humanParty;//政治面貌
	private String humanNationality;//国籍
	private String humanRace;//民族
	private Timestamp humanBirthday;//生日
	private Integer humanAge;//年龄
	private String humanEducatedDegree;//教育程度
	private Integer humanEducatedYears;//教育年限
	private String humanEducatedMajor;//专业
	private String humanCollege;//毕业学院
	private String humanIdcare;//身份证号
	private String humanBirthplace;//出生地
	private Double demandSalaryStandard;//薪酬标准
	private String humanHistoryRecords;//个人履历
	private String remark;//备注
	private String recomandation;//推荐意见
	private String humanPicture;//照片
	private String attachmentName;//档案附件
	private Integer checkStatus;//复核状态
	private String register;//登记人
	private Timestamp registTime;//登记时间
	private String checker;//复核人姓名
	private Timestamp checkTime;//复核时间
	private Integer interviewStatus;//面试状态
	private Float totalPoints;//总分
	private Integer testAmount;//考试次数
	private String testChecker;//测试复核人
	private Timestamp testCheckTime;//测试复核时间
	private String passRegister;//通过登记人姓名
	private Timestamp passRegistTime;//通过登记时间
	private String passChecker;//通过复核姓名
	private Timestamp passCheckTime;//通过复核时间
	private Integer passCheckStatus;//通过的复核状态
	private String passCheckComment;//录用的申请审核意见
	private String passPassComment;//录用的申请审批意见

	// Constructors

	/** default constructor */
	public EngageResume() {
	}

	/** full constructor */
	public EngageResume(String humanName, String engageType,
			String humanAddress, String humanPostcode, String humanMajorKindId,
			String humanMajorKindName, String humanMajorId,
			String humanMajorName, String humanTelephone,
			String humanHomephone, String humanMobilephone, String humanEmail,
			String humanHobby, String humanSpecility, String humanSex,
			String humanReligion, String humanParty, String humanNationality,
			String humanRace, Timestamp humanBirthday, Integer humanAge,
			String humanEducatedDegree, Integer humanEducatedYears,
			String humanEducatedMajor, String humanCollege, String humanIdcare,
			String humanBirthplace, Double demandSalaryStandard,
			String humanHistoryRecords, String remark, String recomandation,
			String humanPicture, String attachmentName, Integer checkStatus,
			String register, Timestamp registTime, String checker,
			Timestamp checkTime, Integer interviewStatus, Float totalPoints,
			Integer testAmount, String testChecker, Timestamp testCheckTime,
			String passRegister, Timestamp passRegistTime, String passChecker,
			Timestamp passCheckTime, Integer passCheckStatus,
			String passCheckComment, String passPassComment) {
		this.humanName = humanName;
		this.engageType = engageType;
		this.humanAddress = humanAddress;
		this.humanPostcode = humanPostcode;
		this.humanMajorKindId = humanMajorKindId;
		this.humanMajorKindName = humanMajorKindName;
		this.humanMajorId = humanMajorId;
		this.humanMajorName = humanMajorName;
		this.humanTelephone = humanTelephone;
		this.humanHomephone = humanHomephone;
		this.humanMobilephone = humanMobilephone;
		this.humanEmail = humanEmail;
		this.humanHobby = humanHobby;
		this.humanSpecility = humanSpecility;
		this.humanSex = humanSex;
		this.humanReligion = humanReligion;
		this.humanParty = humanParty;
		this.humanNationality = humanNationality;
		this.humanRace = humanRace;
		this.humanBirthday = humanBirthday;
		this.humanAge = humanAge;
		this.humanEducatedDegree = humanEducatedDegree;
		this.humanEducatedYears = humanEducatedYears;
		this.humanEducatedMajor = humanEducatedMajor;
		this.humanCollege = humanCollege;
		this.humanIdcare = humanIdcare;
		this.humanBirthplace = humanBirthplace;
		this.demandSalaryStandard = demandSalaryStandard;
		this.humanHistoryRecords = humanHistoryRecords;
		this.remark = remark;
		this.recomandation = recomandation;
		this.humanPicture = humanPicture;
		this.attachmentName = attachmentName;
		this.checkStatus = checkStatus;
		this.register = register;
		this.registTime = registTime;
		this.checker = checker;
		this.checkTime = checkTime;
		this.interviewStatus = interviewStatus;
		this.totalPoints = totalPoints;
		this.testAmount = testAmount;
		this.testChecker = testChecker;
		this.testCheckTime = testCheckTime;
		this.passRegister = passRegister;
		this.passRegistTime = passRegistTime;
		this.passChecker = passChecker;
		this.passCheckTime = passCheckTime;
		this.passCheckStatus = passCheckStatus;
		this.passCheckComment = passCheckComment;
		this.passPassComment = passPassComment;
	}

	// Property accessors

	public Integer getResId() {
		return this.resId;
	}

	public void setResId(Integer resId) {
		this.resId = resId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getEngageType() {
		return this.engageType;
	}

	public void setEngageType(String engageType) {
		this.engageType = engageType;
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

	public String getHumanMajorName() {
		return this.humanMajorName;
	}

	public void setHumanMajorName(String humanMajorName) {
		this.humanMajorName = humanMajorName;
	}

	public String getHumanTelephone() {
		return this.humanTelephone;
	}

	public void setHumanTelephone(String humanTelephone) {
		this.humanTelephone = humanTelephone;
	}

	public String getHumanHomephone() {
		return this.humanHomephone;
	}

	public void setHumanHomephone(String humanHomephone) {
		this.humanHomephone = humanHomephone;
	}

	public String getHumanMobilephone() {
		return this.humanMobilephone;
	}

	public void setHumanMobilephone(String humanMobilephone) {
		this.humanMobilephone = humanMobilephone;
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

	public String getHumanSpecility() {
		return this.humanSpecility;
	}

	public void setHumanSpecility(String humanSpecility) {
		this.humanSpecility = humanSpecility;
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

	public Integer getHumanAge() {
		return this.humanAge;
	}

	public void setHumanAge(Integer humanAge) {
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

	public String getHumanCollege() {
		return this.humanCollege;
	}

	public void setHumanCollege(String humanCollege) {
		this.humanCollege = humanCollege;
	}

	public String getHumanIdcare() {
		return this.humanIdcare;
	}

	public void setHumanIdcare(String humanIdcare) {
		this.humanIdcare = humanIdcare;
	}

	public String getHumanBirthplace() {
		return this.humanBirthplace;
	}

	public void setHumanBirthplace(String humanBirthplace) {
		this.humanBirthplace = humanBirthplace;
	}

	public Double getDemandSalaryStandard() {
		return this.demandSalaryStandard;
	}

	public void setDemandSalaryStandard(Double demandSalaryStandard) {
		this.demandSalaryStandard = demandSalaryStandard;
	}

	public String getHumanHistoryRecords() {
		return this.humanHistoryRecords;
	}

	public void setHumanHistoryRecords(String humanHistoryRecords) {
		this.humanHistoryRecords = humanHistoryRecords;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRecomandation() {
		return this.recomandation;
	}

	public void setRecomandation(String recomandation) {
		this.recomandation = recomandation;
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

	public Integer getInterviewStatus() {
		return this.interviewStatus;
	}

	public void setInterviewStatus(Integer interviewStatus) {
		this.interviewStatus = interviewStatus;
	}

	public Float getTotalPoints() {
		return this.totalPoints;
	}

	public void setTotalPoints(Float totalPoints) {
		this.totalPoints = totalPoints;
	}

	public Integer getTestAmount() {
		return this.testAmount;
	}

	public void setTestAmount(Integer testAmount) {
		this.testAmount = testAmount;
	}

	public String getTestChecker() {
		return this.testChecker;
	}

	public void setTestChecker(String testChecker) {
		this.testChecker = testChecker;
	}

	public Timestamp getTestCheckTime() {
		return this.testCheckTime;
	}

	public void setTestCheckTime(Timestamp testCheckTime) {
		this.testCheckTime = testCheckTime;
	}

	public String getPassRegister() {
		return this.passRegister;
	}

	public void setPassRegister(String passRegister) {
		this.passRegister = passRegister;
	}

	public Timestamp getPassRegistTime() {
		return this.passRegistTime;
	}

	public void setPassRegistTime(Timestamp passRegistTime) {
		this.passRegistTime = passRegistTime;
	}

	public String getPassChecker() {
		return this.passChecker;
	}

	public void setPassChecker(String passChecker) {
		this.passChecker = passChecker;
	}

	public Timestamp getPassCheckTime() {
		return this.passCheckTime;
	}

	public void setPassCheckTime(Timestamp passCheckTime) {
		this.passCheckTime = passCheckTime;
	}

	public Integer getPassCheckStatus() {
		return this.passCheckStatus;
	}

	public void setPassCheckStatus(Integer passCheckStatus) {
		this.passCheckStatus = passCheckStatus;
	}

	public String getPassCheckComment() {
		return this.passCheckComment;
	}

	public void setPassCheckComment(String passCheckComment) {
		this.passCheckComment = passCheckComment;
	}

	public String getPassPassComment() {
		return this.passPassComment;
	}

	public void setPassPassComment(String passPassComment) {
		this.passPassComment = passPassComment;
	}

}