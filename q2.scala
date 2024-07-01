object q2{
    def longStringList(strings: List[String]): List[String] = {
        strings.filter(_.length() > 5)
    }

    def main(args: Array[String]): Unit = {
        val originalList = List("UCSC", "University", "Scala Language", "Ranuga", "UOC")
        val newList = longStringList(originalList)

        println(s"Original List : $originalList")
        println(s"New List : $newList")
    }
}