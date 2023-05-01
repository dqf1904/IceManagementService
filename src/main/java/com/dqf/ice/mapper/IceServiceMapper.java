package com.dqf.ice.mapper;

import com.dqf.ice.entity.IceEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IceServiceMapper {
    void insertIce(@Param("iceEntity") IceEntity iceEntity);
}
