package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val array = arrayListOf<String>()

        for (i in 0 until inputString.length) {
            if (inputString[i] == '<') {
                val startLine = inputString.substring(i + 1)
                val endLine = searchIndex(startLine, inputString[i], '>')?.let { startLine.substring(0, it) }
                array.add(endLine.toString())
            }
            if (inputString[i] == '(') {
                val startLine = inputString.substring(i + 1)
                val endLine = searchIndex(startLine, inputString[i], ')')?.let { startLine.substring(0, it) }
                array.add(endLine.toString())
            }
            if (inputString[i] == '[') {
                val startLine = inputString.substring(i + 1)
                val endLine = searchIndex(startLine, inputString[i], ']')?.let { startLine.substring(0, it) }
                array.add(endLine.toString())
            }
        }
        return   array.toTypedArray()
    }

    fun searchIndex(s: String, start: Char, end: Char): Int? {
        var count = 0
        for (i in 0 until s.length) {
            if (s[i] == start) {
                count++
            }
            if (s[i] == end) {
                if (count == 0) {
                    return i
                } else {
                    count--
                }
            }
        }
        return count
    }
}