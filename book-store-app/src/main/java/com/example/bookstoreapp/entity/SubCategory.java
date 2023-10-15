
package com.example.bookstoreapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Data
@Entity
public class SubCategory{

    @Id
    private Long sub_id;
    private String subCategoryName;
    private String optionalDesc;
    

    @ManyToOne
    @JoinColumn(name="category_Id", nullable=false)
    private Category categId;



}