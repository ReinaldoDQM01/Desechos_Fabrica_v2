package Controllers;

import Models.Entities.Productor;
import Models.Repositories.ProductorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reinaldo Quintana
 */
@Controller
public class ProductorController {
    
    private final ProductorRepository repository;
    
    @Autowired
    public  ProductorController(ProductorRepository repository){
        this.repository = repository;
    }
    
    @GetMapping("/Produtor/")
    public String index(Model model) {
        model.addAttribute("productores", repository.findAll());
        return "miVista";
    }
    
    @GetMapping("/Productor/Crear")
    public String NuevoProductor(Model model){
        return "";
    }
    
    @PostMapping("/Productor")
    public void CrearProductor(Productor productor){
        
    }
}
