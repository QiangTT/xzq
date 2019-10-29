package cn.zb.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Detaildays implements Serializable {
    private String logouttime;
    private String labip;
    private Integer duration;


}
