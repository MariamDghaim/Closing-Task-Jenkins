package com.fursa.xmltohtml.xmltohtml.controllers;

import com.fursa.xmltohtml.xmltohtml.lib.Table;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;


@RestController
public class tableController {

    @RequestMapping
    public ModelAndView table(Model model) throws IOException {
        Table table = new Table("http://www.ynet.co.il/Integration/StoryRss2.xml");
        model.addAttribute("content",table.getTable());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("table");
        return modelAndView;
    }

}
