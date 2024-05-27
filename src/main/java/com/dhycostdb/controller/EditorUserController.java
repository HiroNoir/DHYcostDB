package com.dhycostdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dhycostdb.service.EditorUserService;

@Controller
@RequestMapping("editors")
public class EditorUserController {
    private final EditorUserService service;

    public EditorUserController(EditorUserService service) {
        this.service = service;
    }

    /** 一覧画面を表示 */
    @GetMapping("/list")
    public String getList(Model model) {
        // 全件検索結果をModelに登録
        model.addAttribute("userlist", service.getEditorUserList());
        return "editors/list";
    }

}