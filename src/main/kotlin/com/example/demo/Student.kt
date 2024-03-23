package com.example.demo

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name="Student")
data class Student(
    @Id
    var id: Long,
    var firstName: String,
    var lastName: String,
    var email: String,
    var age: Int
)