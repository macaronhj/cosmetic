package com.example.cosmetic.boarder.controller;

import com.example.cosmetic.boarder.service.BoarderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BoarderController {
    private final BoarderService boarderService;

    @GetMapping(value="/boarder")
    public ModelAndView boarder(ModelAndView mv) {
        log.info("BoarderController > boarder  리스트 요청 시작!!");
        mv.addObject("BoarderList", boarderService.boarder());
        mv.setViewName("/boarder/boarderView.html");
        return mv;
    }
    @GetMapping(value = "/boarderRequest")
    public ModelAndView boarderRequest(ModelAndView mv){
        log.info("BoarderController > boarderRequest 화장품 등록 페이지 이동 중 요청");
        mv.setViewName("/boarder/boarderRequest.html");
        return mv;
    }
}
