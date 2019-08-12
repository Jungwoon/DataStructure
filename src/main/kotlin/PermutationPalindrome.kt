class PermutationPalindrome {

    fun isPermutationOfPalindrome(s: String): Boolean {
        val table = buildCharFrequencyTable(s)
        return checkMacOneOdd(table)
    }

    private fun buildCharFrequencyTable(s: String): Array<Int> {
        val table = Array(Character.getNumericValue('z') - Character.getNumericValue('a') + 1) {0}

        for (c in s.toCharArray()) {
            val x = getCharNumber(c)

            if (x != -1) {
                table[x]++
            }
        }
        return table
    }

    private fun getCharNumber(c: Char): Int {
        val a = Character.getNumericValue('a')
        val z = Character.getNumericValue('z')

        val value = Character.getNumericValue(c)

        return if (value in a..z) value - a
        else -1
    }

    private fun checkMacOneOdd(table: Array<Int>): Boolean {
        var foundOdd = false

        for (count in table) {
            if (count % 2 == 1) {
                if (!foundOdd) {
                    foundOdd = true
                }
                else {
                    return false
                }
            }
        }

        return true
    }

}