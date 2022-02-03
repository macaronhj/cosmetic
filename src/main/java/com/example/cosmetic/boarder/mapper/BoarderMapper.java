package com.example.cosmetic.boarder.mapper;

import com.example.cosmetic.boarder.dto.BoarderDto;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BoarderMapper {
    @Select("SELECT * FROM COSMETIC")
    List<BoarderDto> boarder();

    @Insert("INSERT INTO COSMETIC(SEQ, NAME, COUNT, COMPANY, SALE) VALUES (SEQ.NEXTVAL,#{name},#{count},#{company},#{sale})")
    int registerRequest(String name, int count, String company, Long sale);

    @Delete("DELETE FROM COSMETIC WHERE seq = #{seq}")
    int delete(Long seq);

    @Select("SELECT * FROM COSMETIC where seq = #{seq}")
    BoarderDto update1(Long seq);

    @Update("UPDATE COSMETIC SET NAME=#{name}, COUNT=#{COUNT}, COMPANY=#{company}, SALE=#{sale} WHERE seq = #{seq}")
    int update2(Long seq);
}
