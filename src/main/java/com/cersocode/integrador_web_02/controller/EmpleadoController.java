package com.cersocode.integrador_web_02.controller;

import com.cersocode.integrador_web_02.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author vicec
 */
@Controller
public class EmpleadoController {

    @GetMapping("/")
    public String index(Model model) {
        Empleado empleado = new Empleado();
        model.addAttribute("empleado", empleado);
        return "index";
    }

    @PostMapping("/calcularSueldo")
    public String calcularSueldo(@ModelAttribute("empleado") Empleado empleado, Model model) {
        
        
        return "resultado";
    }
    
    
}
