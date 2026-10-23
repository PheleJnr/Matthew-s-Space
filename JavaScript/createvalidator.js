function createValidator(minLength){
 return function(value){
 
    return value.length >= minLength;
    
    }
    
}

let minLengthValidator = createValidator(5);

console.log(minLengthValidator("Matthew"));
console.log(minLengthValidator("John"));

const farenheitToCelsius = (farenheit) => (farenheit - 32) * 5/9;

const celsiusToFarenheit = (celsius) => (celsius * 9/5) + 32;

function convertTemperature(value, unit, conversionFunction){

    let result = conversionFunction(value);
    console.log(`${value} ${unit} converts to ${result}`);
}

convertTemperature(32, 'Farenheit', farenheitToCelsius);
convertTemperature(0, 'celsius', celsiusToFarenheit);
    
