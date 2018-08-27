package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MemVoJPA
 *
 * @author Aerin
 */
@Entity // @Entity告訴Spring這是數據模型層的宣告
@Table(name = "mem") // @table 的name對映到資料庫中的資料表名稱
public class MemVoJPA {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", length = 11)
	private int id;
	@Column(name = "EMAIL", length = 40) // @Column對應到Table的欄位中的欄位名稱
	private String email;
	@Column(name = "CELLPHONE", length = 45)
	private String cellphone;
	@Column(name = "PASSWORD", length = 45)
	private String password;
	@Column(name = "ADDRESS", length = 45)
	private String address;
//	@Column(name="create_date")
//	date create_date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
