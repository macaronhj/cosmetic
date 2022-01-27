package com.example.cosmetic.mapper;

import com.example.cosmetic.dto.CosmeticDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CosMapper {

    @Select("SELECT * FROM USERS")
    List<CosmeticDto> findAll();

    @Select("SELECT * FROM COSMETIC where seq = #{seq}")
    CosmeticDto findById(Long seq);

}
