package com.github.gunax.fsmeditor.services

import com.intellij.openapi.project.Project
import com.github.gunax.fsmeditor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
