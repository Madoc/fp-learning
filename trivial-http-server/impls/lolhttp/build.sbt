scalaVersion := "2.12.8"

lazy val lolHttpTrivialServer = (project in file (".")).settings(
  libraryDependencies ++= Seq(
    "com.criteo.lolhttp" %% "lolhttp" % "0.12.0"
  )
)
