import forcomp.Anagrams._
object obj {
  val w: Word = "abcCbdDDBBa"
  val l = wordOccurrences(w)
  val s: Sentence = List ("hello", "world", "today")
  //dictionaryByOccurrences.foreach(println)
  //combinations(List(('a', 2), ('b', 2)) ).foreach(println)
  val m: Map[Int, Int] = Map()
  occurrencesToMap(List(('a', 2), ('b', 2)) )


}