resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0-SNAPSHOT")


resolvers ++= Seq("naumen releases" at "http://NAUMEN-GP.github.io/maven/releases")

resolvers ++= Seq("naumen snapshots" at "http://NAUMEN-GP.github.io/maven/snapshots")

addSbtPlugin("com.naumen" % "sbt-github-repo" % "0.1.0")