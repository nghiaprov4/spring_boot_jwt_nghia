package com.example.spring_boot_jwt_nghia.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "table_token")
@Getter
@Setter
public class Token extends BaseEntity {
    @Column(length = 1000)
    private String token;

    private Date tokenExDate;
}
