@file:JvmName("CliUsage")

package io.gitlab.arturbosch.detekt.cli

import com.beust.jcommander.JCommander
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.writeText

fun main(vararg args: String) {
    writeUsage(Paths.get(args[0]))
}

private fun writeUsage(path: Path) {
    val jcommander = JCommander(CliArgs()).apply { programName = "detekt" }
    path.writeText(
        buildString {
            appendLine("```")
            jcommander.usageFormatter.usage(this)
            appendLine("```")
        }
    )
}
