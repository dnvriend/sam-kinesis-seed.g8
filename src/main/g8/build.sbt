
lazy val `$name$` = (project in file("."))
  .settings(
	libraryDependencies += "com.github.dnvriend" %% "sam-annotations" % "1.0.6",
    libraryDependencies += "com.github.dnvriend" %% "sam-lambda" % "1.0.6",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.2.0",
    libraryDependencies += "com.amazonaws" % "aws-java-sdk-kinesis" % "1.11.255",
    libraryDependencies += "com.fasterxml.jackson.dataformat" % "jackson-dataformat-cbor" % "2.9.3",
    resolvers += Resolver.bintrayRepo("dnvriend", "maven"),
    scalaVersion := "2.12.4",
	  samStage := "$stage$",
    organization := "$organization$",
    description := "simple sam component with kinesis stream"
  )