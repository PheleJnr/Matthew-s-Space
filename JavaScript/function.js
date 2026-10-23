//nested function

function outerfunction(x){

    function innerfunction(y){
    
        return x + y;
    }
       return innerfunction(5);
    
}
    console.log (outerfunction(2));

//
//
//return as an object function
//
function multiplier(x){

    return function double(y){
    
       
    return x * y;
    }
    
}
//


//Nested function

function outerfunction(){

    function innerfunction(){
    
        console.log("I am Achalugo");
    }
       return innerfunction();
    
}
    (outerfunction());








