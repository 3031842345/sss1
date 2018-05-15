package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * 考试答题登记表 EngageAnswer entity. @author MyEclipse Persistence Tools
 */

public class EngageAnswer implements java.io.Serializable {

	// Fields

	private Integer ansId;
	private String answerNumber;// 答题编号
	private String examNumber;// 试卷编号
	private Integer resumeId;// 简历编号
	private Integer interviewId;// 面试编号
	private String humanName;// 姓名
	private String humanIdcard;// 身份证号
	private String majorKindId;// 职位分类编号
	private String majorKindName;// 职位分类名称
	private String majorId;// 职位编号
	private String majorName;// 职位名称
	private Timestamp testTime;// 测试时间
	private String useTime;// 用时
	private Double totalPoint;// 总分

	// Constructors

	/** default constructor */
	public EngageAnswer() {
	}

	/** full constructor */
	public EngageAnswer(String answerNumber, String examNumber,
			Integer resumeId, Integer interviewId, String humanName,
			String humanIdcard, String majorKindId, String majorKindName,
			String majorId, String majorName, Timestamp testTime,
			String useTime, Double totalPoint) {
		this.answerNumber = answerNumber;
		this.examNumber = examNumber;
		this.resumeId = resumeId;
		this.interviewId = interviewId;
		this.humanName = humanName;
		this.humanIdcard = humanIdcard;
		this.majorKindId = majorKindId;
		this.majorKindName = majorKindName;
		this.majorId = majorId;
		this.majorName = majorName;
		this.testTime = testTime;
		this.useTime = useTime;
		this.totalPoint = totalPoint;
	}

	// Property accessors

	public Integer getAnsId() {
		return this.ansId;
	}

	public void setAnsId(Integer ansId) {
		this.ansId = ansId;
	}

	public String getAnswerNumber() {
		return this.answerNumber;
	}

	public void setAnswerNumber(String answerNumber) {
		this.answerNumber = answerNumber;
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
	}

	public Integer getResumeId() {
		return this.resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public Integer getInterviewId() {
		return this.interviewId;
	}

	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	public String getHumanName() {
		return this.humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getHumanIdcard() {
		return this.humanIdcard;
	}

	public void setHumanIdcard(String humanIdcard) {
		this.humanIdcard = humanIdcard;
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

	public Timestamp getTestTime() {
		return this.testTime;
	}

	public void setTestTime(Timestamp testTime) {
		this.testTime = testTime;
	}

	public String getUseTime() {
		return this.useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

	public Double getTotalPoint() {
		return this.totalPoint;
	}

	public void setTotalPoint(Double totalPoint) {
		this.totalPoint = totalPoint;
	}

}