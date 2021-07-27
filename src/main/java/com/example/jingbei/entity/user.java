package com.example.jingbei.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name="busertable")
public class user {
    @Id
    private long id;

    @Column(length = 50)
    @Email(message = "Not a valid email address!")
    private String bemail;

    @Column(length = 50)
    @NotBlank(message = "Not a valid password!")
    private String bpwd;

}
