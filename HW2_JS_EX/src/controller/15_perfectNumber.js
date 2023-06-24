// /api/perfect-number/:int
function checkPerfectNumber(req,res){
    const number_int = Number(req.params.int);
    // console.log(Math.floor(number_int/2));
    let sum_number = 0;
    for(let unit =1 ; unit<= Math.floor(number_int/2); unit++){
        if (number_int % unit === 0){
            sum_number += unit;
        }
    }

    if (sum_number === number_int){
        return res.send(
            "Perfect Number"
        )
    }

    res.send("Not a Perfect Number")
}

module.exports = {
    checkPerfectNumber,
}