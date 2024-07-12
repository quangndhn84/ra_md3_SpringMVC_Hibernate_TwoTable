package ra.crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Categories {
    @Id
    @Column(name = "catalog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int catalogId;
    @Column(name = "catalog_name", columnDefinition = "varchar(100)", nullable = false, unique = true)
    private String catalogName;
    @Column(columnDefinition = "text")
    private String description;
    @Column(name = "catalog_status")
    private boolean status;
    @OneToMany(mappedBy = "catalog")
    private List<Product> listProducts = new ArrayList<>();
}
