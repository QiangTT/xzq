package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Admins implements Serializable {
    private int id;
    private String name;
    private String loginname;
    private String loginpassword;
    private String phone;
    private String email;
    private Timestamp enrolLdatetime;
}
