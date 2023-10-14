
package com.example.bookstoreapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class SubCategory{

    @Id
    private Long sub_id;
    private String subCategoryName;
    private String opionDesc;
    

    @ManyToOne
    @JoinColumn(name="category_FK", nullable=false)
    private Category categId;



}