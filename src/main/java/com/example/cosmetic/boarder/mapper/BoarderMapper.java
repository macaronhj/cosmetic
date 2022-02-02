package com.example.cosmetic.boarder.mapper;

import com.example.cosmetic.boarder.dto.BoarderDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface BoarderMapper {
    @Select("SELECT * FROM COSMETIC")
    List<BoarderDto> boarder();
}
