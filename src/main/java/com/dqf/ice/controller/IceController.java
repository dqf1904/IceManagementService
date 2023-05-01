package com.dqf.ice.controller;

import com.dqf.ice.entity.IceEntity;
import com.dqf.ice.service.IceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/ice")
@RestController
public class IceController {
    @Resource
    private IceService iceService;

    /**
     * 新增冰箱
     *
     * @param iceEntity iceEntity
     */
    @PostMapping("/add")
    public void InsertIce(@RequestBody IceEntity iceEntity) {
        iceService.addIce(iceEntity);
    }
}
