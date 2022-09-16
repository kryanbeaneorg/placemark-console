import org.setu.placemark.Placemark
import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

var placemarks = emptyArray<Placemark>()

fun main(args: Array<String>) {
    logger.info {"Launching Placemark Console App"}
    println("Placemark Kotlin App Version 1.0")

    var input: Int
    do {
        input = menu()
        when(input) {
            1 ->
                println("You Chose Add Placemark")
                // addPlacemark()

            2 ->
                println("You Chose Update Placemark")
                // updatePlacemark()

            3 ->
                println("You Chose List All Placemarks")
                // listAllPlacemark()

            0 -> println("Exiting App")
            else -> println("Invalid Option")
        }
        println()
    } while (input != 0)
    logger.info {"Shutting Down Placemark Console App"}
}

fun menu() : Int {
    var option: Int
    var input: String? = null

    println("Main Menu")
    println(" 1. Add Placemark")
    println(" 2. Update Placemark")
    println(" 3. List All Placemarks")
    println("0. Exit")
    println()
    print("Enter an integer: ")
    input = readLine()!!
    option =
        if (input.toIntOrNull() != null && !input.isEmpty())
            input.toInt()
        else
            -9
    return option
}

fun addPlacemark(name: String?, desc: String?, placemarkArray: Array<Placemark>) {
    placemarkArray.plus(Placemark(name, desc))
}

fun updatePlacemark(name: String?, desc: String?, placemarkArray: Array<Placemark>) {
    var updatesPlacemark = Placemark(name, desc)
}

fun listAllPlacemark() {}