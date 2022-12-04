package com.blogspot.jvalentino.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * <p>A basic gradle plugin.</p>
 * @author jvalentino2
 */
@SuppressWarnings(['Println', 'DuplicateStringLiteral', 'NestedBlockDepth'])
class CustomJacocoPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.configure(project) {
            apply plugin:'jacoco'

            afterEvaluate {
                jacocoTestReport {
                    doFirst {
                        classDirectories = classDirectories.collect {
                            fileTree(it) { exclude '**/*$*_closure*' }
                        }.sum()
                    }
                    reports {
                        xml.enabled true
                        csv.enabled false
                        html.enabled true
                    }
                }

                jacocoTestCoverageVerification {
                    doFirst {
                        classDirectories = classDirectories.collect {
                            fileTree(it) { exclude '**/*$*_closure*' }
                        }.sum()
                    }
                }
            }
        }
    }
}
