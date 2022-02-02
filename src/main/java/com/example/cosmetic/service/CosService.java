package com.example.cosmetic.service;

import com.example.cosmetic.dto.CosmeticDto;
import com.example.cosmetic.mapper.CosMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CosService {

    private final SqlSessionFactory sqlSessionFactory;
    private final CosMapper cosMapper;

    public CosmeticDto findCos(Long seq){
        return cosMapper.findById(seq);
    }

    public List<CosmeticDto> findAll() {
        return cosMapper.findAll();
    }
    public List<CosmeticDto> findBysale_one() {
        return cosMapper.findBysale_one();
    }
    public List<CosmeticDto> findBysale_two() {
        return cosMapper.findBysale_two();
    }
    public List<CosmeticDto> findBysale_three() {
        return cosMapper.findBysale_three();
    }
    public List<CosmeticDto> findBysale_four() {
        return cosMapper.findBysale_four();
    }
    public List<CosmeticDto> findBysale_five() {
        return cosMapper.findBysale_five();
    }
}
