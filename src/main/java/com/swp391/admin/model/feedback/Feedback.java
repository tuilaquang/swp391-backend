package com.swp391.admin.model.feedback;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.swp391.admin.model.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    @Id
    @SequenceGenerator(
            name = "feedback_sequence",
            sequenceName = "feedback_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "feedback_sequence"
    )
    private Integer id;
    private String description;
    private Integer star;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate postingDate;
    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonBackReference
    @JsonIgnore
    private Product product;
}
