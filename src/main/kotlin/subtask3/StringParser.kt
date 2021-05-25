package subtask3

import java.util.regex.Pattern

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var arrayList = mutableListOf<String>()
        var array1 = mutableListOf<String>()
        var array2 = mutableListOf<String>()
        var array = arrayOf(String())

        val pattern = Pattern.compile("(?:(?<=\\().+?(?=\\))|(?<=\\[).+?(?=\\]))|(?<=\\<).+?(?=>)")
        val matcher = pattern.matcher(inputString)
        while (matcher.find()) {
            arrayList.add(matcher.group())
        }

        val finalString = java.lang.String.join(" ", arrayList)
        val pattern1 = Pattern.compile("(?:(?<=\\().+?(?=\\))|(?<=\\[).+?(?=\\]))|(?<=\\<).+?(?=>)")
        val matcher1 = pattern1.matcher(finalString)
        while (matcher1.find()) {
            arrayList.add(matcher1.group())
            array1.add(matcher1.group())
        }
        array = arrayList.toTypedArray()
        return array
    }
}
