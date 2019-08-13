# https://www.hackerrank.com/challenges/ruby-methods-keyword-arguments/problem

def convert_temp(temperature, input_scale:, output_scale: 'Celsius')
  case input_scale.downcase
  when 'fahrenheit'
    return output_scale == 'kelvin' ?
               ((temperature - 32) / 1.8) + 273.15 : (temperature - 32) / 1.8
  when 'celsius'
    return output_scale == 'kelvin' ?
               temperature + 273.15 : (temperature * 1.8) + 32
  when 'kelvin'
    return output_scale == 'celsius' ?
               temperature - 273.15 : (temperature - 273.15) * 1.8
  end
end
