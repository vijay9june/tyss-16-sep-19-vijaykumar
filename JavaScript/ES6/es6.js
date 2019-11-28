const employees = new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            EmployeName : 'vijay',
            id : 1,
        },
        {
            EmployeName : 'ajay',
            id : 2

        },
    ])
    }else{
        reject('failed')
    }
})
employees.then(function(data){
    console.log('Employe Data',data)
}).catch(function(error){
    console.log('Failure Message',error)
})

//closure
function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10
        return count
    }
    return innerFunction
}


let innerFunc = outerFunction(20)
let counter = innerFunc()
console.log('Counter Value',counter)
