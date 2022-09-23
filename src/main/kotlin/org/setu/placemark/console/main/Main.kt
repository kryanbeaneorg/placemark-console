package org.setu.placemark.console.main
import org.setu.placemark.console.controllers.PlacemarkController


fun main(args: Array<String>) {
    val controller = PlacemarkController()
    controller.start()
}