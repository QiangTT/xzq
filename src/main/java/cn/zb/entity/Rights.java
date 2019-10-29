package cn.zb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rights implements Serializable {
    private int id;
    private String name;
    private String url;
    private Modules module;
    private Operations operation;

    public Rights(String name, String url) {
        this.name = name;
        this.url = url;
    }
}
