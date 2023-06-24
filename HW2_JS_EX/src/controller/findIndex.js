// /api/findindex-string?string=sd&index=3
function findIndex(req,res){
    const {string, index} = req.query;
    const value = string[index-1]
    console.log(value);
    if (value === undefined){
        return res.send("Index out of range string");
    }
    res.send(value)
}

module.exports = {
    findIndex,
}