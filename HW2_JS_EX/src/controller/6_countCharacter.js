// /api/count-characters?string=affas&word=a
function countCharcters(req,res){
    const {string, word} = req.query;
    let count = 0;
    // console.log(stringParam[0]);
    for (let i=0 ; i < string.length; i++) {
        if (string[i] === word){
            count+=1
        }
    }
    res.json({
        "count word": count
    })
}

module.exports = {
    countCharcters,
}