package cn.jbit.entity;

/**
 * Users entity. @author MyEclipse Persistence Tools
 * 用户表
 */
public class Users implements java.io.Serializable {

	// Fields

	private Integer UId;//用户id
	private String UName;//用户姓名
	private String UTrueName;//真实姓名
	private String UPassword;//密码

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String UName, String UTrueName, String UPassword) {
		this.UName = UName;
		this.UTrueName = UTrueName;
		this.UPassword = UPassword;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUTrueName() {
		return this.UTrueName;
	}

	public void setUTrueName(String UTrueName) {
		this.UTrueName = UTrueName;
	}

	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

}