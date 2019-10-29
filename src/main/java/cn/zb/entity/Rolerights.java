package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rolerights implements Serializable {
    private Integer id;
    private Integer roleId;
    private Integer rightId;
}
