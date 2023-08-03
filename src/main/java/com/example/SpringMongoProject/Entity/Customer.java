package com.example.SpringMongoProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("customers")
public class Customer {

    @Id
    private String _id;

    private String name;
    private String address;
    private String mobile;
    private String email;
    private String birthdate;
    private String username;
}
