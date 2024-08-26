package ku.cs.restaurant.entity;
/**
 * 6510405334
 * กิตติคุณ บุญต่อยุทธ
 * */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data //auto generate getter/setter
@Entity
public class Restaurant {
    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private double rating;
    private String location;


}
