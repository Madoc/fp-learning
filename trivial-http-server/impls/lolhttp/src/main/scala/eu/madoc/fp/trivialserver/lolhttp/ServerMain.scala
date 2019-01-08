package eu.madoc.fp.trivialserver.lolhttp

import lol.http._

object ServerMain {
  import scala.concurrent.ExecutionContext.Implicits.global

  def main(args:Array[String]) {
    Server.listen(8080) {
      case GET at url"/hello" ⇒ Ok("Hello, world!")
    }
  }
}
