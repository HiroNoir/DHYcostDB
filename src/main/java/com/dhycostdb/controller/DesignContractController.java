package com.dhycostdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhycostdb.entity.DesignContract;
import com.dhycostdb.service.DesignContractService;

@Controller
@RequestMapping("designcontract")
public class DesignContractController {
    private final DesignContractService service;

    public DesignContractController(DesignContractService service) {
        this.service = service;
    }

    /** 一覧画面を表示 */
    @GetMapping("/list")
    public String getList(Model model) {
        // 全件検索結果をModelに登録
        model.addAttribute("list", service.getDesignContractList());
        return "designcontract/list";
    }

    /** 登録画面を表示 */
    @GetMapping("/add")
    public String create(@ModelAttribute DesignContract contract) {
        return "designcontract/new";
    }

    /** 登録処理 */
    @PostMapping("/add")
    public String add(@Validated DesignContract contract, BindingResult res, Model model) {
        // 登録
        service.saveDesignContract(contract);
        // 一覧画面にリダイレクト
        return "redirect:/designcontract/list";
    }

}
