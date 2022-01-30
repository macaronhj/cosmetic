package com.example.cosmetic.mapper;

import com.example.cosmetic.dto.CosmeticDto;
import com.example.cosmetic.dto.RegisterDto;
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

    @Insert("INSERT INTO COSMETIC(SEQ, NAME, COUNT, COMPANY, SALE) VALUES (SEQ.NEXTVAL,#{NAME},0,#{COMPANY},#{SALE})")
    int registerCos(RegisterDto registerDto);

    @Insert("INSERT INTO COSMETIC(SEQ, NAME, COUNT, COMPANY, SALE) VALUES (SEQ.NEXTVAL,#{NAME},0,#{COMPANY},#{SALE})")
    int createCos(String name, String company, Long sale);
}
