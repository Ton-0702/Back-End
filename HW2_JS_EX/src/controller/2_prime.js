// /api/checkprime/:number
function checkPrime(req,res){
    const number = req.params.number;
    const message = `Number ${number} is not Prime`;
    let count =0
    if (number <2){
        return res.send(message);
    }
    else{
        for (let i=1 ; i<= Math.sqrt(number); i++){
            if (number%i == 0){
                count+=1;
            }
        }
        if (count !== 1){
            res.send(message);
        }
        res.send(
            message
        )
    }
}

module.exports = {
    checkPrime,
}