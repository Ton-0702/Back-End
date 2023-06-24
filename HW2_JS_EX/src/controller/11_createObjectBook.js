// /api/create-book
function createBook (req,res){
    const book = req.body; 
    // const book = { bodyParser;
    res.send(book);
}

module.exports = {
    createBook,
}