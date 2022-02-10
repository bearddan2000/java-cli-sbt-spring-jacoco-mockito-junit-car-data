lazy val root = (project in file("."))
  .settings(

  javaOptions in Test += "-Djunit.output.file=" + (target.value / "test-reports/junit.html").getAbsolutePath,

  fork in Test := true,

  testOptions += Tests.Argument(TestFrameworks.JUnit, "--run-listener=example.JUnitListener"),

  // Project name (artifact name in Maven)
  name := "(java-cli-sbt-mockito)",

  // orgnization name (e.g., the package name of the project)
  organization := "example",

  version := "1.0-SNAPSHOT",

  // project description
  description := "Treasure Data Project",

  // Do not append Scala versions to the generated artifacts
  crossPaths := false,

  // This forbids including Scala related libraries into the dependency
  autoScalaLibrary := false,

  libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "junit" % "junit" % "4.12",
  "com.novocode" % "junit-interface" % "0.11" % Test,
   "org.projectlombok" % "lombok" % "1.18.22",
   "org.springframework" % "spring-context" % "5.3.11",
   "org.mockito" % "mockito-all" % "1.9.5",
   // https://mvnrepository.com/artifact/org.junit.platform/junit-platform-launcher
   "org.junit.platform" % "junit-platform-launcher" % "1.8.2" % Test,
   "org.junit.platform" % "junit-platform-engine" % "1.4.2"  % Test,
   "org.junit.jupiter" % "junit-jupiter-engine" % "5.4.2"  % Test,
   "org.junit.jupiter" % "junit-jupiter-api" % "5.4.2" % Test,
   "org.springframework" % "spring-test" % "2.5",
   ),

  mainClass := Some("example.Main")
)
