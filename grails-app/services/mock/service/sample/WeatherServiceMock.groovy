package mock.service.sample

class WeatherServiceMock {

    def env

    def getDescription (cityCode) {

        assert env == 'dev'

        println("cityCode: ${cityCode}")

        return new Weather([descriptionText: '東京の気象概況です'])
    }
}