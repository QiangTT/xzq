package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Bill {
         private Integer id;
         private String userName;
         private String loginName;
         private String year;
         private String month;
         private Double totalFee;

}
