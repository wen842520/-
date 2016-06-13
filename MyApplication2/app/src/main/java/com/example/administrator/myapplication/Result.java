package com.example.administrator.myapplication;

import java.util.List;

/**
 * Created by Administrator on 2016/6/1.
 */
public class Result {

    /**
     * status : 1
     * msg : OK
     * data : [{"id":"2","picurl":"http://imga.mizhai.com/images/2016-05/23/5742a803b02c9","newsid":2217},{"id":"3","picurl":"http://imga.mizhai.com/images/2016-05/13/5735a700c9e91","newsid":0},{"id":"1","picurl":"http://imga.mizhai.com/images/2016-04/19/5715d6c43ca59","newsid":2048},{"id":"22","picurl":"http://imga.mizhai.com/images/2016-05/12/5733e7a9d705b","newsid":2138}]
     */

    private String status;
    private String msg;
    /**
     * id : 2
     * picurl : http://imga.mizhai.com/images/2016-05/23/5742a803b02c9
     * newsid : 2217
     */

    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        private String id;
        private String picurl;
        private int newsid;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPicurl() {
            return picurl;
        }

        public void setPicurl(String picurl) {
            this.picurl = picurl;
        }

        public int getNewsid() {
            return newsid;
        }

        public void setNewsid(int newsid) {
            this.newsid = newsid;
        }
    }

    @Override
    public String toString() {
        return "Result{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
