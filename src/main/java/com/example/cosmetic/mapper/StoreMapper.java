package com.example.cosmetic.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface StoreMapper {
    @Insert("INSERT INTO STORE(S_SEQ, NAME, LOCATION) VALUES (S_SEQ.NEXTVAL,#{name},#{location})")
    int createStore(String name, String location);

}
