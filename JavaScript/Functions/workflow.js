function first(callback){
    setTimeout(function(){
    console.log('first function executed')
    callback();
    },0)

    //console.log('executed');
}

function second(){
    console.log('second function executed')
}
//callback function
first(second)

