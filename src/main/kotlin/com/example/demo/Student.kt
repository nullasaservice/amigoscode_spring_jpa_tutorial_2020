package com.example.demo

import jakarta.persistence.*

@Entity(name="Student")
data class Student(
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    var id: Long,
    var firstName: String,
    var lastName: String,
    var email: String,
    var age: Int
)