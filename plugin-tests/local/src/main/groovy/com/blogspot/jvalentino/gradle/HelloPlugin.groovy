package com.blogspot.jvalentino.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * <p>A basic gradle plugin.</p>
 * @author jvalentino2
 */
class HelloPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('hello', type:HelloTask)
    }
}
