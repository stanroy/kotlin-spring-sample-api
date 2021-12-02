package com.stanroy.kotlinspring.config

import com.stanroy.kotlinspring.model.Article
import com.stanroy.kotlinspring.model.User
import com.stanroy.kotlinspring.repo.ArticleRepository
import com.stanroy.kotlinspring.repo.UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {
    @Bean
    fun databaseInitializer(
        userRepository: UserRepository,
        articleRepository: ArticleRepository
    ) = ApplicationRunner {

        val stanroy = userRepository.save(User("stanroy", "stanroy", "stanroy"))
        articleRepository.save(
            Article(
                title = "New ps6 is out",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = stanroy
            )
        )
        articleRepository.save(
            Article(
                title = "LULW has landed",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = stanroy
            )
        )
    }
}