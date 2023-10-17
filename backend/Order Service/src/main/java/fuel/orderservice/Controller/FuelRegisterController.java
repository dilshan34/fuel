package fuel.orderservice.Controller;


import fuel.orderservice.Entity.FuelRegister;
import fuel.orderservice.Service.FuelRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FuelRegisterController {

    @Autowired
    FuelRegisterService fuelRegisterService;

    @PostMapping("/echo")
    public String registerFuelStation() {
        return "Registered Successfully";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST,consumes = {"application/json"},produces = {"application/json"})
    public FuelRegister createFuelStation(@RequestBody FuelRegister fuelRegister){
        return fuelRegisterService.addFuelStation(fuelRegister);
    }
}
