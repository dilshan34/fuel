package fuel.orderservice.Controller;


import fuel.orderservice.Entity.FuelRegister;
import fuel.orderservice.Service.FuelRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuelRegisterController {

    @Autowired
    FuelRegisterService fuelRegisterService;

    @PostMapping("/echo")
    public String registerFuelStation() {
        return "Registered Successfully";
    }

    //Register a fuel station
    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
    public FuelRegister createFuelStation(@RequestBody FuelRegister fuelRegister) {
        return fuelRegisterService.addFuelStation(fuelRegister);
    }

    @RequestMapping(value = "/getStations", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
    public List<FuelRegister> getFuelStations() {
        return fuelRegisterService.getFuelStations();
    }
}
