package com.duan.cn.controller;

import com.duan.cn.service.UserIndexService;
import com.lyentech.bdc.http.response.ResultEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("/elasticsearch")
public class GoodIndexController {
    @Autowired
    UserIndexService userIndexService;


        @GetMapping("/template")
        public ResultEntity putTemplate()throws IOException {
            userIndexService.putTemplate();
            return ResultEntity.success();
        }

        @DeleteMapping("/delete")
        public ResultEntity deleteIndex(Integer id) throws IOException {
            userIndexService.deleteIndex(id);
            return ResultEntity.success();
        }

        @PostMapping("/create")
        public ResultEntity createIndex() throws IOException {
            userIndexService.createIndex();
            return ResultEntity.success();
        }

        @PostMapping("/insert")
        public ResultEntity insertIndex() throws IOException {
            userIndexService.insertIndex();
            return ResultEntity.success();
        }

        @PutMapping("/update")
        public ResultEntity update(@RequestParam("id") Integer id) throws IOException {
            userIndexService.update(id);
            return ResultEntity.success();
        }

        @GetMapping("/query")
        public ResultEntity query(@RequestParam("keyword") String keyword,@RequestParam("id") Integer id) throws IOException {
            return ResultEntity.success(userIndexService.query(keyword,id));
        }
    }
