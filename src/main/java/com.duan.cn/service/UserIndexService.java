package com.duan.cn.service;

import com.duan.cn.entity.GoodsIndex;
import java.io.IOException;
import java.util.List;

public interface UserIndexService {
    void putTemplate()throws IOException;

    void deleteIndex(Integer id) throws IOException;

    void createIndex() throws IOException;

    void insertIndex() throws IOException;

    void update(Integer id) throws IOException;

    List<GoodsIndex> query(String keyword, Integer id) throws IOException;
}
