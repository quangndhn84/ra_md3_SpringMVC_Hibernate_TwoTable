package ra.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.crud.model.Categories;
import ra.crud.service.CategoriesService;
import ra.crud.serviceImp.CategoriesServiceImp;

@Controller
@RequestMapping("/categoriesController")
public class CategoriesController {
    @Autowired
    private CategoriesService categoriesService;

    @GetMapping("/findAll")
    public String findAllCategories(Model model) {
        model.addAttribute("listCategories", categoriesService.findAll());
        return "categories";
    }

    @GetMapping("/initCreate")
    public String initCreateCategories(Model model) {
        model.addAttribute("catalog", new Categories());
        return "newCategories";
    }

    @PostMapping("/create")
    public String createCategories(Categories catalog) {
        boolean result = categoriesService.create(catalog);
        if (result) {
            return "redirect:findAll";
        }
        return "error";
    }

    @GetMapping("/initUpdate")
    public String initUpdateCategories(Model model, int catalogId) {
        Categories catalog = categoriesService.findById(catalogId);
        model.addAttribute("catalog", catalog);
        return "updateCategories";
    }

    @PostMapping("/update")
    public String updateCategories(Categories catalog) {
        boolean result = categoriesService.update(catalog);
        if (result) {
            return "redirect:findAll";
        }
        return "error";
    }

    @GetMapping("/delete")
    public String deleteCategories(int catalogId) {
        boolean result = categoriesService.delete(catalogId);
        if (result) {
            return "redirect:findAll";
        }
        return "error";
    }
}
