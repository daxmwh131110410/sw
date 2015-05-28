package model;

/**
 * Classname entity. @author MyEclipse Persistence Tools
 */

public class Classname implements java.io.Serializable {

	// Fields

	private Integer classOrder;
	private String className;
	private String classRoom;

	// Constructors

	/** default constructor */
	public Classname() {
	}

	/** full constructor */
	public Classname(Integer classOrder, String className, String classRoom) {
		this.classOrder = classOrder;
		this.className = className;
		this.classRoom = classRoom;
	}

	// Property accessors

	public Integer getClassOrder() {
		return this.classOrder;
	}

	public void setClassOrder(Integer classOrder) {
		this.classOrder = classOrder;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassRoom() {
		return this.classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

}