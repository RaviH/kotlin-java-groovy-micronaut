package hello.world.kotlin.example.client

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import io.micronaut.http.client.annotation.Client


@Client("\${hello.world.url}")
interface HelloWorldClient {

    @Get("/hello")
    fun hello(@QueryValue("name") name: String): String
}
