package hello.world.kotlin.example

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("hello.world.kotlin.example")
                .mainClass(Application.javaClass)
                .start()
    }
}