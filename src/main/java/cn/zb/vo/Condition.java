package cn.zb.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Condition {
    private String moduleName;
    private String operationName;
    private String roleName;
    private Integer pageNo;//当前页
    private Integer pageSize=5;//页面量

    private Integer pageStart;
    private String name;
    private Double minbasefee;
    private Double maxbasefee;
    private Double minratefee;
    private Double maxratefee;

}
