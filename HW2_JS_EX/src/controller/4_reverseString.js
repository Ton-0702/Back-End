// /api/reverse-string/:string
function reverse(req,res){
    const stringParam = req.params.string;
    let reverseString = ""
    // console.log(stringParam[stringParam.length-2]);
    // console.log(-6 > -5);
    for(let i=1; i <= stringParam.length; i++){
        reverseString += stringParam[stringParam.length-i]
        // console.log(reverseString);
    }

    res.json({
        "reverse": reverseString
    })
}

module.exports = {
    reverse,
}