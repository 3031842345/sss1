package cn.jbit.entity;

/**
 * 试卷详细信息 EngageExamDetails entity. @author MyEclipse Persistence Tools
 */

public class EngageExamDetails implements java.io.Serializable {

	// Fields

	private Integer exdId;
	private String examNumber;// 试卷编号
	private String firstKindId;// 试题一级分类编号
	private String firstKindName;// 试题一级分类名称
	private String secondKindId;// 试题二级分类编号
	private String secondKindName;// 试题二级分类名称
	private Short questionAmount;// 出题数量

	// Constructors

	/** default constructor */
	public EngageExamDetails() {
	}

	/** full constructor */
	public EngageExamDetails(String examNumber, String firstKindId,
			String firstKindName, String secondKindId, String secondKindName,
			Short questionAmount) {
		this.examNumber = examNumber;
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.questionAmount = questionAmount;
	}

	// Property accessors

	public Integer getExdId() {
		return this.exdId;
	}

	public void setExdId(Integer exdId) {
		this.exdId = exdId;
	}

	public String getExamNumber() {
		return this.examNumber;
	}

	public void setExamNumber(String examNumber) {
		this.examNumber = examNumber;
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

	public Short getQuestionAmount() {
		return this.questionAmount;
	}

	public void setQuestionAmount(Short questionAmount) {
		this.questionAmount = questionAmount;
	}

}