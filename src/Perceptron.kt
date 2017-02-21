/**
 * Created by Shantanu Johri on 20-02-2017.
 */
fun main(args: Array<String>){
    println("Kotlin ini")
    val data = arrayOf(
            arrayOf(intArrayOf(0, 0), intArrayOf(0)),
            arrayOf(intArrayOf(0, 1), intArrayOf(0)),
            arrayOf(intArrayOf(1, 0), intArrayOf(0)),
            arrayOf(intArrayOf(1, 1), intArrayOf(1))
    )
    val LEARNINGRATE : Double = 0.05
    val INITIAL_WEIGHTS: DoubleArray = doubleArrayOf(Math.random(), Math.random())


}
fun calculateWeightedSum(data: IntArray, weights: DoubleArray): Double{
    for (i in data.indices) {
        
    }
    return 0.0
}
fun applyActivationFunction(weightedSum: Double): Int{
    return 0
}
fun adjustWeights(data: IntArray, weights: DoubleArray, error: Double): DoubleArray{

}
