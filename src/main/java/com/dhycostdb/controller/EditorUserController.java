package com.dhycostdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhycostdb.entity.EditorUser;
import com.dhycostdb.service.EditorUserService;

@Controller
@RequestMapping("editor")
public class EditorUserController {
    private final EditorUserService service;

    public EditorUserController(EditorUserService service) {
        this.service = service;
    }

    /** 一覧画面を表示 */
    @GetMapping("/list")
    public String list(Model model) {
        // 全件検索結果をModelに登録（件数と内容）
        model.addAttribute("listSize", service.findAll().size());
        model.addAttribute("list", service.findAll());
        return "editor/list";
    }

    /** 登録画面を表示 */
    @GetMapping("/add")
    public String create(@ModelAttribute EditorUser user) {
        return "editor/new";
    }

    /** 登録処理 */
    @PostMapping("/add")
    public String add(@Validated EditorUser user, BindingResult res, Model model) {
        // 登録
        service.saveEditorUser(user);
        // 一覧画面にリダイレクト
        return "redirect:/editor/list";
    }

}