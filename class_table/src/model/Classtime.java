package model;

/**
 * Classtime entity. @author MyEclipse Persistence Tools
 */

public class Classtime implements java.io.Serializable {

	// Fields

	private Integer classOrder;
	private Integer classBegin;
	private Integer classEnd;

	// Constructors

	/** default constructor */
	public Classtime() {
	}

	/** full constructor */
	public Classtime(Integer classOrder, Integer classBegin, Integer classEnd) {
		this.classOrder = classOrder;
		this.classBegin = classBegin;
		this.classEnd = classEnd;
	}

	// Property accessors

	public Integer getClassOrder() {
		return this.classOrder;
	}

	public void setClassOrder(Integer classOrder) {
		this.classOrder = classOrder;
	}

	public Integer getClassBegin() {
		return this.classBegin;
	}

	public void setClassBegin(Integer classBegin) {
		this.classBegin = classBegin;
	}

	public Integer getClassEnd() {
		return this.classEnd;
	}

	public void setClassEnd(Integer classEnd) {
		this.classEnd = classEnd;
	}

}