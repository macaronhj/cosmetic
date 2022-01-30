package com.example.cosmetic.controller;

import com.example.cosmetic.dto.RegisterDto;
import com.example.cosmetic.service.ManageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
@RequiredArgsConstructor
public class ManageController {
    private final ManageService manageService;

    @PostMapping(value = "/createCos")
    public ModelAndView createCos(ModelAndView mv, String name, String company, Long sale){
        log.info("ManageController > createCos 사용자 등록 요청 시작");

        mv.addObject("result", manageService.createCos(name, company, sale));
        mv.setViewName("result.html");
        return mv;
    }
    @PostMapping(value = "/registerCos")
    public ModelAndView registerCos(@RequestBody RegisterDto registerDto, ModelAndView mv) {
        log.info("[ UserController > registerUser 사용자 등록 요청 시작]");

        // 사용자 등록 business 로직 실행 후 결과 바로 받아 모델에 담는다.
        mv.addObject("result",manageService.registerUser(registerDto));
        mv.setViewName("result.html");
        return mv;
    }
}
