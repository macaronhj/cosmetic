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
    public ModelAndView createCos(ModelAndView mv, String name, int count, String company, Long sale) {
        log.info("ManageController > createCos 사용자 등록 요청 시작");

        mv.addObject("result", manageService.createCos(name, count, company, sale));
        mv.setViewName("result.html");
        return mv;
    }
}
