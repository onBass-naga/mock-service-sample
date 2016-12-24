import grails.plugins.rest.client.RestBuilder
import grails.util.Environment
import mock.service.sample.WeatherService
import mock.service.sample.WeatherServiceMock

// Place your Spring DSL code here
beans = {

    switch(Environment.current) {
        case Environment.PRODUCTION:
            weatherService(WeatherService) {
                env = "prod"
                restClient = new RestBuilder()
                url = 'http://weather.livedoor.com/forecast/webservice/json/v1?city={city}'
            }
            break

        case Environment.DEVELOPMENT:
            weatherService(WeatherServiceMock) {
                env = "dev"
            }
            break
    }
}
