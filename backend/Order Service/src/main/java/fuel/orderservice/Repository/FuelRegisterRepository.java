package fuel.orderservice.Repository;

import fuel.orderservice.Entity.FuelRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelRegisterRepository extends JpaRepository <FuelRegister,Integer>{
}
