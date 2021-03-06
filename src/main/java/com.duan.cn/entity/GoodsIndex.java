package com.duan.cn.entity;

import java.io.Serializable;

public class GoodsIndex implements Serializable {

    private Integer goodsId;

    private String goodsName;

    /**
     * 农贸市场ID
     * */
    private String connet;

    public GoodsIndex() {

    }
    public String getConnet() {
        return connet;
    }

    public void setConnet(String connet) {
        this.connet = connet;
    }
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "GoodsIndex{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", connet='" + connet + '\'' +
                '}';
    }}
