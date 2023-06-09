package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptDTO;
import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.service.DeptModifyService;
import com.hi.deptspring.deptspring.service.DeptReadService;
import com.hi.deptspring.deptspring.service.DeptRegistService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/dept/modify")
@Log4j2
public class DeptModifyController {


    @Autowired
    private DeptReadService readService;

    @Autowired
    private DeptModifyService modifyService;

    @GetMapping
    public String getModifyForm(
            @RequestParam("no") int deptno,
            Model model
    ) {
        log.info("GET /dept/modify");
        model.addAttribute("dept", readService.getDept(deptno));
        return "/dept/modifyform";

    }

    @PostMapping
    public String modify(
            DeptDTO dto
    ) {
        log.info("POST  /dept/modify");
        log.info("dto");

        modifyService.modifyDept(dto);

        return "redirect:/dept/list";

    }
}
