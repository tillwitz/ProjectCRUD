package com.example.ProjectCRUD.domain.product;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of = "id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
}
