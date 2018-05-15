package cn.jbit.entity;

import java.sql.Timestamp;

/**
 * 试题题库登记表 EngageSubjects entity. @author MyEclipse Persistence Tools
 */

public class EngageSubjects implements java.io.Serializable {

	// Fields

	private Integer subId;
	private String firstKindId;// 试题一级编号
	private String firstKindName;// 试题一级名称
	private String secondKindId;// 试题二级编号
	private String secondKindName;// 试题二级名称
	private String register;// 登记人
	private Timestamp registTime;// 登记时间
	private String derivation;// 试题出处
	private String content;// 题干
	private String keyA;// 答案a
	private String keyB;// 答案b
	private String keyC;// 答案c
	private String keyD;// 答案d
	private String keyE;// 答案e
	private String correctKey;// 正确答案
	private String changer;// 变更人
	private Timestamp changeTime;// 变更时间

	// Constructors

	/** default constructor */
	public EngageSubjects() {
	}

	/** full constructor */
	public EngageSubjects(String firstKindId, String firstKindName,
			String secondKindId, String secondKindName, String register,
			Timestamp registTime, String derivation, String content,
			String keyA, String keyB, String keyC, String keyD, String keyE,
			String correctKey, String changer, Timestamp changeTime) {
		this.firstKindId = firstKindId;
		this.firstKindName = firstKindName;
		this.secondKindId = secondKindId;
		this.secondKindName = secondKindName;
		this.register = register;
		this.registTime = registTime;
		this.derivation = derivation;
		this.content = content;
		this.keyA = keyA;
		this.keyB = keyB;
		this.keyC = keyC;
		this.keyD = keyD;
		this.keyE = keyE;
		this.correctKey = correctKey;
		this.changer = changer;
		this.changeTime = changeTime;
	}

	// Property accessors

	public Integer getSubId() {
		return this.subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
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

	public String getDerivation() {
		return this.derivation;
	}

	public void setDerivation(String derivation) {
		this.derivation = derivation;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getKeyA() {
		return this.keyA;
	}

	public void setKeyA(String keyA) {
		this.keyA = keyA;
	}

	public String getKeyB() {
		return this.keyB;
	}

	public void setKeyB(String keyB) {
		this.keyB = keyB;
	}

	public String getKeyC() {
		return this.keyC;
	}

	public void setKeyC(String keyC) {
		this.keyC = keyC;
	}

	public String getKeyD() {
		return this.keyD;
	}

	public void setKeyD(String keyD) {
		this.keyD = keyD;
	}

	public String getKeyE() {
		return this.keyE;
	}

	public void setKeyE(String keyE) {
		this.keyE = keyE;
	}

	public String getCorrectKey() {
		return this.correctKey;
	}

	public void setCorrectKey(String correctKey) {
		this.correctKey = correctKey;
	}

	public String getChanger() {
		return this.changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Timestamp getChangeTime() {
		return this.changeTime;
	}

	public void setChangeTime(Timestamp changeTime) {
		this.changeTime = changeTime;
	}

}