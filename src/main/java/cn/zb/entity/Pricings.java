package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pricings implements Serializable {
    private static final long serialVersionUID = 0;
    private int Id;
    private String name;
    private Double basefee;
    private Double ratefee;
    private String description;
}
