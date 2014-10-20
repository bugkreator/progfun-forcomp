import forcomp.Anagrams._
object obj {
   val sentence: Sentence = List("at", "at")
   val occurrences = sentenceOccurrences(sentence)

   /*val subsets = combinations(occurrences)
   for (
      subset <- subsets;
      wordWithOccurrenceSubset <- fullDictionaryByOccurrences(subset);
   //anagram : Sentence <- subtract(occurrences, subset)//sentenceAnagramsHelper(subtract(occurrences, subset))
   ) yield (wordWithOccurrenceSubset, "") //anagram)
*/






   sentenceAnagrams(sentence)
}