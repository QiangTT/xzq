package cn.zb.utils;

public class PageSupport {
    private Integer pageNo;//当前页
    private Integer pageSize;//页面量
    private Integer totalCont;//总记录数
    private Integer totalPage;//总页数

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCont() {
        return totalCont;
    }

    public void setTotalCont(Integer totalCont) {
        this.totalCont = totalCont;
    }

    public Integer getTotalPage() {
        if(totalCont%pageSize==0){
            return totalCont/pageSize;
        }else {
            return totalCont/pageSize+1;
        }
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
}
