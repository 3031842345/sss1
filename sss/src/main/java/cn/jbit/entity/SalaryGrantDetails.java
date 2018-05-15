package cn.jbit.entity;

/**
 * н�귢����ϸ��Ϣ SalaryGrantDetails entity. @author MyEclipse Persistence Tools
 */

public class SalaryGrantDetails implements java.io.Serializable {

	// Fields

	private Integer grdId;
	private String salaryGrantId;// н�귢�ű��
	private String humanId;// �������
	private String humanName;// ����
	private Double bounsSum;// �������
	private Double saleSum;// ���ۼ�Ч���
	private Double deductSum;// Ӧ�۽��
	private Double salaryStandardSum;// ��׼н���ܶ�
	private Double salaryPaidSum;// ʵ��н���ܶ�

	// Constructors

	/** default constructor */
	public SalaryGrantDetails() {
	}

	/** full constructor */
	public SalaryGrantDetails(String salaryGrantId, String humanId,
			String humanName, Double bounsSum, Double saleSum,
			Double deductSum, Double salaryStandardSum, Double salaryPaidSum) {
		this.salaryGrantId = salaryGrantId;
		this.humanId = humanId;
		this.humanName = humanName;
		this.bounsSum = bounsSum;
		this.saleSum = saleSum;
		this.deductSum = deductSum;
		this.salaryStandardSum = salaryStandardSum;
		this.salaryPaidSum = salaryPaidSum;
	}

	// Property accessors

	public Integer getGrdId() {
		return this.grdId;
	}

	public void setGrdId(Integer grdId) {
		this.grdId = grdId;
	}

	public String getSalaryGrantId() {
		return this.salaryGrantId;
	}

	public void setSalaryGrantId(String salaryGrantId) {
		this.salaryGrantId = salaryGrantId;
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

	public Double getBounsSum() {
		return this.bounsSum;
	}

	public void setBounsSum(Double bounsSum) {
		this.bounsSum = bounsSum;
	}

	public Double getSaleSum() {
		return this.saleSum;
	}

	public void setSaleSum(Double saleSum) {
		this.saleSum = saleSum;
	}

	public Double getDeductSum() {
		return this.deductSum;
	}

	public void setDeductSum(Double deductSum) {
		this.deductSum = deductSum;
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

}