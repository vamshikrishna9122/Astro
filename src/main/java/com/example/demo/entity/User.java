package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phonenumber", length = 15)
    private String phonenumber;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "gender", length = 10)
    private String gender;

    // Getters and Setters

    @Override
    public String toString() {
        return "User [userid=" + userid + ", username=" + username + ", email=" + email + ", phonenumber=" + phonenumber
                + ", password=" + password + ", gender=" + gender + "]";
    }

    public User() {
    }

    public User(int userid, String username, String email, String phonenumber, String password, String gender) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.phonenumber = phonenumber;
        this.password = password;
        this.gender = gender;
    }

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

    // Getters and setters...
    
}
