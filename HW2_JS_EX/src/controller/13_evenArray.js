// /api/even-array
function even(req,res){
    const array = req.body.array;
    let new_array_even = [];
    // console.log(array);
    for (unit in array ){
        if (array[unit] % 2 ==0){
            new_array_even.push(array[unit])
        }
    }

    res.json({
        new_array_even,
    })
}

module.exports = {
    even,
}