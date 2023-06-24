// /api/max-number?array=[1,2,3,4,5]
function checkMaxNumberArray(req,res){
    const {array} = req.body;
    // console.log(array[0]);
    let maxN = array[0]
    for(let i=0 ; i< array.length; i++){
        if (array[i] > maxN){
            maxN = array[i];
        }
    }
    res.json({
        "maxValue": maxN
    })
}

module.exports = {
    checkMaxNumberArray,
}