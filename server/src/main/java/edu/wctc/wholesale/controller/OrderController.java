package edu.wctc.wholesale.controller;

import edu.wctc.wholesale.repos.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
    @Autowired
    private WholesaleOrderRepository wholesaleOrderRepository;

    @RequestMapping("/")
    public String showOrderPage(Model model) {
        model.addAttribute("orderList", wholesaleOrderRepository.findAll());
        return "index";

    }
}
