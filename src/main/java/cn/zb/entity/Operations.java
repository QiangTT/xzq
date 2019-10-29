package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Operations implements Serializable {
    private int id;
    private String name;
}
