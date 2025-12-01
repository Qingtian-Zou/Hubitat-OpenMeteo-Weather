metadata {
    definition (name: "Open-Meteo Weather Driver",
                namespace: "user",
                author: "Jules",
                importUrl: "https://raw.githubusercontent.com/jules/hubitat-drivers/main/OpenMeteo-Weather-Driver.groovy") {

        capability "Sensor"
        capability "TemperatureMeasurement"
        capability "UltravioletIndex"
        capability "Refresh"

        // Day 0
        attribute "weather_code_day0", "STRING"
        attribute "temperature_2m_max_day0", "NUMBER"
        attribute "temperature_2m_min_day0", "NUMBER"
        attribute "apparent_temperature_max_day0", "NUMBER"
        attribute "apparent_temperature_min_day0", "NUMBER"
        attribute "sunrise_day0", "STRING"
        attribute "sunset_day0", "STRING"
        attribute "daylight_duration_day0", "NUMBER"
        attribute "sunshine_duration_day0", "NUMBER"
        attribute "uv_index_max_day0", "NUMBER"
        attribute "uv_index_clear_sky_max_day0", "NUMBER"
        attribute "rain_sum_day0", "NUMBER"
        attribute "showers_sum_day0", "NUMBER"
        attribute "snowfall_sum_day0", "NUMBER"
        attribute "precipitation_sum_day0", "NUMBER"
        attribute "precipitation_hours_day0", "NUMBER"
        attribute "precipitation_probability_max_day0", "NUMBER"
        attribute "wind_speed_10m_max_day0", "NUMBER"
        attribute "wind_gusts_10m_max_day0", "NUMBER"
        attribute "wind_direction_10m_dominant_day0", "NUMBER"
        attribute "shortwave_radiation_sum_day0", "NUMBER"
        attribute "et0_fao_evapotranspiration_day0", "NUMBER"
        // Day 1
        attribute "weather_code_day1", "STRING"
        attribute "temperature_2m_max_day1", "NUMBER"
        attribute "temperature_2m_min_day1", "NUMBER"
        attribute "apparent_temperature_max_day1", "NUMBER"
        attribute "apparent_temperature_min_day1", "NUMBER"
        attribute "sunrise_day1", "STRING"
        attribute "sunset_day1", "STRING"
        attribute "daylight_duration_day1", "NUMBER"
        attribute "sunshine_duration_day1", "NUMBER"
        attribute "uv_index_max_day1", "NUMBER"
        attribute "uv_index_clear_sky_max_day1", "NUMBER"
        attribute "rain_sum_day1", "NUMBER"
        attribute "showers_sum_day1", "NUMBER"
        attribute "snowfall_sum_day1", "NUMBER"
        attribute "precipitation_sum_day1", "NUMBER"
        attribute "precipitation_hours_day1", "NUMBER"
        attribute "precipitation_probability_max_day1", "NUMBER"
        attribute "wind_speed_10m_max_day1", "NUMBER"
        attribute "wind_gusts_10m_max_day1", "NUMBER"
        attribute "wind_direction_10m_dominant_day1", "NUMBER"
        attribute "shortwave_radiation_sum_day1", "NUMBER"
        attribute "et0_fao_evapotranspiration_day1", "NUMBER"
        // Day 2
        attribute "weather_code_day2", "STRING"
        attribute "temperature_2m_max_day2", "NUMBER"
        attribute "temperature_2m_min_day2", "NUMBER"
        attribute "apparent_temperature_max_day2", "NUMBER"
        attribute "apparent_temperature_min_day2", "NUMBER"
        attribute "sunrise_day2", "STRING"
        attribute "sunset_day2", "STRING"
        attribute "daylight_duration_day2", "NUMBER"
        attribute "sunshine_duration_day2", "NUMBER"
        attribute "uv_index_max_day2", "NUMBER"
        attribute "uv_index_clear_sky_max_day2", "NUMBER"
        attribute "rain_sum_day2", "NUMBER"
        attribute "showers_sum_day2", "NUMBER"
        attribute "snowfall_sum_day2", "NUMBER"
        attribute "precipitation_sum_day2", "NUMBER"
        attribute "precipitation_hours_day2", "NUMBER"
        attribute "precipitation_probability_max_day2", "NUMBER"
        attribute "wind_speed_10m_max_day2", "NUMBER"
        attribute "wind_gusts_10m_max_day2", "NUMBER"
        attribute "wind_direction_10m_dominant_day2", "NUMBER"
        attribute "shortwave_radiation_sum_day2", "NUMBER"
        attribute "et0_fao_evapotranspiration_day2", "NUMBER"
        // Day 3
        attribute "weather_code_day3", "STRING"
        attribute "temperature_2m_max_day3", "NUMBER"
        attribute "temperature_2m_min_day3", "NUMBER"
        attribute "apparent_temperature_max_day3", "NUMBER"
        attribute "apparent_temperature_min_day3", "NUMBER"
        attribute "sunrise_day3", "STRING"
        attribute "sunset_day3", "STRING"
        attribute "daylight_duration_day3", "NUMBER"
        attribute "sunshine_duration_day3", "NUMBER"
        attribute "uv_index_max_day3", "NUMBER"
        attribute "uv_index_clear_sky_max_day3", "NUMBER"
        attribute "rain_sum_day3", "NUMBER"
        attribute "showers_sum_day3", "NUMBER"
        attribute "snowfall_sum_day3", "NUMBER"
        attribute "precipitation_sum_day3", "NUMBER"
        attribute "precipitation_hours_day3", "NUMBER"
        attribute "precipitation_probability_max_day3", "NUMBER"
        attribute "wind_speed_10m_max_day3", "NUMBER"
        attribute "wind_gusts_10m_max_day3", "NUMBER"
        attribute "wind_direction_10m_dominant_day3", "NUMBER"
        attribute "shortwave_radiation_sum_day3", "NUMBER"
        attribute "et0_fao_evapotranspiration_day3", "NUMBER"
        // Day 4
        attribute "weather_code_day4", "STRING"
        attribute "temperature_2m_max_day4", "NUMBER"
        attribute "temperature_2m_min_day4", "NUMBER"
        attribute "apparent_temperature_max_day4", "NUMBER"
        attribute "apparent_temperature_min_day4", "NUMBER"
        attribute "sunrise_day4", "STRING"
        attribute "sunset_day4", "STRING"
        attribute "daylight_duration_day4", "NUMBER"
        attribute "sunshine_duration_day4", "NUMBER"
        attribute "uv_index_max_day4", "NUMBER"
        attribute "uv_index_clear_sky_max_day4", "NUMBER"
        attribute "rain_sum_day4", "NUMBER"
        attribute "showers_sum_day4", "NUMBER"
        attribute "snowfall_sum_day4", "NUMBER"
        attribute "precipitation_sum_day4", "NUMBER"
        attribute "precipitation_hours_day4", "NUMBER"
        attribute "precipitation_probability_max_day4", "NUMBER"
        attribute "wind_speed_10m_max_day4", "NUMBER"
        attribute "wind_gusts_10m_max_day4", "NUMBER"
        attribute "wind_direction_10m_dominant_day4", "NUMBER"
        attribute "shortwave_radiation_sum_day4", "NUMBER"
        attribute "et0_fao_evapotranspiration_day4", "NUMBER"
        // Day 5
        attribute "weather_code_day5", "STRING"
        attribute "temperature_2m_max_day5", "NUMBER"
        attribute "temperature_2m_min_day5", "NUMBER"
        attribute "apparent_temperature_max_day5", "NUMBER"
        attribute "apparent_temperature_min_day5", "NUMBER"
        attribute "sunrise_day5", "STRING"
        attribute "sunset_day5", "STRING"
        attribute "daylight_duration_day5", "NUMBER"
        attribute "sunshine_duration_day5", "NUMBER"
        attribute "uv_index_max_day5", "NUMBER"
        attribute "uv_index_clear_sky_max_day5", "NUMBER"
        attribute "rain_sum_day5", "NUMBER"
        attribute "showers_sum_day5", "NUMBER"
        attribute "snowfall_sum_day5", "NUMBER"
        attribute "precipitation_sum_day5", "NUMBER"
        attribute "precipitation_hours_day5", "NUMBER"
        attribute "precipitation_probability_max_day5", "NUMBER"
        attribute "wind_speed_10m_max_day5", "NUMBER"
        attribute "wind_gusts_10m_max_day5", "NUMBER"
        attribute "wind_direction_10m_dominant_day5", "NUMBER"
        attribute "shortwave_radiation_sum_day5", "NUMBER"
        attribute "et0_fao_evapotranspiration_day5", "NUMBER"
        // Day 6
        attribute "weather_code_day6", "STRING"
        attribute "temperature_2m_max_day6", "NUMBER"
        attribute "temperature_2m_min_day6", "NUMBER"
        attribute "apparent_temperature_max_day6", "NUMBER"
        attribute "apparent_temperature_min_day6", "NUMBER"
        attribute "sunrise_day6", "STRING"
        attribute "sunset_day6", "STRING"
        attribute "daylight_duration_day6", "NUMBER"
        attribute "sunshine_duration_day6", "NUMBER"
        attribute "uv_index_max_day6", "NUMBER"
        attribute "uv_index_clear_sky_max_day6", "NUMBER"
        attribute "rain_sum_day6", "NUMBER"
        attribute "showers_sum_day6", "NUMBER"
        attribute "snowfall_sum_day6", "NUMBER"
        attribute "precipitation_sum_day6", "NUMBER"
        attribute "precipitation_hours_day6", "NUMBER"
        attribute "precipitation_probability_max_day6", "NUMBER"
        attribute "wind_speed_10m_max_day6", "NUMBER"
        attribute "wind_gusts_10m_max_day6", "NUMBER"
        attribute "wind_direction_10m_dominant_day6", "NUMBER"
        attribute "shortwave_radiation_sum_day6", "NUMBER"
        attribute "et0_fao_evapotranspiration_day6", "NUMBER"
        
        // Additional Daily Variables
        attribute "temperature_2m_mean_day0", "NUMBER"
        attribute "apparent_temperature_mean_day0", "NUMBER"
        attribute "precipitation_probability_mean_day0", "NUMBER"
        attribute "precipitation_probability_min_day0", "NUMBER"
        
        attribute "temperature_2m_mean_day1", "NUMBER"
        attribute "apparent_temperature_mean_day1", "NUMBER"
        attribute "precipitation_probability_mean_day1", "NUMBER"
        attribute "precipitation_probability_min_day1", "NUMBER"
        
        attribute "temperature_2m_mean_day2", "NUMBER"
        attribute "apparent_temperature_mean_day2", "NUMBER"
        attribute "precipitation_probability_mean_day2", "NUMBER"
        attribute "precipitation_probability_min_day2", "NUMBER"
        
        attribute "temperature_2m_mean_day3", "NUMBER"
        attribute "apparent_temperature_mean_day3", "NUMBER"
        attribute "precipitation_probability_mean_day3", "NUMBER"
        attribute "precipitation_probability_min_day3", "NUMBER"
        
        attribute "temperature_2m_mean_day4", "NUMBER"
        attribute "apparent_temperature_mean_day4", "NUMBER"
        attribute "precipitation_probability_mean_day4", "NUMBER"
        attribute "precipitation_probability_min_day4", "NUMBER"
        
        attribute "temperature_2m_mean_day5", "NUMBER"
        attribute "apparent_temperature_mean_day5", "NUMBER"
        attribute "precipitation_probability_mean_day5", "NUMBER"
        attribute "precipitation_probability_min_day5", "NUMBER"
        
        attribute "temperature_2m_mean_day6", "NUMBER"
        attribute "apparent_temperature_mean_day6", "NUMBER"
        attribute "precipitation_probability_mean_day6", "NUMBER"
        attribute "precipitation_probability_min_day6", "NUMBER"

        command "poll"
        command "refresh"
    }
}

preferences {
    section("API Configuration") {
        input "latitude", "text", title: "Latitude", required: true, defaultValue: ""
        input "longitude", "text", title: "Longitude", required: true, defaultValue: ""
        input "timezone", "text", title: "Timezone", required: true, defaultValue: ""
        input "pollInterval", "enum", title: "Poll Interval", required: true, defaultValue: "3 Hours", options: ["Manual Poll Only", "15 Minutes", "30 Minutes", "1 Hour", "3 Hours"]
        input "temperatureUnit", "enum", title: "Temperature Unit", required: true, defaultValue: "Fahrenheit", options: ["Fahrenheit", "Celsius"]
        input "windSpeedUnit", "enum", title: "Wind Speed Unit", required: true, defaultValue: "mph", options: ["mph", "kmh"]
    }

    section("Daily Weather Variables") {
        input "get_weather_code", "bool", title: "Weather Code", defaultValue: true
        input "get_temperature_2m_max", "bool", title: "Max Temperature (2m)", defaultValue: true
        input "get_temperature_2m_min", "bool", title: "Min Temperature (2m)", defaultValue: true
        input "get_apparent_temperature_max", "bool", title: "Max Apparent Temperature", defaultValue: false
        input "get_apparent_temperature_min", "bool", title: "Min Apparent Temperature", defaultValue: false
        input "get_sunrise", "bool", title: "Sunrise", defaultValue: true
        input "get_sunset", "bool", title: "Sunset", defaultValue: true
        input "get_daylight_duration", "bool", title: "Daylight Duration", defaultValue: false
        input "get_sunshine_duration", "bool", title: "Sunshine Duration", defaultValue: false
        input "get_uv_index_max", "bool", title: "Max UV Index", defaultValue: true
        input "get_uv_index_clear_sky_max", "bool", title: "Max Clear Sky UV Index", defaultValue: false
        input "get_rain_sum", "bool", title: "Rain Sum", defaultValue: false
        input "get_showers_sum", "bool", title: "Showers Sum", defaultValue: false
        input "get_snowfall_sum", "bool", title: "Snowfall Sum", defaultValue: false
        input "get_precipitation_sum", "bool", title: "Precipitation Sum", defaultValue: false
        input "get_precipitation_hours", "bool", title: "Precipitation Hours", defaultValue: false
        input "get_precipitation_probability_max", "bool", title: "Max Precipitation Probability", defaultValue: true
        input "get_wind_speed_10m_max", "bool", title: "Max Wind Speed (10m)", defaultValue: true
        input "get_wind_gusts_10m_max", "bool", title: "Max Wind Gusts (10m)", defaultValue: true
        input "get_wind_direction_10m_dominant", "bool", title: "Dominant Wind Direction (10m)", defaultValue: true
        input "get_shortwave_radiation_sum", "bool", title: "Shortwave Radiation Sum", defaultValue: false
        input "get_et0_fao_evapotranspiration", "bool", title: "Reference Evapotranspiration (ET₀)", defaultValue: false
        input "get_temperature_2m_mean", "bool", title: "Mean Temperature (2m)", defaultValue: false
        input "get_apparent_temperature_mean", "bool", title: "Mean Apparent Temperature", defaultValue: false
        input "get_precipitation_probability_mean", "bool", title: "Mean Precipitation Probability", defaultValue: false
        input "get_precipitation_probability_min", "bool", title: "Min Precipitation Probability", defaultValue: false
    }
}

def poll() {
    log.debug "Polling Open-Meteo API"

    def dailyVariables = [
        "weather_code", "temperature_2m_max", "temperature_2m_min",
        "apparent_temperature_max", "apparent_temperature_min", "sunrise", "sunset",
        "daylight_duration", "sunshine_duration", "uv_index_max", "uv_index_clear_sky_max",
        "rain_sum", "showers_sum", "snowfall_sum", "precipitation_sum", "precipitation_hours",
        "precipitation_probability_max", "wind_speed_10m_max", "wind_gusts_10m_max",
        "wind_direction_10m_dominant", "shortwave_radiation_sum", "et0_fao_evapotranspiration",
        "temperature_2m_mean", "apparent_temperature_mean", "precipitation_probability_mean", 
        "precipitation_probability_min"
    ]

    def selectedDaily = dailyVariables.findAll { variable -> settings."get_${variable}" }.join(",")

    if (!selectedDaily) {
        log.warn "No daily variables selected. Aborting poll."
        return
    }

    def params = [
        uri: "https://api.open-meteo.com/v1/forecast",
        query: [
            latitude: latitude,
            longitude: longitude,
            timezone: timezone,
            daily: selectedDaily,
            temperature_unit: temperatureUnit.toLowerCase(),
            wind_speed_unit: windSpeedUnit.toLowerCase()
        ]
    ]

    asynchttpGet("pollHandler", params)
}

def pollHandler(resp, data) {
    if (resp.status == 200) {
        try {
            log.debug "Open-Meteo API response: ${resp.data}"
            def json = parseJson(resp.data)

            def daily = json.daily
            if (daily) {
                def tempUnitString = (temperatureUnit == "Fahrenheit") ? "F" : "C"

                for (int day = 0; day < 7; day++) {
                    daily.each { key, values ->
                        if (settings."get_${key}") {
                            def value = values[day]
                            def unit = null
                            if (key.contains("temperature")) {
                                unit = tempUnitString
                            } else if (key.contains("wind_speed") || key.contains("wind_gusts")) {
                                unit = windSpeedUnit
                            }

                            if (key == "weather_code") {
                                value = getWeatherDescription(value)
                            }
                            
                            sendEvent(name: "${key}_day${day}", value: value, unit: unit)
                        }
                    }
                }

                // Standard capabilities
                if (settings.get_temperature_2m_max) {
                    sendEvent(name: "temperature", value: daily.temperature_2m_max[0], unit: tempUnitString)
                }
                if (settings.get_uv_index_max) {
                    sendEvent(name: "ultravioletIndex", value: daily.uv_index_max[0])
                }
            }
        } catch (e) {
            log.error "Error parsing Open-Meteo API response: ${e}"
        }
    } else {
        log.error "Open-Meteo API call failed with status ${resp.status}"
    }
}

def refresh() {
    log.debug "Refreshing Open-Meteo weather data"
    poll()
}

def updated() {
    log.debug "Updating Open-Meteo weather driver"
    unschedule()
    initialize()
}

def initialize() {
    log.debug "Initializing Open-Meteo weather driver"
    poll()

    if (pollInterval != "Manual Poll Only") {
        def cron = ""
        switch (pollInterval) {
            case "15 Minutes":
                cron = "0 0/15 * 1/1 * ? *"
                break
            case "30 Minutes":
                cron = "0 0/30 * 1/1 * ? *"
                break
            case "1 Hour":
                cron = "0 0 0/1 1/1 * ? *"
                break
            case "3 Hours":
                cron = "0 0 0/3 1/1 * ? *"
                break
        }
        schedule(cron, poll)
    }
}

def getWeatherDescription(code) {
    switch (code) {
        case 0: return "Clear sky"
        case 1: return "Mainly clear"
        case 2: return "Partly cloudy"
        case 3: return "Overcast"
        case 45: return "Fog"
        case 48: return "Depositing rime fog"
        case 51: return "Drizzle: Light intensity"
        case 53: return "Drizzle: Moderate intensity"
        case 55: return "Drizzle: Dense intensity"
        case 56: return "Freezing Drizzle: Light intensity"
        case 57: return "Freezing Drizzle: Dense intensity"
        case 61: return "Rain: Slight intensity"
        case 63: return "Rain: Moderate intensity"
        case 65: return "Rain: Heavy intensity"
        case 66: return "Freezing Rain: Light intensity"
        case 67: return "Freezing Rain: Heavy intensity"
        case 71: return "Snow fall: Slight intensity"
        case 73: return "Snow fall: Moderate intensity"
        case 75: return "Snow fall: Heavy intensity"
        case 77: return "Snow grains"
        case 80: return "Rain showers: Slight intensity"
        case 81: return "Rain showers: Moderate intensity"
        case 82: return "Rain showers: Violent intensity"
        case 85: return "Snow showers: Slight intensity"
        case 86: return "Snow showers: Heavy intensity"
        case 95: return "Thunderstorm: Slight or moderate"
        case 96: return "Thunderstorm with slight hail"
        case 99: return "Thunderstorm with heavy hail"
        default: return "Unknown"
    }
}
