// /api/sum-number?valueOne=2&valueTwo=3
function sumNumber(req, res, next){
    const queryObject = req.query;
    if (isNaN(Number(queryObject.valueOne)) || isNaN(Number(queryObject.valueTwo))) {
        return res.status(400).json({
            message: "valueOne and valueTwo must be a Number"
        })
    }
    else{
        const sum = Number(queryObject.valueOne) + Number(queryObject.valueTwo);
        return res.json({
                value: sum
        })
    }
    

}

module.exports = {
    sumNumber,
}
