package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import kotlin.collections.EmptyList;
import org.jetbrains.kotlin.config.LanguageVersion;
import org.junit.jupiter.api.Test;

class CliArgsDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link CliArgs}
  *   <li>{@link CliArgs#setAllRules(boolean)}
  *   <li>{@link CliArgs#setBasePath(Path)}
  *   <li>{@link CliArgs#setBaseline(Path)}
  *   <li>{@link CliArgs#setBuildUponDefaultConfig(boolean)}
  *   <li>{@link CliArgs#setClasspath(String)}
  *   <li>{@link CliArgs#setConfig(String)}
  *   <li>{@link CliArgs#setConfigResource(String)}
  *   <li>{@link CliArgs#setCreateBaseline(boolean)}
  *   <li>{@link CliArgs#setDebug(boolean)}
  *   <li>{@link CliArgs#setDisableDefaultRuleSets(boolean)}
  *   <li>{@link CliArgs#setExcludes(String)}
  *   <li>{@link CliArgs#setGenerateConfig(boolean)}
  *   <li>{@link CliArgs#setHelp(boolean)}
  *   <li>{@link CliArgs#setIncludes(String)}
  *   <li>{@link CliArgs#setInput(String)}
  *   <li>{@link CliArgs#setJdkHome(Path)}
  *   <li>{@link CliArgs#setJvmTarget(String)}
  *   <li>{@link CliArgs#setLanguageVersion(LanguageVersion)}
  *   <li>{@link CliArgs#setMaxIssues(Integer)}
  *   <li>{@link CliArgs#setParallel(boolean)}
  *   <li>{@link CliArgs#setPlugins(String)}
  *   <li>{@link CliArgs#setRunRule(String)}
  *   <li>{@link CliArgs#setShowVersion(boolean)}
  *   <li>{@link CliArgs#setAutoCorrect(boolean)}
  *   <li>{@link CliArgs#getAllRules()}
  *   <li>{@link CliArgs#getAutoCorrect()}
  *   <li>{@link CliArgs#getBasePath()}
  *   <li>{@link CliArgs#getBaseline()}
  *   <li>{@link CliArgs#getJdkHome()}
  *   <li>{@link CliArgs#getBuildUponDefaultConfig()}
  *   <li>{@link CliArgs#getClasspath()}
  *   <li>{@link CliArgs#getConfig()}
  *   <li>{@link CliArgs#getConfigResource()}
  *   <li>{@link CliArgs#getCreateBaseline()}
  *   <li>{@link CliArgs#getDebug()}
  *   <li>{@link CliArgs#getDisableDefaultRuleSets()}
  *   <li>{@link CliArgs#getExcludes()}
  *   <li>{@link CliArgs#getGenerateConfig()}
  *   <li>{@link CliArgs#getHelp()}
  *   <li>{@link CliArgs#getIncludes()}
  *   <li>{@link CliArgs#getInput()}
  *   <li>{@link CliArgs#getJvmTarget()}
  *   <li>{@link CliArgs#getLanguageVersion()}
  *   <li>{@link CliArgs#getMaxIssues()}
  *   <li>{@link CliArgs#getParallel()}
  *   <li>{@link CliArgs#getPlugins()}
  *   <li>{@link CliArgs#getRunRule()}
  *   <li>{@link CliArgs#getShowVersion()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    CliArgs actualCliArgs = new CliArgs();
    actualCliArgs.setAllRules(true);
    Path basePath = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    actualCliArgs.setBasePath(basePath);
    Path baseline = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    actualCliArgs.setBaseline(baseline);
    actualCliArgs.setBuildUponDefaultConfig(true);
    actualCliArgs.setClasspath("Classpath");
    actualCliArgs.setConfig("Config");
    actualCliArgs.setConfigResource("Config Resource");
    actualCliArgs.setCreateBaseline(true);
    actualCliArgs.setDebug(true);
    actualCliArgs.setDisableDefaultRuleSets(true);
    actualCliArgs.setExcludes("Excludes");
    actualCliArgs.setGenerateConfig(true);
    actualCliArgs.setHelp(true);
    actualCliArgs.setIncludes("Includes");
    actualCliArgs.setInput("Input");
    Path jdkHome = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    actualCliArgs.setJdkHome(jdkHome);
    actualCliArgs.setJvmTarget("Jvm Target");
    actualCliArgs.setLanguageVersion(LanguageVersion.KOTLIN_1_0);
    actualCliArgs.setMaxIssues(3);
    actualCliArgs.setParallel(true);
    actualCliArgs.setPlugins("Plugins");
    actualCliArgs.setRunRule("Run Rule");
    actualCliArgs.setShowVersion(true);
    actualCliArgs.setAutoCorrect(true);

    // Assert
    assertTrue(actualCliArgs.getAllRules());
    assertTrue(actualCliArgs.getAutoCorrect());
    Path basePath2 = actualCliArgs.getBasePath();
    assertSame(basePath, basePath2);
    Path baseline2 = actualCliArgs.getBaseline();
    assertEquals(baseline2, basePath2);
    Path jdkHome2 = actualCliArgs.getJdkHome();
    assertEquals(jdkHome2, basePath2);
    assertSame(baseline, baseline2);
    assertEquals(basePath, baseline2);
    assertEquals(jdkHome2, baseline2);
    assertTrue(actualCliArgs.getBuildUponDefaultConfig());
    assertEquals("Classpath", actualCliArgs.getClasspath());
    assertEquals("Config", actualCliArgs.getConfig());
    assertEquals("Config Resource", actualCliArgs.getConfigResource());
    assertTrue(actualCliArgs.getCreateBaseline());
    assertTrue(actualCliArgs.getDebug());
    assertTrue(actualCliArgs.getDisableDefaultRuleSets());
    assertEquals("Excludes", actualCliArgs.getExcludes());
    assertTrue(actualCliArgs.getGenerateConfig());
    assertTrue(actualCliArgs.getHelp());
    assertEquals("Includes", actualCliArgs.getIncludes());
    assertEquals("Input", actualCliArgs.getInput());
    assertSame(jdkHome, jdkHome2);
    assertEquals(basePath, jdkHome2);
    assertEquals(baseline, jdkHome2);
    assertEquals("Jvm Target", actualCliArgs.getJvmTarget());
    assertEquals(LanguageVersion.KOTLIN_1_0, actualCliArgs.getLanguageVersion());
    assertEquals(3, actualCliArgs.getMaxIssues().intValue());
    assertTrue(actualCliArgs.getParallel());
    assertEquals("Plugins", actualCliArgs.getPlugins());
    assertEquals("Run Rule", actualCliArgs.getRunRule());
    assertTrue(actualCliArgs.getShowVersion());
  }

  /**
   * Method under test: default or parameterless constructor of {@link CliArgs}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    CliArgs actualCliArgs = new CliArgs();

    // Assert
    assertTrue(actualCliArgs.getReportPaths() instanceof EmptyList);
    assertEquals("1.8", actualCliArgs.getJvmTarget());
    assertEquals(1, actualCliArgs.getInputPaths().size());
  }

  /**
   * Method under test: {@link CliArgs#getInputPaths()}
   */
  @Test
  void testGetInputPaths() {
    // Arrange, Act and Assert
    assertEquals(1, (new CliArgs()).getInputPaths().size());
  }

  /**
   * Method under test: {@link CliArgs#getReportPaths()}
   */
  @Test
  void testGetReportPaths() {
    // Arrange and Act
    List<ReportPath> actualReportPaths = (new CliArgs()).getReportPaths();

    // Assert
    assertSame(((EmptyList) actualReportPaths).INSTANCE, actualReportPaths);
    assertTrue(actualReportPaths.isEmpty());
  }
}

