package fuel.orderservice.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class FuelRegisterController {


    @PostMapping("/echo")
    public String registerFuelStation(){

        return "Registered Successfully";
    }
}
