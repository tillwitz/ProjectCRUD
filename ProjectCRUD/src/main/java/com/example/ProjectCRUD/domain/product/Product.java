package com.example.ProjectCRUD.domain.product;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="product") // Tabela product
@Entity(name="product") //Entidade product
@EqualsAndHashCode(of = "id") //Indicar para o Spring a Primary Key
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID) //ID da Tabela, GeneratedValue gerado automaticamente
    private String id;
    private String name;        //ATRIBUTOS DE CRIAÇÃO DA TABELA DO SQL
    private Number price_in_cents;
}
