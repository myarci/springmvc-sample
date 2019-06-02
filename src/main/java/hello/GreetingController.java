package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greetingNew")
    public String greetingNew(@RequestParam(name="name", required=false, defaultValue="WorldNew") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greetingNewest")
    public String greetingNewest(@RequestParam(name="name", required=false, defaultValue="WorldNewest") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greetingNewNew")
    public String greetingNewNew(@RequestParam(name="name", required=false, defaultValue="WorldNewNew") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greeting2")
    public String greeting2(@RequestParam(name="name", required=false, defaultValue="World2") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping("/greetingNewNew234")
    public String greetingNewNew234(@RequestParam(name="name", required=false, defaultValue="WorldNewNew234") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
