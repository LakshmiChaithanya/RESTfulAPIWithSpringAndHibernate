package com.analytics.dto;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "userId")
	private Integer userId;

	@Column(name = "datakey")
	private String datakey;

	@Column(name = "datakey2")
	private int datakey2;

	@Column(name = "browser")
	private String browser;

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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDatakey() {
		return datakey;
	}

	public void setDatakey(String datakey) {
		this.datakey = datakey;
	}

	public int getDatakey2() {
		return datakey2;
	}

	public void setDatakey2(int datakey2) {
		this.datakey2 = datakey2;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

}
