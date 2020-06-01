package pl.gren.todospringbootapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.gren.todospringbootapplication.Model.Author;
import pl.gren.todospringbootapplication.Service.AuthorService;

import java.util.List;

@Controller
public class AuthorController {

    @Autowired private AuthorService AuthorService;

    @GetMapping("/")
    public String Authors(Model model)
    {
        List<Author> authors = AuthorService.getAllAuthors();
        model.addAttribute("Authors", authors);
        model.addAttribute("Author", new Author());
        model.addAttribute("Title", "Authors");
        model.addAttribute("isAdd", true);
        return "view/Authors";
    }
}
