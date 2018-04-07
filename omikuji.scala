import scala.util.Random

object Omikuji {
    def main(args: Array[String]): Unit = {
        val r = new Random
        val num = r.nextInt(5) + 1
        val omikuji =
            if (num == 1) s"大吉"
            else if (num == 2) s"中吉"
            else if (num == 3) s"小吉"
            else if (num == 4) s"吉"
            else if (num == 5) s"凶"
            else s"大凶"
        println(omikuji)
    }
}
