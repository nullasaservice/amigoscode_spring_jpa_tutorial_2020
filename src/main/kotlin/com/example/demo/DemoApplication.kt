package com.example.demo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoApplication {
	@Bean
	fun commandLineRunner(studentRepository: StudentRepository): CommandLineRunner {
		return CommandLineRunner { _ ->
			val maria = Student("Maria", "Jones", "maria.jones@example.com", 21)

			studentRepository.save(maria)
		}
	}
}

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
