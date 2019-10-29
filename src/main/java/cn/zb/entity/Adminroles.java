package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Adminroles implements Serializable {
    private int id;
    private Integer adminid;
    private Integer roleid;

}
