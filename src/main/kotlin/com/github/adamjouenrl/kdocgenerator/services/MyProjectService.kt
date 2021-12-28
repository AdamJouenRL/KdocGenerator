package com.github.adamjouenrl.kdocgenerator.services

import com.intellij.openapi.project.Project
import com.github.adamjouenrl.kdocgenerator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
