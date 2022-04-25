package kz.aui.cybersec.controllers;

import jakarta.validation.Valid;
import kz.aui.cybersec.dao.CyberDAO;
import kz.aui.cybersec.models.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/infsec")
public class CyberController {
    private final CyberDAO cyberDAO;


    public CyberController(CyberDAO cyberDAO) {
        this.cyberDAO = cyberDAO;
    }

    @GetMapping()
    public String index(Model model) {
        model.addAttribute("securityList", new Security());
        return "infsec/index";
    }

    @PostMapping("/new")
    public String CalcSecurity(@ModelAttribute("securityList") Security security) {
        cyberDAO.save(security);
        return "infsec/show";
    }

    @GetMapping("/res")
    public String result(Model model){
        model.addAttribute("securityList", cyberDAO.test_num());
        return "infsec/result";
    }

}
