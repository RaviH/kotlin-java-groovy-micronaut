/*
 * Copyright 2018, Charter Communications,  All rights reserved.
 */

package hello.world.kotlin.example

import hello.world.kotlin.example.client.HelloWorldClient
import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.Micronaut
import spock.lang.Shared
import spock.lang.Specification

class HelloTest extends Specification {
    @Shared
    ApplicationContext applicationContext

    @Shared
    HelloWorldClient helloWorldClient

    def setupSpec() {
        applicationContext = Micronaut.build().mainClass(Application.class).start()
        helloWorldClient = applicationContext.getBean(HelloWorldClient)
    }

    def cleanupSpec() {
        applicationContext?.stop()
    }

    def "happy path"() {
        expect:
        helloWorldClient.hello("abc") == "hello world abc\n"
    }
}
