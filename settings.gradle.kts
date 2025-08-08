rootProject.name = "NubePlugins"

// Este archivo indical los proyectos incluidos
// Todos lo proyectos nuevos serán inluido automáticamente a no ser que se especifique en la variable "disbled".

val disabled = listOf<String>()

File(rootDir, ".").eachDir { dir ->
    if (!disabled.contains(dir.name) && File(dir, "build.gradle.kts").exists()) {
        include(dir.name)
    }
}

fun File.eachDir(block: (File) -> Unit) {
    listFiles()?.filter { it.isDirectory }?.forEach { block(it) }
}

// Plugins are included like this
// include("PluginName")
