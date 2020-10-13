package com.xiao.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @date 10/13/2020 17:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long Id;

    private String name;

    private String password;

    private Integer age;

    private String sex;

    private String address;

    private String phone;
}
