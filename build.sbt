lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion    := "2.12.2",
      scalacOptions   ++= Seq("-Ypartial-unification"),
    )),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.1"
    )
  )
