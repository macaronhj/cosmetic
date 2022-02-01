package com.example.cosmetic.mapper;

import com.example.cosmetic.dto.CosmeticDto;
import com.example.cosmetic.dto.StoreDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

@Mapper
public interface StoreMapper {
    @Insert("INSERT INTO STORE(S_SEQ, NAME, LOCATION) VALUES (S_SEQ.NEXTVAL,#{name},#{location})")
    int createStore(String name, String location);

    @Select("SELECT * FROM STORE")
    List<StoreDto> findCosAll();

    @Select("SELECT * FROM STORE where s_seq = #{s_seq}")
    StoreDto findById(Long s_seq);
}
