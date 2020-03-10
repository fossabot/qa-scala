name := "sample-sbt"

version := "1.0"

// GPL licensed
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.16"

// has vulnerability CVE-2017-5929 -
libraryDependencies += "ch.qos.logback" % "logback-core" % "1.1.1"

// has patch 3.8.2 (intentionally NOT scoped in test) -
libraryDependencies += "junit" % "junit" % "3.8.1"
