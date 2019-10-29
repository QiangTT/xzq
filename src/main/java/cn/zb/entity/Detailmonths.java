package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Detailmonths implements Serializable {
    private String logouttime;
    private String labip;
    private Integer duration;
    private String year;
    private  String month;

}
