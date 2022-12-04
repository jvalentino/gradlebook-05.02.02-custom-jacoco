package com.blogspot.jvalentino.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

import spock.lang.Specification

class CustomJacocoPluginTestSpec extends Specification {

    Project project
    CustomJacocoPlugin plugin

    def setup() {
        project = ProjectBuilder.builder().build()
        plugin = new CustomJacocoPlugin()
    }

    void "test plugin"() {
        when:
        plugin.apply(project)

        then:
        true
    }
}
