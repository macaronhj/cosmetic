package com.example.cosmetic.boarder.mapper;

import com.example.cosmetic.boarder.dto.BoarderDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface BoarderMapper {
    @Select("SELECT * FROM COSMETIC")
    List<BoarderDto> boarder();

    @Insert("INSERT INTO COSMETIC(SEQ, NAME, COUNT, COMPANY, SALE) VALUES (SEQ.NEXTVAL,#{name},#{count},#{company},#{sale})")
    int registerRequest(String name, int count, String company, Long sale);
}
