//named function
function circumtance(r){
    console.log('circumtance is ', 2*3.14*r);
}
circumtance(7);

//anonymous function
let circum = function(r){
    console.log('circumtance is ', 2*3.14*r);
    return 2*3.14*r;
}
let value = circum(10);

//self invoked
(function(r){
    console.log('circumtance is', 2*3.14*r);
})
(20)

//fat arrow

let circumt = r =>
console.log('circumtance is ', 2*3.14*r);
circum(10);


