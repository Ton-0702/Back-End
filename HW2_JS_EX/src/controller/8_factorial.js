// /api/factorial/:int
function factorial(req,res){
    const number_fac = Number(req.params.int);
    if (number_fac <=2){
       return res.send({number_fac});
    }

    let result = 1;
    for (let i =2 ; i<=number_fac; i++){
        result *= i;
    }

    res.send({result})
}

module.exports = {
    factorial,
}