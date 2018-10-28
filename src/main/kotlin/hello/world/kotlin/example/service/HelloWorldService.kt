package hello.world.kotlin.example.service

import javax.inject.Singleton

@Singleton
class HelloWorldService {
    fun someServiceMethod(name : String) : String {
        return "$name"
    }
}