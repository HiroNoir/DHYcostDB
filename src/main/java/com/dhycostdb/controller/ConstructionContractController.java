package com.dhycostdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhycostdb.entity.ConstructionContract;
import com.dhycostdb.service.ConstructionContractService;

@Controller
@RequestMapping("constructioncontract")
public class ConstructionContractController {
    private final ConstructionContractService service;

    public ConstructionContractController(ConstructionContractService service) {
        this.service = service;
    }

    /** 一覧画面を表示 */
    @GetMapping("/list")
    public String list(Model model) {
        // 全件検索結果をModelに登録（件数と内容）
        model.addAttribute("listSize", service.findAll().size());
        model.addAttribute("list", service.findAll());
        return "constructioncontract/list";
    }

    /** 詳細画面を表示 */
    @GetMapping(value = "/list/{id}/")
    public String detail(@PathVariable Integer id, Model model) {
        // 一件検索した結果をModelに登録
        model.addAttribute("constructioncontract", service.findByCcId(id));
        return "constructioncontract/detail";
    }

    /** 登録画面を表示 */
    @GetMapping("/add")
    public String create(@ModelAttribute ConstructionContract contract) {
        return "constructioncontract/new";
    }

    /** 登録処理 */
    @PostMapping("/add")
    public String add(@Validated ConstructionContract contract, BindingResult res, Model model) {
        // 登録
        service.saveConstructionContract(contract);
        // 一覧画面にリダイレクト
        return "redirect:/constructioncontract/list";
    }

}