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
    var  weightedSum: Double = 0.0
    for (i in data.indices) {
        weightedSum  +=   data[i] * weights[i]
    }
    return weightedSum
}
fun applyActivationFunction(weightedSum: Double): Int{
    var result: Int = 0
    if(weightedSum > 1){
        result = 1
    }
    return result
}
fun adjustWeights(data: IntArray, weights: DoubleArray, error: Double, learningRate: Int): DoubleArray{
    val adjustedWeights = DoubleArray(weights.size)
    for (i in weights.indices) {
        adjustedWeights[i] = learningRate * error * data[i] + weights[i]
    }
    return adjustedWeights
}
