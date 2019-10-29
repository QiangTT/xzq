package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usersbusiness implements Serializable {
    private double id;
    private Double userid;
    private String loginname;
    private String loginpassword;
    private String labip;
    private Double status;
    private Integer priceid;
    private String enrolLdatetime;
    private String closEdatetime;
    private Timestamp LOGINDATETIME;
    private String year;
    private String month;
    private Double time;
    private Double totalFee;
    private String feeName;
    private Double baseFee;


}
