package com.example.cosmetic.service;

import com.example.cosmetic.dto.CosmeticDto;
import com.example.cosmetic.mapper.CosMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CosService {

    private final SqlSessionFactory sqlSessionFactory;
    private final CosMapper cosMapper;

    public CosmeticDto findCos(Long seq){
        return cosMapper.findById(seq);
    }
}
