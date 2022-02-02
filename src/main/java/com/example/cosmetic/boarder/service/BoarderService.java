package com.example.cosmetic.boarder.service;

import com.example.cosmetic.boarder.dto.BoarderDto;
import com.example.cosmetic.boarder.mapper.BoarderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoarderService {
    private final BoarderMapper boarderMapper;
    public List<BoarderDto> boarder() {
        return boarderMapper.boarder();
    }
}
