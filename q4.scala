object q4{
    def sumOfEvenNumbers(numbers: List[Int]): Int = {
        numbers.filter(_ % 2 == 0).sum
    }

    def main(args: Array[String]): Unit = {
        val inputList = List(32,43,53,77,56,88,45,24,86,55,72)
        val result = sumOfEvenNumbers(inputList)
        println(result) 
    }
}