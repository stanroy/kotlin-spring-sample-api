package com.stanroy.kotlinspring.repo

import com.stanroy.kotlinspring.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {
    fun findByLogin(login: String): User?
}