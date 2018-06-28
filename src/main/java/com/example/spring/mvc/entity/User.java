package com.example.spring.mvc.entity;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author hongxing
 * @since 2017-11-14
 */
public class User{
	public User(){
		System.out.println("constructor");
	}

	public static User getUser(){
		System.out.println("factory method");
		return new User();
	}

    private Integer id;
    private String name;
    private String password;
    private Boolean man;
    private Integer age;
    private Boolean student;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getMan() {
		return man;
	}

	public void setMan(Boolean man) {
		this.man = man;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getStudent() {
		return student;
	}

	public void setStudent(Boolean student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", man=" + man +
				", age=" + age +
				", student=" + student +
				'}';
	}
}
