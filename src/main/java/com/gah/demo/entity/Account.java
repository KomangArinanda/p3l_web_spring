package com.gah.demo.entity;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author Komang Arinanda
 * @since 21/02/18
 */

@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "identity_number")
    private Long identityNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "address")
    private String address;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "branch_Id")
    private Branch branch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
