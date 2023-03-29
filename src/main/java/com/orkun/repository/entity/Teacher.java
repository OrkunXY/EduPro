package com.orkun.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name="tblStudent")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(unique = true)
    String name;
    String surname;
    Integer number;
    String username;
    String password;
    String avatar;
    String adres;
    Integer age;
    String phoneNumber;
    String description;
    String birthday;
    Boolean isActive;


}
