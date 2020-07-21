class City(
    val cityName: String,
    val cityTemp: Int
)

internal fun getCityName(): String {
    println("Привет! \n Введи название своего города")
    return readLine()?.ifBlank { throw error("Необходимо ввести название города") }!!
}

internal fun getCityTemp(): Int {
    println("Какая температура за бортом?")
    return readLine()?.toIntOrNull() ?: throw error("Введи температуру в градусах")
}

fun getCityTempConditions(city: City): String =
    when (city.cityTemp) {
        in -50..15 -> "холодно"
        in 15..25 -> "нормально"
        in 25..50 -> "жарко"
        else -> "катастрофа"
    }
