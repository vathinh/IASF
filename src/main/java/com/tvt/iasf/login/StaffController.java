package com.tvt.iasf.login;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/index")
    public String indexPage(Model model) {
        List<Department> departments = departmentRepository.findAll();
        model.addAttribute("departments", departments);
        model.addAttribute("staff", new Staff());
        List<Staff> staffList = staffRepository.findAll();
        model.addAttribute("staffList", staffList);
        return "index";
    }

    @PostMapping("/create-staff")
    public String createStaff(@ModelAttribute Staff staff) {
        staffRepository.save(staff);
        return "redirect:/index";
    }

    @GetMapping("/reset-password/{id}")
    public String resetPassword(@PathVariable("id") int id) {
        staffRepository.findById(id).ifPresent(staff -> {
            staff.setPassword("pass@123");
            staffRepository.save(staff);
        });
        return "redirect:/index";
    }
}

