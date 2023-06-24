// /api/random-range-number?minv=2&maxv=10

function randomNumber(req,res){
    const {minv, maxv} = req.query;
    console.log(minv, maxv);
    const rand = Math.floor(Math.random() * (Number(maxv) - Number(minv) + 1)) + Number(minv);

    res.json({
        rand,
    })
}

module.exports = {
    randomNumber,
}