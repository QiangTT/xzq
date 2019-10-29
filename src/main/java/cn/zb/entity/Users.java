package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Users implements Serializable {
    private double id;
    private String name;
    private String loginname;
    private String loginpassword;
    private double status;
    private String phone;
    private String email;
    private Timestamp enrolLdatetime;
    private Timestamp closEdatetime;
    private String paymenttype;
    private String career;
    private String nationality;
    private Double sex;
    private String company;
    private String zip;

}
