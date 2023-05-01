package com.dqf.ice.service.impl;

import com.dqf.ice.entity.IceEntity;
import com.dqf.ice.mapper.IceServiceMapper;
import com.dqf.ice.service.IceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class IceServiceImpl implements IceService {
    @Resource
    private IceServiceMapper iceServiceMapper;

    @Override
    public void addIce(IceEntity iceEntity) {
        iceEntity.setId(UUID.randomUUID().toString());
        iceServiceMapper.insertIce(iceEntity);
    }
}
