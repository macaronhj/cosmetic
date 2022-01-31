package com.example.cosmetic.mapper;

import com.example.cosmetic.dto.CosmeticDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CosMapper {

    @Select("SELECT * FROM COSMETIC")
    List<CosmeticDto> findAll();

    @Select("SELECT * FROM COSMETIC where seq = #{seq}")
    CosmeticDto findById(Long seq);

    @Insert("INSERT INTO COSMETIC(SEQ, NAME, COUNT, COMPANY, SALE) VALUES (SEQ.NEXTVAL,#{name},#{count},#{company},#{sale})")
    int createCos(String name, int count, String company, Long sale);
}
