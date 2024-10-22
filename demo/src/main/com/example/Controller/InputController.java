import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class InputController {

    public String displayMsg() {
        return "welcome on-board";
    }

}
