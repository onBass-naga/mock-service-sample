package mock.service.sample


class WeatherController {

    static responseFormats = ['json', 'xml']
    //static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def weatherService

    def show() {
        println("id: ${params.id}")
        respond weatherService.getDescription(params.id)
    }

}
