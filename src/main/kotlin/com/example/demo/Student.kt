package com.example.demo

import jakarta.persistence.*

@Entity(name="Student")
@Table(
    name = "student",
    uniqueConstraints = [
        UniqueConstraint(name = "student_email_unique", columnNames = ["email"])
    ]
)
data class Student(
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    @Column(name = "id", updatable = false)
    var id: Long,

    @Column(name = "first_name", nullable = false, columnDefinition = "TEXT")
    var firstName: String,

    @Column(name = "last_name", nullable = false, columnDefinition = "TEXT")
    var lastName: String,

    @Column(name = "email", nullable = false, columnDefinition = "TEXT")
    var email: String,

    @Column(name = "age")
    var age: Int
)