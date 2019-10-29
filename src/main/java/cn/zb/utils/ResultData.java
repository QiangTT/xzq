package cn.zb.utils;

import java.util.List;

public class ResultData {
    private int status;//1：成功  -1：失败
    private String content;//说明
    private  List list;//[{},{}]
    private PageSupport pageSupport;//分页

    public List getList() {
        return list;
    }
    public void setList(List list) {
        this.list = list;
    }
    public PageSupport getPageSupport() {
        return pageSupport;
    }
    public void setPageSupport(PageSupport pageSupport) {
        this.pageSupport = pageSupport;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }



}
