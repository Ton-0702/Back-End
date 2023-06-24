// /api/rectangle
function rectangle(req,res){
    const rectangle = req.body; 
    // console.log(rectangle);

    const Area = Number(rectangle.ChieuDai) * Number(rectangle.ChieuRong)
    // console.log(Number(rectangle.ChieuDai) * Number(rectangle.ChieuRong));
    res.json({
        Area
    })
}

module.exports = {
    rectangle,
}