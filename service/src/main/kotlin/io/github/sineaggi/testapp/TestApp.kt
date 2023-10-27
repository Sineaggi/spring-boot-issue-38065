package io.github.sineaggi.testapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(proxyBeanMethods = false)
open class TestApp

fun main(args: Array<String>) {
    runApplication<TestApp>(*args)
}
