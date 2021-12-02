package com.stanroy.kotlinspring.repo

import com.stanroy.kotlinspring.model.Article
import com.stanroy.kotlinspring.model.User
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.data.repository.findByIdOrNull

@DataJpaTest
class RepositoriesTests @Autowired constructor(
    val entityManager: TestEntityManager,
    val userRepository: UserRepository,
    val articleRepository: ArticleRepository
) {

    @Test
    fun `When findByIdOrNull then return Article`() {
        val bob = User("bob321", "Bob", "Bobbed", "lulw")
        entityManager.persist(bob)

        val article = Article("Spring Framework 5.0 goes GA", "Dear Spring community ...", "Lorem ipsum", bob)
        entityManager.persist(article)

        // sync
        entityManager.flush()

        val found = articleRepository.findByIdOrNull(article.id!!)

        assertThat(found).isEqualTo(article)

        println("FOUND: ")
        println("${found.toString()}")

    }
}