//factorial using named function
function factorial(num){
    var sum=1;
    for(var i=1;i<=num;i++)
    {
        sum=i*sum;
    }
    console.log(sum)
}
factorial(6)

console.log('')


//factorial using function expression(anonymous)

var factorial=function(num){
    var sum=1;
    for(var i=1;i<=num;i++)
    {
        sum=sum*i;
    }
    console.log(sum)
}
factorial(5);





//factorial using self invoked function

(function(num)
{
    var sum=1;
    for(var i=1;i<=num;i++)
    {
        sum=sum*i;
    }
    console.log(sum);
})
(4)

// factorial using fat arrow function
var div=(num)=>
{
    var sum=1;
    for(var i=1;i<=num;i++)
    {
        sum=sum*i;
    }
    console.log(sum);
}
div(6)


//fibonacci for named function
var fibonacci =function(n)
{
    var num1=-1;
    var num2=1;
    while(n>0)
    {
        var fibo=num1+num2;
        console.log(fibo)
        num1=num2;
        num2=fibo;
        n--;
    }
}
fibonacci(10)

//fibonacci for anonymous function

var fibonacci=function(num)
    {
        var num1=-1;
        var num2=1;
        while(num>0)
        {
            var fibo=num1+num2;
            console.log(fibo)
            num1=num2;
            num2=fibo;
            num--;
        }
    }
    fibonacci(10);
//fibonacci using self invoked function
(function(num)
{
    var num1=-1;
    var num2=1;
    while(num>0)
    {
        var fibo=num1+num2;
        console.log(fibo)
        num1=num2;
        num2=fibo;
        num--;
    }
}
)
(10);
//fibonacci using fat arrow function

var fibo=(num)=>{
    var num1=-1;
    var num2=1;
    while(num>0)
    {
        var fibo=num1+num2;
        console.log(fibo)
        num1=num2;
        num2=fibo;
        num--;
    }
}
fibo(5)


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




