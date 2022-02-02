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

    @Select("SELECT * FROM COSMETIC where sale between 10000 and 19999")
    List<CosmeticDto> findBysale_one();

    @Select("SELECT * FROM COSMETIC where sale between 20000 and 29999")
    List<CosmeticDto> findBysale_two();

    @Select("SELECT * FROM COSMETIC where sale between 30000 and 39999")
    List<CosmeticDto> findBysale_three();

    @Select("SELECT * FROM COSMETIC where sale between 40000 and 49999")
    List<CosmeticDto> findBysale_four();

    @Select("SELECT * FROM COSMETIC where sale between 50000 and 59999")
    List<CosmeticDto> findBysale_five();
}
