fun main() {

    val city = City(getCityName(), getCityTemp())
    println("В городе "+ city.cityName + " сейчас "+ getCityTempConditions(city))
}
