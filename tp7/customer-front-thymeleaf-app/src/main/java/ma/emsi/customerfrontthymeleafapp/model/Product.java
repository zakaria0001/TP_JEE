package ma.emsi.customerfrontthymeleafapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
}
