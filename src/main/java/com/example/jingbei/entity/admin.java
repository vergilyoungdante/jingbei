package com.example.jingbei.entity;

import lombok.Data;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name="ausertable")
public class admin {

    @Id
    @Column(length = 50)
    private String aname;

    @Column(length = 50)
    @NotBlank(message = "Not a valid password!")
    private String apwd;

}
