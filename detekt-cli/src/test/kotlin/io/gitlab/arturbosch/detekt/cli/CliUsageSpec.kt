package io.gitlab.arturbosch.detekt.cli

import io.github.detekt.test.utils.createTempFileForTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.io.path.absolute
import kotlin.io.path.readText

internal class CliUsageSpec {

    @Test
    fun `prints the correct cli-options_md`() {
        val cliOptionsFile = createTempFileForTest("cli-usage", ".md")
        main(cliOptionsFile.absolute().toString())
        val string = cliOptionsFile.readText()

        assertThat(string).startsWith("```")
        assertThat(string).endsWith("```\n")
        assertThat(string).contains("Usage: detekt [options]")
        assertThat(string).contains("--input, -i")
    }
}
