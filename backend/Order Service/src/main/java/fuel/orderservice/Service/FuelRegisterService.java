package fuel.orderservice.Service;

import fuel.orderservice.Entity.FuelRegister;
import fuel.orderservice.Repository.FuelRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuelRegisterService {

    @Autowired
    FuelRegisterRepository fuelRegisterRepository;

    public FuelRegister addFuelStation(FuelRegister fuelRegister){
        return fuelRegisterRepository.save(fuelRegister);
    }
}
