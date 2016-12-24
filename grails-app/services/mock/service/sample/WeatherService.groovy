package mock.service.sample

import org.springframework.http.HttpStatus

class WeatherService {

    def env
    def restClient
    def url

    def getDescription(cityCode) {

        println("env: ${env}")
        println("url: ${url}")
        println("cityCode: ${cityCode}")

        def response = restClient.get(url) {
            urlVariables([city: cityCode])
        }

        assert response.statusCode == HttpStatus.OK

        println(response.json.description.text)

        return new Weather([descriptionText: response.json.description.text])
    }
}