package com.blogspot.jvalentino.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * <p>A basic Task Task.</p>
 * @author jvalentino2
 */
@SuppressWarnings(['Println'])
class HelloTask extends DefaultTask {

    @TaskAction
    void perform() {
        println 'Hello World!!!'
    }
}
